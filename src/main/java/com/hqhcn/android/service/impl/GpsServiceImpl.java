package com.hqhcn.android.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hqh.android.dao.GpsMapper;
import com.hqh.android.entity.Exampreasign;
import com.hqh.android.entity.Gps;
import com.hqh.android.entity.GpsExample;
import com.hqh.android.service.*;
import com.hqh.android.tool.AttrUtils;
import com.hqh.android.tool.DateTools;
import com.hqh.android.webservice.TmriInvoker;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class GpsServiceImpl implements GpsService {

    @Autowired
    private GpsMapper mapper;

    @Autowired
    private ExamProcService procService;

    @Autowired
    private KsxmService ksxmService;

    @Autowired
    private ExamineeService examineeService;
    @Autowired
    private TmriInvoker tmri;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<Gps> selectByExample(GpsExample example) {
        return mapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public Gps select(String lsh, int kscs, String ksxm) {
        GpsExample example = new GpsExample();
        example.createCriteria().andKsLshEqualTo(lsh).andKscsEqualTo(kscs).andKsxmEqualTo(ksxm);
        Optional<List<Gps>> ss = Optional.ofNullable(selectByExample(example));
        return ss.filter(o->o.size()>0).map(o->o.get(0)).orElse(new Gps());
    }

    @Override
    public List<Gps> select(String lsh, int kscs) {
        GpsExample example = new GpsExample();
        example.createCriteria().andKsLshEqualTo(lsh).andKscsEqualTo(kscs);
        return selectByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int kskmbegin(String kskm, String jlcxh, String lsh, int kscs, Date kssj) {

        // 将 该考生 设置成 考试中
        examineeService.writeZTByLSH(lsh, ExamineeService.ZT_EXAMING);


        // 先在gps表中新建该科目所有的考试项目
        List<String> ksxms = ksxmService.getKSXMcode(kskm);
        for (String sub_ksxm : ksxms) {
            Gps gps = new Gps();
            gps.setKskm(kskm);
            gps.setKsxm(sub_ksxm);
            gps.setCarinfoId(jlcxh);
            gps.setKsLsh(lsh);
            gps.setKscs(kscs);
            mapper.insertSelective(gps);
        }

        // 再过程表中记录过程记录
        procService.begin(lsh, kscs, kskm, jlcxh, kssj, kskm);

        // 发六合一
        Exampreasign exampreasign = examineeService.queryByLsh(lsh);
        String zp="";
        try {
            zp= com.alibaba.druid.util.Base64.byteArrayToBase64(FileUtils.readFileToByteArray(new File(exampreasign.getPhoto())));
        } catch (Exception e) {
            logger.error("照片转换失败!!" + exampreasign.getPhoto());
            zp = "";
        }
        // TODO: 2018/1/19 0019 考试系统编号,考试员身份证号以后要填
        if (tmri.enabled17C51) {
            Date tmriDate = DateUtils.addSeconds(new Date(), tmri.tmriOffSetSecond);
            JSONObject result = tmri.jk17C51(lsh, kskm, AttrUtils.考试系统编号.toString(),
                    exampreasign.getSfzmhm(), null == exampreasign.getKsy1() ? "" : exampreasign.getKsy1(), "zp", DateTools.getFormatDate(tmriDate,"YYYY/MM/DD HH:mm:ss"), "",exampreasign.getHphm());
            String code = (String) ((Map) result.get("head")).get("code");
            if (!"1".equals(code)) {
                logger.error("[" + lsh + "]六合一发送失败,");
                throw new RuntimeException("[" + lsh + "]六合一发送失败,");
            }
        }

        // 初始考试成绩
        Exampreasign exampreasign100 = new Exampreasign();
        exampreasign100.setLsh(lsh);
        exampreasign100.setKscj(100);
        examineeService.updateSelective(exampreasign100);
        return 0;
    }

    @Override
    public int addGPS(String lsh, int kscs, String ksxm, String GPS) {
        Gps gps = new Gps();
        gps.setKsxm(ksxm);
        gps.setKsLsh(lsh);
        gps.setKscs(kscs);
        gps.setGps(GPS);
        return mapper.updateByPrimaryKeySelective(gps);
    }

    @Override
    public void moveByKscs(String lsh, String kskm, int ori, int des) {
        Gps desGPS = new Gps();
        desGPS.setKscs(des);

        GpsExample oriExample = new GpsExample();
        oriExample.createCriteria().andKscsEqualTo(ori).andKsLshEqualTo(lsh).andKskmEqualTo(kskm);

        mapper.updateByExampleSelective(desGPS, oriExample);
    }


}
