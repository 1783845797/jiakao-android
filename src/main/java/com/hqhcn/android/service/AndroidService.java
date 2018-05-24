package com.hqhcn.android.service;

import com.alibaba.fastjson.JSONObject;
import com.hqh.android.cache.RedisCache;
import com.hqh.android.entity.Carinfo;
import com.hqh.android.entity.ExamKf;
import com.hqh.android.entity.Exampreasign;
import com.hqh.android.entity.Ksxm;
import com.hqh.android.tool.DateTools;
import com.hqh.android.tool.LogType;
import com.hqh.android.tool.ResultUtils;
import com.hqh.android.web.InitLoad;
import com.hqh.android.webservice.TmriInvoker;
import org.apache.commons.collections.map.LinkedMap;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Component
public class AndroidService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TmriInvoker tmri;
    @Autowired
    private ExamineeService examineeService;
    @Autowired
    private KsxmService ksxmService;
    @Autowired
    private ExamKfService kfService;
    @Autowired
    private GpsService gpsService;
    @Autowired
    private CarinfoService carinfoService;
    @Autowired
    private ExamProcService procService;
    @Autowired
    RedisCache cache;

    /**
     * 考试科目 开始
     *
     * @param token 校验码
     * @param kskm  考试科目
     * @param jlcxh 车辆ID
     * @param lsh   流水号
     * @param kscs  考试次数
     * @param kssj  开始时间
     * @param ip    客户端IP
     * @return
     */
    public String kskmBegin(String token, String kskm, String jlcxh, String lsh, String kscs, String kssj, String ip) {

        String result_msg = "";

        int kscsInt = 0;
        try {
            kscsInt = Integer.parseInt(kscs);
        } catch (Exception e) {
            return ResultUtils.failure("param kscs not valid number type", "");
        }

        Date kssj_date = null;
        try {
            kssj_date = conver(kssj);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultUtils.failure("kssj wrong format,only support" + DateTools.yyyy_MM_dd_HH_mm_ss, "");
        }

        if (StringUtils.isEmpty(result_msg)) {
            try {
                // 过程表中记录
                gpsService.kskmbegin(kskm, jlcxh, lsh, kscsInt, kssj_date);
            } catch (Exception e) {
                logger.error("科目开始失败:" + lsh, e);
                return ResultUtils.failure(e.getMessage(), "");

            }
        }

        return ResultUtils.success();
    }

    /**
     * 考试项目 开始
     *
     * @param lsh   流水号
     * @param ksxm  考试项目
     * @param jlcxh 教练车序号
     * @param kscs  考试次数
     * @param kssj  开始时间
     * @return
     */
    public String ksxmBegin(String token, String lsh, String kskm, String jlcxh, String ksxm, String kscs, String kssj, String ip) {

        Date kssj_date = null;
        try {
            kssj_date = conver(kssj);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultUtils.failure("kssj wrong format,only support" + DateTools.yyyy_MM_dd_HH_mm_ss);
        }

        int kscsInt = 0;
        try {
            kscsInt = Integer.parseInt(kscs);
        } catch (Exception e) {
            return ResultUtils.failure("param kscs not valid number type");
        }

        Exampreasign exampreasign = examineeService.queryByLsh(lsh);
        Carinfo carinfo = carinfoService.query(InitLoad.kcdddh, jlcxh);

        try {
            if (tmri.enabled17C52) {
                // 发六合一
                Date tmriDate = DateUtils.addSeconds(new Date(), tmri.tmriOffSetSecond);
                JSONObject result = tmri.jk17C52(lsh, kskm, exampreasign.getSfzmhm(), ksxm, "32000022", exampreasign.getHphm(), DateTools.getFormatDate(tmriDate, "YYYY/MM/DD HH:mm:ss"));
                String code = (String) ((Map) result.get("head")).get("code");
                if (!"1".equals(code)) {
                    logger.error("[" + lsh + "]六合一发送失败,");
//                    return result(FAILURE_CODE, "六合一发送失败", "");
                }
            }
            if (tmri.enabled17C54) {
                Date tmriDate = DateUtils.addSeconds(new Date(), tmri.tmriOffSetSecond);
                JSONObject result = tmri.jk17C54(lsh, kskm, exampreasign.getSfzmhm(), ksxm, DateTools.getFormatDate(tmriDate, "YYYY/MM/DD HH:mm:ss"), "0", "");
                String code = (String) ((Map) result.get("head")).get("code");
                if (!"1".equals(code)) {
                    logger.error("[" + lsh + "]六合一发送失败,");
                    return ResultUtils.failure("六合一发送失败");
                }
            }


            procService.begin(lsh, kscsInt, ksxm, jlcxh, kssj_date, kskm);

            // 发六合一(照片)
            String zp = "";
            try {
                zp = com.alibaba.druid.util.Base64.byteArrayToBase64(FileUtils.readFileToByteArray(new File(exampreasign.getPhoto())));
            } catch (Exception e) {
                logger.error("照片转换失败!!" + exampreasign.getPhoto());
                zp = "";
            }


        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultUtils.failure(e.getMessage());
        }
        return ResultUtils.success();
    }

    /**
     * 扣分信息
     *
     * @param lsh    流水号
     * @param kskm   考试科目
     * @param ksxm   考试项目
     * @param kfxm   扣分信息
     * @param sfzmhm 身份证明号码
     * @param kfsj   扣分时间
     * @param kscs   考试次数
     * @return
     */
    public String koufen(String token, String lsh, String kskm, String ksxm, String jlcxh, String kfxm, String sfzmhm, String kfsj, String kscs, String ip) {

        Exampreasign exampreasign = examineeService.queryByLsh(lsh);

        Map<String, String> param = new LinkedMap();
        param.put("lsh", lsh);
        param.put("kskm", kskm);
        param.put("ksxm", ksxm);
        param.put("kfxm", kfxm);
        param.put("sfzmhm", exampreasign.getSfzmhm());
        param.put("kfsj", kfsj);

        try {
            // 发六合一
            if (tmri.enabled17C53) {
                Date tmriDate = DateUtils.addSeconds(new Date(), tmri.tmriOffSetSecond);
                JSONObject result = tmri.jk17C53(lsh, kskm, sfzmhm, ksxm, kfxm, DateTools.getFormatDate(tmriDate, "YYYY/MM/DD HH:mm:ss"));
                String code = (String) ((Map) result.get("head")).get("code");
                if (!"1".equals(code)) {
                    logger.error("[" + lsh + "]六合一发送失败,");
                    return ResultUtils.failure("六合一发送失败", "");
                }
            }
            Date kfsjDate = DateTools.toDate(kfsj, DateTools.yyyy_MM_dd_HH_mm_ss);
            int kscsInt = Integer.parseInt(kscs);

            ExamKf examKf = new ExamKf();
            examKf.setLsh(lsh);
            examKf.setKskm(kskm);
            if (null != ksxm) {
                examKf.setKsxm(ksxm);
            }
            examKf.setKfxm(kfxm);
            examKf.setSfzmhm(sfzmhm);
            examKf.setKfsj(kfsjDate);
            examKf.setKscs(kscsInt);
            Ksxm ksxm1 = ksxmService.selectByCode(kfxm);
            examKf.setKfz(Integer.parseInt(ksxm1.getKfz()));
            kfService.insert(examKf, jlcxh);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            return ResultUtils.failure(e.getMessage(), "");
        }

        return ResultUtils.success("", "");
    }

    /**
     * 考试项目 结束
     *
     * @param lsh  流水号
     * @param ksxm 车辆ID
     * @param kscs 考试次数
     * @param jssj 结束时间
     * @return
     */
    public String ksxmEnd(String token, String lsh, String kskm, String ksxm, String jlcxh, String kscs, String jssj, String ip) {
        int kscsInt = 0;
        try {
            kscsInt = Integer.parseInt(kscs);
        } catch (Exception e) {
            return ResultUtils.failure("param kscs not valid number type");
        }

        Date jssj_date = null;
        try {
            jssj_date = conver(jssj);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultUtils.failure("jssj wrong format,only support" + DateTools.yyyy_MM_dd_HH_mm_ss);
        }

        Exampreasign exampreasign = examineeService.queryByLsh(lsh);

        Map<String, String> param = new LinkedMap();
        param.put("lsh", lsh);
        param.put("kskm", kskm);
        param.put("sfzmhm", exampreasign.getSfzmhm());
        param.put("ksxm", ksxm);
        param.put("jssj", jssj);

        try {
            // TODO: 2017/12/28 0028 六合一以后要恢复
//                param.put("czlx", TmriClient.confirm());
//                Map<String, Object> result = TmriClient.考试项目结束.invoke(param);
//                if (!TmriClient.isOK(result)) {
//                    // 六合一 失败
//                    logger.error("[" + lsh + "]六合一发送失败," + TmriClient.getMSG(result));
//                    result_code = FAILURE_CODE;
//                    result_msg = TmriClient.getMSG(result);
//                } else {
            procService.ksxmend(lsh, kscsInt, kskm, ksxm, jssj_date);
//                }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultUtils.failure(e.getMessage());
        }
        return ResultUtils.success();
    }

    /**
     * 考试科目 结束
     *
     * @param lsh  流水号
     * @param kscs 考试次数
     * @param jssj 结束时间
     * @return
     */
    public String kskmEnd(String token, String kskm, String jlcxh, String lsh, String kscs, String jssj, String kscj, String ip) {

        int kscsInt = 0;
        try {
            kscsInt = Integer.parseInt(kscs);
        } catch (Exception e) {
            return ResultUtils.failure("param kscs not valid number type");
        }
        int kscjInt = 0;
        try {
            kscjInt = Integer.parseInt(kscj);
        } catch (Exception e) {
            return ResultUtils.failure("param kscj not valid number type");
        }

        Date jssj_date = null;
        try {
            jssj_date = conver(jssj);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultUtils.failure("jssj wrong format,only support" + DateTools.yyyy_MM_dd_HH_mm_ss);
        }
        try {
            // 过程表中记录
            procService.end(lsh, kscsInt, kskm, jlcxh, jssj_date, kscjInt);
        } catch (Exception e) {
            logger.error("结束考试异常" + " " + lsh, e);
            return ResultUtils.failure(e.getMessage());
        }
        return ResultUtils.success();
    }

    /**
     * GPS数据写入
     *
     * @param token
     * @param kskm  考试科目
     * @param ksxm  考试项目
     * @param jlcxh 车辆ID
     * @param lsh   流水号
     * @param kscs  考试次数
     * @param gps   GPS数据
     * @param ip    IP
     * @return
     */
    public String gps(String token, String kskm, String ksxm, String jlcxh, String lsh, String kscs, String gps, String ip) {
        String result_msg = "";

        int kscsInt = 0;
        try {
            kscsInt = Integer.parseInt(kscs);
        } catch (Exception e) {
            return ResultUtils.failure("param kscs not valid number type");
        }

        // 往GPS表中追加GPS信息
        try {
            long before = System.currentTimeMillis();
            cache.append(cache.GPSKey(lsh, ksxm, kscsInt), gps);
            logger.debug((System.currentTimeMillis() - before) + "");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultUtils.failure(e.getMessage());
        }

        return ResultUtils.success();
    }


    private Date conver(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DateTools.yyyy_MM_dd_HH_mm_ss);
        return sdf.parse(dateStr);
    }
}
