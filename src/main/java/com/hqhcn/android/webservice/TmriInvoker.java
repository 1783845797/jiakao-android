package com.hqhcn.android.webservice;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Component
public class TmriInvoker {

    protected Logger logger = Logger.getLogger(this.getClass());
    @Value("${jiakao.WSClientName:WS-CLIENT}")
    private String wsClientName;
    @Value("${jiakao.WSClientContext:/tmri}")
    private String wsClientContext;
    @Autowired
    RestTemplate restTemplate;

    public int tmriOffSetSecond = 139;

    @Value("${jiakao.tmri.17C51}")
    private String Str17C51 = "0";
    @Value("${jiakao.tmri.17C52}")
    private String Str17C52 = "0";
    @Value("${jiakao.tmri.17C53}")
    private String Str17C53 = "0";
    @Value("${jiakao.tmri.17C54}")
    private String Str17C54 = "0";
    @Value("${jiakao.tmri.17C55}")
    private String Str17C55 = "0";
    @Value("${jiakao.tmri.17C56}")
    private String Str17C56 = "0";
    @Value("${jiakao.tmri.17C57}")
    private String Str17C57 = "0";
    @Value("${jiakao.tmri.17C58}")
    private String Str17C58 = "0";
    @Value("${jiakao.tmri.17CB2}")
    private String Str17CB2 = "0";
    @Value("${jiakao.tmri.17CB3}")
    private String Str17CB3 = "0";

    public boolean enabled17C51 = "1".equalsIgnoreCase(Str17C51);
    public boolean enabled17C52 = "1".equalsIgnoreCase(Str17C52);
    public boolean enabled17C53 = "1".equalsIgnoreCase(Str17C53);
    public boolean enabled17C54 = "1".equalsIgnoreCase(Str17C54);
    public boolean enabled17C55 = "1".equalsIgnoreCase(Str17C55);
    public boolean enabled17C56 = "1".equalsIgnoreCase(Str17C56);
    public boolean enabled17C57 = "1".equalsIgnoreCase(Str17C57);
    public boolean enabled17C58 = "1".equalsIgnoreCase(Str17C58);
    public boolean enabled17CB2 = "1".equalsIgnoreCase(Str17CB2);
    public boolean enabled17CB3 = "1".equalsIgnoreCase(Str17CB3);

    public int getTmriOffSetSecond() {
        return tmriOffSetSecond;
    }

    public void setTmriOffSetSecond(int tmriOffSetSecond) {
        this.tmriOffSetSecond = tmriOffSetSecond;
    }


    /**
     * 身份信息比对(考试科目开始)
     */
    public JSONObject jk17C51(String lsh, String kskm, String ksxtbh, String sfzmhm, String ksysfzmhm, String zp, String kssj, String ksy2sfzmhm,String kchp) {

        if (enabled17C58) {
            jk17C58(sfzmhm);
        }

        JSONObject param = new JSONObject();
        param.put(TMRIParam.流水号, lsh);
        param.put(TMRIParam.考试科目, kskm);
        param.put(TMRIParam.考试系统编号, ksxtbh);
        param.put(TMRIParam.身份证明号码, sfzmhm);
        param.put(TMRIParam.考试员1身份证明号码, ksysfzmhm);
        param.put(TMRIParam.照片, zp);
        param.put(TMRIParam.开始时间, kssj);
        param.put(TMRIParam.考试员2身份证明号码, ksy2sfzmhm);
        param.put(TMRIParam.考试车号牌, kchp);

        return post("17C51", param);
    }

    /**
     * 考试项目开始
     */
    public JSONObject jk17C52(String lsh, String kskm, String sfzmhm, String ksxm, String sbxh, String kchp, String kssj) {

        JSONObject param = new JSONObject();
        param.put(TMRIParam.流水号, lsh);
        param.put(TMRIParam.考试科目, kskm);
        param.put(TMRIParam.身份证明号码, sfzmhm);
        param.put(TMRIParam.考试项目, ksxm);
        param.put(TMRIParam.设备序号, sbxh);
        param.put(TMRIParam.考试车号牌, kchp);
        param.put(TMRIParam.开始时间, kssj);

        return post("17C52", param);
    }

    /**
     * 考试扣分
     */
    public JSONObject jk17C53(String lsh, String kskm, String sfzmhm, String ksxm, String kfxm, String kfsj) {

        JSONObject param = new JSONObject();
        param.put(TMRIParam.流水号, lsh);
        param.put(TMRIParam.考试科目, kskm);
        param.put(TMRIParam.身份证明号码, sfzmhm);
        param.put(TMRIParam.考试项目, ksxm);
        param.put(TMRIParam.扣分项目, kfxm);
        param.put(TMRIParam.扣分时间, kfsj);

        return post("17C53", param);
    }

