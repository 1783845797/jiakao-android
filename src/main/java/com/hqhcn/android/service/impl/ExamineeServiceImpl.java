package com.hqhcn.android.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hqh.android.dao.ExampreasignMapper;
import com.hqh.android.entity.Carinfo;
import com.hqh.android.entity.Exampreasign;
import com.hqh.android.entity.ExampreasignExample;
import com.hqh.android.entity.Ksld;
import com.hqh.android.service.CarinfoService;
import com.hqh.android.service.ExamProcService;
import com.hqh.android.service.ExamineeService;
import com.hqh.android.service.KsldService;
import com.hqh.android.tool.AttrUtils;
import com.hqh.android.tool.DateTools;
import com.hqh.android.web.InitLoad;
import com.hqh.android.webservice.TmriInvoker;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import static java.util.stream.Collectors.toList;

@Service
public class ExamineeServiceImpl implements ExamineeService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ExamProcService procService;
    @Autowired
    private ExampreasignMapper mapper;
    @Autowired
    private CarinfoService carinfoService;
    @Autowired
    private KsldService ksldService;
    @Autowired
    private ExamKfServiceImpl kfService;
    @Autowired
    private GpsServiceImpl gpsService;
    @Autowired
    private TmriInvoker tmri;

    /**
     * 是否通过监管平台分配考生,默认值0
     * <pre>1=监管平台分配 0=本系统分配</pre>
     */
    @Value("${jiakao.tmri.17CB3}")
    private String enable17CB3 = "0";

    @Override
    public List<Exampreasign> query(ExampreasignExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public List<Exampreasign> queryToPage(ExampreasignExample example) {
        return mapper.selectByExampleToPage(example);
    }

    @Override
    public int updateByPrimaryKeySelective(Exampreasign exampreasign) {
        String jyw = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            // TODO: 2018/1/22 0022 没有序列化
            md.update(exampreasign.toString().getBytes());
            jyw = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        exampreasign.setJmw(jyw);
        return mapper.updateByPrimaryKeySelective(exampreasign);
    }

    @Override
    public void updateByLSH(Exampreasign exampreasign) {
        String jyw = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            // TODO: 2018/1/22 0022 没有序列化
            md.update(exampreasign.toString().getBytes());
            jyw = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        exampreasign.setJmw(jyw);
        mapper.updateByPrimaryKey(exampreasign);
    }

    @Override
    public List<Exampreasign> unassignTop8(ExampreasignExample example, int num) {
        return null;
    }

    @Override
    public Exampreasign queryByLsh(String lsh) {
        return mapper.selectByPrimaryKey(lsh);
    }

    @Override
    public List<Exampreasign> queryToPage1(ExampreasignExample example) {
        return mapper.queryToPage1(example);
    }

    @Override
    public void reset(String lsh) throws Exception {
        // 重置考试次数
        Exampreasign exampreasign = queryByLsh(lsh);

        exampreasign.setKscs(ExamineeService.KSCS_INIT);
        exampreasign.setKscj(null);
        exampreasign.setFpsj(null);
        exampreasign.setZt(ZT_UNASSIGN);
        updateByLSH(exampreasign);

        // 删除之前的考试过程
        procService.delete(lsh, -1, null);
    }

    @Transactional
    @Override
    public void examineeDownload(Exampreasign examinee) {
        String jyw = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            // TODO: 2018/1/22 0022 没有序列化
            md.update(examinee.toString().getBytes());
            jyw = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        examinee.setJmw(jyw);
        insert(examinee);
    }

    @Override
    public List<String> fetchExamPic(int size) {
        return null;
    }

    @Transactional
    @Override
    public void writeZTByLSH(String lsh, int zt) {
        // 更新 考生总表
        Exampreasign exampreasign = new Exampreasign();
        exampreasign.setLsh(lsh);
        exampreasign.setZt(zt);
        exampreasign.setF1(ExamineeService.F1_EXAMBEGINNING);
        updateByPrimaryKeySelective(exampreasign);
    }

    @Override
    @Transactional
    public void insert(Exampreasign entity) {
        if (null == entity.getKscs()) {
            entity.setKscs(ExamineeService.KSCS_INIT);
        }
        if (StringUtils.isEmpty(entity.getF1())){
            entity.setF1("0");
        }
        mapper.insert(entity);
    }

    public void updateByExampleSelective(Exampreasign entity, ExampreasignExample example) {
        String jyw = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            // TODO: 2018/1/22 0022 没有序列化
            md.update(entity.toString().getBytes());
            jyw = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        entity.setJmw(jyw);
        mapper.updateByExampleSelective(entity, example);
    }

    @Override
    public void update(Exampreasign entity, ExampreasignExample example) {
        updateByExampleSelective(entity, example);
    }

    @Override
    public void updateSelective(Exampreasign entity) {
        updateByPrimaryKeySelective(entity);
    }

    @Override
    public void updateZT(String lsh, int zt) {
        Exampreasign examinee = new Exampreasign();
        examinee.setLsh(lsh);
        examinee.setZt(zt);
        updateSelective(examinee);
    }

    @Override
    @Transactional
    public List<Exampreasign> pull(String jlcxh, String jlc_kskm) throws Exception {

        Carinfo carinfo = carinfoService.query(InitLoad.kcdddh, jlcxh);
        if (StringUtils.isEmpty(carinfo.getKsld())) {
            throw new Exception("该考车没有分配考试路线");
        }

        List<Exampreasign> result = Collections.emptyList();
        ExampreasignExample example = new ExampreasignExample();
        example.setOrderByClause(" bdsj ");
        example.createCriteria()
                .andJlcxhEqualTo(jlcxh)
                .andYkrqEqualTo(DateTools.toDate(DateTools.getYMD(), DateTools.yyyyMMdd))
                .andZtIn(Arrays.asList(ZT_NOEXAM, ZT_EXAMING, ZT_EXAM1STEND));
        // 车上没有考完的考生列表(已上车未考完,没及格等第二次考试)
        List<Exampreasign> assigns = mapper.selectByExample(example);

        if (assigns == null || assigns.size() == 0) {
            // 全部考完
            // 1. 将车上 <考完> 考生状态 全 设置成 <考完下车>
            ExampreasignExample example8 = new ExampreasignExample();
            example8.setOrderByClause(" bdsj ");
            example8.createCriteria()
                    .andJlcxhEqualTo(jlcxh)
                    .andZtEqualTo(ZT_EXAMEND)
                    .andYkrqEqualTo(DateTools.toDate(DateTools.getYMD(), DateTools.yyyyMMdd));
            Exampreasign exampreasign9 = new Exampreasign();
            exampreasign9.setZt(ZT_EXAMENDOUTCAR);
            updateByExampleSelective(exampreasign9, example8);

            // 2. 拿到全部 <已分配到该车待考> 的考生, 状态设置成  <已上车>
            ExampreasignExample example3 = new ExampreasignExample();
            example3.setOrderByClause(" bdsj ");
            example3.createCriteria().andJlcxhEqualTo(jlcxh).andZtEqualTo(ZT_NOTINCAR)
                    .andYkrqEqualTo(DateTools.toDate(DateTools.getYMD(), DateTools.yyyyMMdd));
            List<Exampreasign> assigns3 = mapper.selectByExample(example3);
            for (Exampreasign exampreasign : assigns3) {
                exampreasign.setZt(ZT_NOEXAM);
                updateByLSH(exampreasign);
            }
            // 并返回
            result = assigns3;


            // 3. 从状态<验证通过考车未分>中  获取下一轮 备考考生
            List<Exampreasign> exampreasign2= Collections.emptyList();

            if (tmri.enabled17CB3) {
                // 监管平台分配考生
                JSONObject result17CB3 = tmri.jk17CB3(carinfo.getHphm(), AttrUtils.考场序号.toString(),"C1","*", "17CB3", "", InitLoad.examineeNum() + "");
                String code = ((Map) result17CB3.get("head")).get("code") + "";
                String message = ((Map) result17CB3.get("head")).get("message") + "";
//                String code="1";
//                String message="320481198701221828,320282199112313978,320223197904056499,500236198810243883";
                if ("1".equals(code)){
                    exampreasign2 = Arrays.stream(message.split(","))
                            .map(sfzmhm -> queryBySfzmhmToday(sfzmhm).get(0))
                            .collect(toList());
                }else {
                    logger.error(String.format("[17CB3]监管平台分配考生下载失败!错误信息=%s", message));
                }
            } else {
                // 本系统分配考生
                ExampreasignExample example2 = new ExampreasignExample();
                example2.setOrderByClause(" bdsj ");
                example2.createCriteria().andKskmEqualTo(jlc_kskm)
                        .andZtEqualTo(ZT_UNASSIGN).andKsldIn(Arrays.asList(carinfo.getKsld(), ""))
                        .andYkrqEqualTo(DateTools.toDate(DateTools.getYMD(), DateTools.yyyyMMdd));
                exampreasign2 = mapper.selectByExample(example2);
            }
            for (int i = 0; i < InitLoad.examineeNum(); i++) {
                if (exampreasign2.size() > i) {
                    Ksld ksld = ksldService.getByName(carinfo.getKsld().trim());
                    if (StringUtils.isEmpty(ksld.getKsxmpx())) {
                        throw new Exception("该车辆考试线路没有考试项目");
                    }
                    List<String> ksxmNames = new ArrayList<String>();
                    for (String ksxmCode : ksld.getKsxmpx().split(",")) {
                        ksxmNames.add(InitLoad.ksxmcode_name.get(ksxmCode));
                    }
                    String ksxmName = "";
                    for (String name : ksxmNames) {
                        ksxmName += name + ",";
                    }

                    exampreasign2.get(i).setKsxm(ksxmName.substring(0, ksxmName.length() - 1));
                    exampreasign2.get(i).setZt(ZT_NOTINCAR);
                    exampreasign2.get(i).setJlcxh(jlcxh);
                    exampreasign2.get(i).setKsld(carinfo.getKsld());
                    exampreasign2.get(i).setKscx(carinfo.getJklx());
                    exampreasign2.get(i).setHphm(carinfo.getHphm());
                    exampreasign2.get(i).setKsy1(carinfo.getPky());
                    exampreasign2.get(i).setKcdddh(carinfo.getKcdddh());

                    updateByLSH(exampreasign2.get(i));
                } else {
                    continue;
                }
            }

        } else {
            // 4. 没有全部考完,还是返回 当前组考生(不管其他考生完成与否)
            ExampreasignExample example45678 = new ExampreasignExample();
            example45678.setOrderByClause(" bdsj ");
            example45678.createCriteria().andJlcxhEqualTo(jlcxh)
                    .andZtIn(Arrays.asList(ZT_NOEXAM, ZT_EXAMING, ZT_EXAM1STEND, ZT_EXAMEND))
                    .andYkrqEqualTo(DateTools.toDate(DateTools.getYMD(), DateTools.yyyyMMdd));
            result = mapper.selectByExample(example45678);
        }
        return result;

    }

    @Override
    public long count(ExampreasignExample example) {
        return mapper.countByExample(example);
    }


    @Override
    public List checkStudent(String sfzmhm) {
        ExampreasignExample example = new ExampreasignExample();
        ExampreasignExample.Criteria ca = example.createCriteria();
        ca.andYkrqEqualTo(DateUtils.truncate(new Date(),Calendar.DATE)).andSfzmhmEqualTo(sfzmhm);
        List<Exampreasign> list = mapper.selectByExample(example);
        return list;
    }

    @Override
    public List<Exampreasign> queryBySfzmhm(String sfzmhm) {
        ExampreasignExample example = new ExampreasignExample();
        ExampreasignExample.Criteria ca = example.createCriteria();
        ca.andSfzmhmEqualTo(sfzmhm).andZtEqualTo(9);
        List<Exampreasign> exampreasigns = mapper.selectByExample(example);
        return exampreasigns;
    }

    @Override
    public List<Exampreasign> queryBySfzmhmToday(String sfzmhm) {
        ExampreasignExample example = new ExampreasignExample();
        example.createCriteria().
                andSfzmhmEqualTo(sfzmhm).
                andYkrqEqualTo(DateUtils.truncate(new Date(), Calendar.DATE));
        return mapper.selectByExample(example);
    }
}
