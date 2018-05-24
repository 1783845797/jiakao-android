package com.hqhcn.android.webservice;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Component
public class WSInvoker {

    protected Logger logger = Logger.getLogger(this.getClass());
    @Value("${jiakao.service_wsclient_context}")
    private String wsclientServiceContext;
    @Autowired
    RestTemplate restTemplate;

    /**
     * 调用17C52接口
     *
     * @param paramJSON <code>不校验参数,</code>JSON格式<code>{"lsh":流水号,"kskm":考试科目,"sfzmhm":身份证明号码,"ksxm":考试项目,"sbxh":设备序号,"kchp":考车号牌,"kssj":开始时间(YYYY-MM-DD HH:mm:ss)}</code>
     * @return JSONObject, 异常返回空对象
     */
    public JSONObject invoke17C52(JSONObject paramJSON) {
        logger.info("[17C52]方法:参数=" + paramJSON);
        MultiValueMap<String, String> param = new LinkedMultiValueMap<String, String>();
        param.add("lsh", paramJSON.getString("lsh"));
        param.add("kskm", paramJSON.getString("kskm"));
        param.add("sfzmhm", paramJSON.getString("sfzmhm"));
        param.add("ksxm", paramJSON.getString("ksxm"));
        param.add("sbxh", paramJSON.getString("sbxh"));
        param.add("kchp", paramJSON.getString("kchp"));
        param.add("kssj", paramJSON.getString("kssj"));

        try {
            ResponseEntity<JSONObject> resp = post("17C52", param);
            if (HttpStatus.OK.equals(resp.getStatusCode())) {
                return resp.getBody();
            } else {
                return new JSONObject();
            }
        } catch (Exception e) {
            logger.error("[17C52]调用六合一失败", e);
            return new JSONObject();
        }

    }

    /**
     * 发送<code>POST</code>方法.
     *
     * @param path  请求路径
     * @param param 请求参数
     * @return
     * @throws RestClientException
     */
    private ResponseEntity<JSONObject> post(String path, MultiValueMap param) throws RestClientException {
        String url = "http://" + wsclientServiceContext + "/" + path;
        logger.info(String.format("[android->ws-client] 请求:url=%s,param=%s", url, param.toString()));

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(param, headers);
        ResponseEntity<JSONObject> resp = restTemplate.exchange(url, HttpMethod.POST, entity, JSONObject.class);
        logger.info(String.format("[android->ws-client] 返回:%s", resp.getBody()));
        return resp;
    }
}