    /**
     * 考试过程图片
     */
    public JSONObject jk17C54(String lsh, String kskm, String sfzmhm, String ksxm, String zpsj, String cs, String zp) {

        JSONObject param = new JSONObject();
        param.put(TMRIParam.流水号, lsh);
        param.put(TMRIParam.考试科目, kskm);
        param.put(TMRIParam.身份证明号码, sfzmhm);
        param.put(TMRIParam.考试项目, ksxm);
        param.put(TMRIParam.抓拍时间, zpsj);
        param.put(TMRIParam.车速, cs);
        param.put(TMRIParam.照片, zp);

        return post("17C54", param);
    }

    /**
     * 考试项目结束
     */
    public JSONObject jk17C55(String lsh, String kskm, String sfzmhm, String ksxm, String sbxh, String czlx, String jssj, String ksdd, String dwjgdm, String zdbs) {

        JSONObject param = new JSONObject();
        param.put(TMRIParam.流水号, lsh);
        param.put(TMRIParam.考试科目, kskm);
        param.put(TMRIParam.身份证明号码, sfzmhm);
        param.put(TMRIParam.考试项目, ksxm);
        param.put(TMRIParam.设备序号, sbxh);
        param.put(TMRIParam.操作类型, czlx);
        param.put(TMRIParam.结束时间, jssj);
        param.put(TMRIParam.考试地点, ksdd);
        param.put("dwjgdm", dwjgdm);
        param.put("zdbs", zdbs);

        return post("17C55", param);
    }

    /**
     * 考试科目考试结束
     */
    public JSONObject jk17C56(String lsh, String kskm, String sfzmhm, String kscj, String jssj, String ghks, String zp, String ksdd, String dwjgdm, String zdbs) {

        JSONObject param = new JSONObject();
        param.put(TMRIParam.流水号, lsh);
        param.put(TMRIParam.考试科目, kskm);
        param.put(TMRIParam.身份证明号码, sfzmhm);
        param.put(TMRIParam.考试成绩, kscj);
        param.put(TMRIParam.结束时间, jssj);
        param.put(TMRIParam.更换考生, ghks);
        param.put(TMRIParam.照片, zp);
        param.put(TMRIParam.考试地点, ksdd);
        param.put("dwjgdm", dwjgdm);
        param.put("zdbs", zdbs);

        return post("17C56", param);
    }

    /**
     * 查询成绩单上需打印照片
     */
    public JSONObject jk17C57(String lsh, String kskm, String sfzmhm, String ksrq,String yycs,String bcyykscs) {

        JSONObject param = new JSONObject();
        param.put(TMRIParam.流水号, lsh);
        param.put(TMRIParam.考试科目, kskm);
        param.put(TMRIParam.身份证明号码, sfzmhm);
        param.put(TMRIParam.考试日期, ksrq);
        param.put(TMRIParam.预约次数, yycs);
        param.put(TMRIParam.本次预约考试次数, bcyykscs);

        return post("17C57", param);
    }

    /**
     * 读取考生照片信息
     */
    public JSONObject jk17C58(String sfzmhm) {

        JSONObject param = new JSONObject();
        param.put(TMRIParam.身份证明号码, sfzmhm);

        return post("17C58", param);
    }

    /**
     * 随机安排考试
     */
    public JSONObject jk17CB3(String kchp, String kcxh, String kscc, String qdxm, String ksysfzmhm, String ksy2sfzmhm, String sjrs) {

        JSONObject param = new JSONObject();
        param.put(TMRIParam.考试车号牌, kchp);
        param.put(TMRIParam.考场序号, kcxh);
        param.put(TMRIParam.考试场次, kscc);
        param.put(TMRIParam.签到项目, qdxm);
        param.put(TMRIParam.考试员1身份证明号码, ksysfzmhm);
        param.put(TMRIParam.考试员2身份证明号码, ksy2sfzmhm);
        param.put(TMRIParam.随机人数, sjrs);

        return post("17CB3", param);
    }


    private JSONObject post(String url, JSONObject json) {
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("paramJson", json.toString());

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, headers);

        try {
            return restTemplate.exchange("http://" + wsClientName + wsClientContext + "/" + url, HttpMethod.POST, entity, JSONObject.class).getBody();
        } catch (Exception e) {
            logger.error("[" + url + "] 调用服务失败!!!", e);
            throw e;
        }
    }
}
