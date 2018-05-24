package com.hqhcn.android.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hqh.android.cache.RedisCache;
import com.hqh.android.dao.ExamprocMapper;
import com.hqh.android.entity.Carinfo;
import com.hqh.android.entity.Exampreasign;
import com.hqh.android.entity.Examproc;
import com.hqh.android.entity.ExamprocExample;
import com.hqh.android.service.CarinfoService;
import com.hqh.android.service.ExamProcService;
import com.hqh.android.service.ExamineeService;
import com.hqh.android.service.GpsService;
import com.hqh.android.tool.AttrUtils;
import com.hqh.android.tool.DateTools;
import com.hqh.android.tool.hikvision.DvrPicHelper;
import com.hqh.android.web.InitLoad;
import com.hqh.android.webservice.TmriInvoker;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.map.LinkedMap;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ExamProcServiceImpl implements ExamProcService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ExamprocMapper mapper;

    @Autowired
    GpsService gpsService;

    @Autowired
    RedisCache cache;
    @Autowired
    ExamineeService examineeService;
    @Autowired
    CarinfoService carinfoService;
    @Autowired
    private TmriInvoker tmri;

    @Override
    public List<Examproc> select(ExamprocExample example) {
        return mapper.selectByExample(example);
    }


    @Override
    public void insertSelective(Examproc entity) {
        String jyw = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            // TODO: 2018/1/22 0022 没有序列化
            md.update(entity.toString().getBytes());
            jyw = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        entity.setJyw(jyw);
        mapper.insertSelective(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<Examproc> examproc(String lsh, int kscs) {
        return examproc(lsh, "", "", kscs);
    }

    @Override
    public List<Examproc> examproc(String lsh, String kskm, String ksxm, int kscs) {
        ExamprocExample example = new ExamprocExample();
        ExamprocExample.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(lsh)) {
            criteria.andLshEqualTo(lsh);
        }
        if (-1 != kscs) {
            criteria.andKscsEqualTo(kscs);
        }
        if (StringUtils.isNotEmpty(kskm)) {
            criteria.andKskmEqualTo(kskm);
        }
        if (StringUtils.isNotEmpty(ksxm)) {
            criteria.andKsxmEqualTo(ksxm);
        }

        return select(example);
    }

    @Override
    public Examproc examproc(String lsh, String ksxm, int kscs) {
        List<Examproc> examprocs = examproc(lsh, "", ksxm, kscs);
        return CollectionUtils.isEmpty(examprocs) ? null : examprocs.get(0);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void begin(String lsh, int kscs, String ksxm, String jlcxh, Date kssj, String kskm) {
        // 发六合一
        Carinfo carinfo = carinfoService.query(InitLoad.kcdddh, jlcxh);
        Exampreasign exampreasign = examineeService.queryByLsh(lsh);
        Map<String, String> param = new LinkedMap();
        param.put("lsh", lsh);
        param.put("kskm", kskm);
        param.put("sfzmhm", exampreasign.getSfzmhm());
        param.put("ksxm", ksxm);
        param.put("sbxh", AttrUtils.设备序号.toString());
        param.put("kchp", carinfo.getHphm());
        param.put("kssj", DateTools.getFormatDate(kssj, DateTools.yyyy_MM_dd_HH_mm_ss));
        // TODO: 2017/12/28 0028 六合一以后要恢复
//        Map<String, Object> result = TmriClient.考试项目开始.invoke(param);
//        if (!TmriClient.isOK(result)) {
//            // 六合一 失败
//            logger.error("[" + lsh + "]六合一发送失败," + TmriClient.getMSG(result));
//            throw new RuntimeException("[" + lsh + "]六合一发送失败," + TmriClient.getMSG(result));
//        }

        // 保存数据库
        Examproc proc = new Examproc();
        proc.setLsh(lsh);
        proc.setKscs(kscs);
        proc.setKsxm(ksxm);
        proc.setJlcxh(jlcxh);
        proc.setKssj(kssj);
        proc.setKskm(kskm);
        String picPath = generatePicName(lsh, ksxm, kscs, "begin");
        DvrPicHelper.getPic(jlcxh, ksxm, picPath);
        proc.setPic1(picPath);
        insertSelective(proc);

        // 更新考生考试次数
        exampreasign.setLsh(lsh);
        exampreasign.setKscs(kscs);
        examineeService.updateByPrimaryKeySelective(exampreasign);

        // 加入缓存
        cache.setOneDay(cache.GPSKey(lsh, ksxm, kscs), "");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int end(String lsh, int kscs, String kskm, String jlcxh, Date jssj, int kscj) {
        // 发六合一
        Exampreasign exampreasign = examineeService.queryByLsh(lsh);

        Map<String, String> param = new LinkedMap();
        param.put("lsh", lsh);
        param.put("kskm", kskm);
        param.put("kscj", kscj + "");
        param.put("sfzmhm", exampreasign.getSfzmhm());
        param.put("jssj", DateTools.getFormatDate(jssj, DateTools.yyyy_MM_dd_HH_mm_ss));
        try {
            param.put("zp", com.alibaba.druid.util.Base64.byteArrayToBase64(FileUtils.readFileToByteArray(new File(exampreasign.getPhoto()))));
        } catch (Exception e) {
            logger.error("照片转换失败!!" + exampreasign.getPhoto());
            param.put("zp", "");
        }
        // TODO: 2017/12/28 0028 六合一以后要恢复
//        Map<String, Object> result = TmriClient.考试科目考试结束.invoke(param);
//        if (!TmriClient.isOK(result)) {
//            // 六合一 失败
//            logger.error("[" + lsh + "]六合一发送失败," + TmriClient.getMSG(result));
//            throw new RuntimeException("[" + lsh + "]六合一发送失败," + TmriClient.getMSG(result));
//        }

        // 更新考试状态
        exampreasign.setLsh(lsh);
        exampreasign.setKscj(kscj);
        if ("2".equals(kskm)) {
            if (kscj >= AttrUtils.科目二及格线.toInt()) {
                exampreasign.setF1(ExamineeService.F1_EXAMEND);
                exampreasign.setZt(ExamineeService.ZT_EXAMEND);
            } else {
                if (kscs < AttrUtils.每次预约中最多能考试的次数.toInt()) {
                    exampreasign.setZt(ExamineeService.ZT_EXAM1STEND);
                } else {
                    exampreasign.setF1(ExamineeService.F1_EXAMEND);
                    exampreasign.setZt(ExamineeService.ZT_EXAMEND);
                }
            }
        } else if ("3".equals(kskm)) {
            if (kscj >= AttrUtils.科目三及格线.toInt()) {
                exampreasign.setF1(ExamineeService.F1_EXAMEND);
                exampreasign.setZt(ExamineeService.ZT_EXAMEND);
            } else {
                if (kscs < AttrUtils.每次预约中最多能考试的次数.toInt()) {
                    exampreasign.setZt(ExamineeService.ZT_EXAM1STEND);
                } else {
                    exampreasign.setF1(ExamineeService.F1_EXAMEND);
                    exampreasign.setZt(ExamineeService.ZT_EXAMEND);
                }
            }
        }
        examineeService.updateByPrimaryKeySelective(exampreasign);

        // 记录 考试科目 结束过程
        Examproc proc = new Examproc();
        proc.setLsh(lsh);
        proc.setKscs(kscs);
        proc.setKsxm(kskm);
        proc.setJssj(jssj);
        proc.setKscj(kscj);
        String picPath = generatePicName(lsh, kskm, kscs, "end");
        DvrPicHelper.getPic(jlcxh, kskm, picPath);
        proc.setPic2(picPath);


        // 发六合一
        String zp = "";
        try {
            zp = com.alibaba.druid.util.Base64.byteArrayToBase64(FileUtils.readFileToByteArray(new File(exampreasign.getPhoto())));
        } catch (Exception e) {
            logger.error("照片转换失败!!" + exampreasign.getPhoto());
            zp = "";
        }
        if (tmri.enabled17C56) {
            Date tmriDate = DateUtils.addSeconds(new Date(),tmri.tmriOffSetSecond);
            JSONObject result = tmri.jk17C56(lsh, kskm, exampreasign.getSfzmhm(), kscj + "", DateTools.getFormatDate(tmriDate,"YYYY/MM/DD HH:mm:ss"), "0", "%25E6%2595%25B0%25E6%258D%25AE%25E4%25B8%258B%25E8%25BD%25BD%25E6%2588%2590%25E5%258A%259F%25EF%25BC%2581", AttrUtils.考试地点.toString(), AttrUtils.管理部门.toString(), "55");
            String code = (String) ((Map) result.get("head")).get("code");
            if (!"1".equals(code)) {
                logger.error("[" + lsh + "]六合一发送失败,");
                return 0;
            }
        }

        if (tmri.enabled17C57){
            JSONObject result = tmri.jk17C57(lsh,kskm,exampreasign.getSfzmhm(),DateTools.getFormatDate(new Date(),"YYYY/MM/DD"),"1","0");
            String code = (String) ((Map) result.get("head")).get("code");
            if (!"1".equals(code)) {
                logger.error("[" + lsh + "]六合一发送失败,");
                return 0;
            }
        }

        updateByPrimaryKeySelective(proc);
        return 1;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int ksxmend(String lsh, int kscs, String kskm, String ksxm, Date jssj) {
        Exampreasign exampreasign = examineeService.queryByLsh(lsh);
        // 发六合一
        if (tmri.enabled17C55) {
            Date tmriDate = DateUtils.addSeconds(new Date(), tmri.tmriOffSetSecond);
            JSONObject result = tmri.jk17C55(lsh, kskm, exampreasign.getSfzmhm(), ksxm, "32000022", "1", DateTools.getFormatDate(tmriDate,"YYYY/MM/DD HH:mm:ss"), AttrUtils.考试地点.toString(), "320100000000", "01");
            String code = (String) ((Map) result.get("head")).get("code");
            if (!"1".equals(code)) {
                logger.error("[" + lsh + "]六合一发送失败,");
                throw new RuntimeException("六合一发送失败");
            }
        }

        Examproc proc = new Examproc();
        proc.setLsh(lsh);
        proc.setKscs(kscs);
        proc.setKsxm(ksxm);
        proc.setJssj(jssj);
        updateByPrimaryKeySelective(proc);
        // 成功之后将redis的gps信息写入到oracle
        String gps = cache.get(cache.GPSKey(lsh, ksxm, kscs));
        gpsService.addGPS(lsh, kscs, ksxm, gps);
        return 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(String lsh, int kscs, String ksxm) throws Exception {
        ExamprocExample example = new ExamprocExample();
        ExamprocExample.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(lsh)) {
            criteria.andLshEqualTo(lsh);
        }
        if (-1 != kscs) {
            criteria.andKscsEqualTo(kscs);
        }
        if (StringUtils.isNotEmpty(ksxm)) {
            criteria.andKsxmEqualTo(ksxm);
        }

        mapper.deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateByPrimaryKeySelective(Examproc proc) {
        String jyw = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            // TODO: 2018/1/22 0022 没有序列化
            md.update(proc.toString().getBytes());
            jyw = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        proc.setJyw(jyw);
        mapper.updateByPrimaryKeySelective(proc);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateByExampleSelective(Examproc entity, ExamprocExample example) {
        String jyw = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            // TODO: 2018/1/22 0022 没有序列化
            md.update(entity.toString().getBytes());
            jyw = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        entity.setJyw(jyw);
        mapper.updateByExampleSelective(entity, example);
    }

    @Override
    public int maxKscsWithMisJudge(String lsh, String kskm, String ksxm) {
        ExamprocExample example = new ExamprocExample();
        ExamprocExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(lsh)) {
            criteria.andLshEqualTo(lsh);
        }
        if (StringUtils.isNotEmpty(kskm)) {
            criteria.andKskmEqualTo(kskm);
        }
        if (StringUtils.isNotEmpty(kskm)) {
            criteria.andKsxmEqualTo(kskm);
        }
        example.setOrderByClause("kscs desc");
        List<Examproc> examprocs = select(example);
        if (CollectionUtils.isEmpty(examprocs)) {
            return 0;
        } else {
            Examproc proc = examprocs.get(0);
            return proc.getKscs();
        }

    }

    @Override
    public String generatePicName(String lsh, String ksxm, int kscs, String custom) {
        return AttrUtils.考试过程图片文件夹路径 + File.separator + lsh + "_" + kscs + "_" + ksxm + "_" + custom + ".jpg";
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void moveByKscs(String lsh, String kskm, int ori, int des) throws Exception {
        // 过程表数据转移
        List<Examproc> procs = examproc(lsh, kskm, null, ori);
        for (Examproc proc : procs) {
            // 移到另外的考试次数
            proc.setKscs(des);
            String pic1 = proc.getPic1();
            String pic2 = proc.getPic2();
            String pic1NewPath = generatePicName(lsh, proc.getKsxm(), des, "begin");
            String pic2NewPath = generatePicName(lsh, proc.getKsxm(), des, "end");
            if (StringUtils.isNotEmpty(pic1) && new File(pic1).exists()) {
                proc.setPic1(pic1NewPath);
            }

            if (StringUtils.isNotEmpty(pic2) && new File(pic2).exists()) {
                proc.setPic2(pic2NewPath);
            }

            ExamprocExample oriExample = new ExamprocExample();
            oriExample.createCriteria().andKscsEqualTo(ori).andLshEqualTo(lsh).andKsxmEqualTo(proc.getKsxm());
            updateByExampleSelective(proc, oriExample);
            // 数据库操作成功后,图片重命名
            try {
                if (StringUtils.isNotEmpty(pic1) && new File(pic1).exists()) {
                    Files.move(new File(pic1).toPath(), new File(pic1NewPath).toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            } catch (Exception e) {
                logger.error("图片文件处理失败,已回滚", e);
                throw new Exception("图片文件处理失败");
            }
            try {
                if (StringUtils.isNotEmpty(pic2) && new File(pic2).exists()) {
                    Files.move(new File(pic2).toPath(), new File(pic2NewPath).toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            } catch (Exception e) {
                // 图片1回滚
                Files.move(new File(pic1NewPath).toPath(), new File(pic1).toPath(), StandardCopyOption.REPLACE_EXISTING);
                logger.error("图片文件处理失败,已回滚", e);
                throw new Exception("图片文件处理失败");
            }

        }


    }

    @Override
    public List<Examproc> queryByLsh(String lsh, Integer kscs) {
        ExamprocExample example = new ExamprocExample();
        ExamprocExample.Criteria ca = example.createCriteria();
        ca.andLshEqualTo(lsh).andKscsEqualTo(kscs);
        return mapper.selectByExample(example);
    }

    @Override
    public List<Examproc> queryByLsh(String lsh) {
        ExamprocExample example = new ExamprocExample();
        ExamprocExample.Criteria ca = example.createCriteria();
        ca.andLshEqualTo(lsh);
        return mapper.selectByExample(example);
    }


}
