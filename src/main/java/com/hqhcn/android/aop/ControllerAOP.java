package com.hqhcn.android.aop;

import com.hqh.android.entity.Carinfo;
import com.hqh.android.service.CarinfoService;
import com.hqh.android.tool.DateTools;
import com.hqh.android.tool.ResultUtils;
import com.hqh.android.web.AndroidController;
import com.hqh.android.web.BaseController;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.MACVerifier;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 处理和包装异常
 *
 * @author kejiantao
 */
@Aspect
@Component
public class ControllerAOP {
    private static final Logger logger = LoggerFactory.getLogger(ControllerAOP.class);
    /**
     * JWT秘钥
     */
    private static final byte[] SECRET = "3d990d2276917dfac04467df11fff26d".getBytes();
    private final String TOKEN_IP = "ip";
    private final String TOKEN_EXT = "ext";


    @Autowired
    private CarinfoService carinfoService;

    private String TokenErr = "Token不合法";

    /**
     * 切入web.AndroidController底下的<code>非私有</code>方法
     */
    @Pointcut("execution(* com.hqh.android.web.AndroidController.*(..)) && @annotation(com.hqh.android.aop.CheckIP)")
    public void controllerMethod() {
    }

    /**
     * 切入<code>com.hqh.android.service.AndroidService</code>里面
     * 所有<code>第一个参数名为token,最后一个参数名为ip</code>的<code>非私有</code>方法
     */
    @Pointcut("execution(* com.hqh.android.service.AndroidService.*(..)) && args(token,..,ip)")
    public void argsContainToken(String token, String ip) {
    }

    @Around("controllerMethod()")
    public Object handlerControllerMethod(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        // 参数序列化
        BaseController base = (BaseController) pjp.getTarget();
        String useableMSG = ipUseable(base.externalIP);
        if (StringUtils.isNotEmpty(useableMSG)) {
            return useableMSG;
        }

        List args = Arrays.stream(pjp.getArgs()).filter(Objects::nonNull).map(Object::toString).collect(Collectors.toList());
        Object result = pjp.proceed();
        logger.debug(pjp.getSignature() + " Args:" + args + " use_time:" + (System.currentTimeMillis() - startTime));
        return result;
    }


    @Around("argsContainToken(token,ip)")
    public Object handlerArgsContainToken(ProceedingJoinPoint pjp, String token, String ip) throws Throwable {
        long startTime = System.currentTimeMillis();

        // 检查了token就不需要检查ip了
        String tokenUseableMSG = tokenUseable(token, ip);
        if (StringUtils.isNotEmpty(tokenUseableMSG)) {
            return tokenUseableMSG;
        }

        List args = Arrays.stream(pjp.getArgs()).filter(Objects::nonNull).map(Object::toString).collect(Collectors.toList());
        Object result = pjp.proceed();
        logger.debug(pjp.getSignature() + " Args:" + args + " use_time:" + (System.currentTimeMillis() - startTime));
        return result;
    }


    /**
     * 校验token有效性<br />
     * <p>
     * JWT概念:http://www.jianshu.com/p/576dbf44b2ae
     *
     * @param token Token
     * @return com.alibaba.fastjson.JSONObject <BR\>
     * code:    0:失败,1:成功 <BR\>
     * message: Token校验失败描述  <BR\>
     * content: Token里面的内容  <BR\>
     * @throws ParseException token 解析失败
     * @throws JOSEException  secret长度小于256位
     */
    private String tokenUseable(String token, String ip) throws ParseException, JOSEException {
        String validMsg = "";
        net.minidev.json.JSONObject jsonObj = null;
        if (StringUtils.isEmpty(token)) {
            // token为空
            logger.error("Token不能为空");
            validMsg = TokenErr;
        } else {
            JWSObject jwsObject = JWSObject.parse(token);
            Payload payload = jwsObject.getPayload();
            JWSVerifier verifier = new MACVerifier(SECRET);
            jsonObj = new net.minidev.json.JSONObject();
            if (jwsObject.verify(verifier)) {
                jsonObj = payload.toJSONObject();
                // 校验ip地址 一个Token只能当前ip地址使用
                String s = jsonObj.get(TOKEN_IP) + "";
                if (!StringUtils.equals(s, ip)) {
                    // 该Token与当前请求IP不匹配
                    logger.info("该Token与当前请求IP不匹配,IP:" + ip);
                    validMsg = TokenErr;
                }
                if ("0:0:0:0:0:0:0:1".equals(ip)) {
                    validMsg = "请不要用服务器测试";
                }
                Date today = new Date();
                // 校验有效期
                String extStr = (String) jsonObj.get(TOKEN_EXT);
                Date extDay = null;
                try {
                    extDay = DateTools.toDate(extStr, DateTools.yyyy_MM_dd_HH_mm_ss);
                } catch (Exception e) {
                    logger.error("Token有效期转化日期失败.");
                    validMsg = TokenErr;
                }
                if (null == extDay || today.after(extDay)) {
                    logger.error("该Token过期,有效期:" + DateTools.getFormatDate(extDay, DateTools.yyyy_MM_dd_HH_mm_ss));
                    validMsg = TokenErr;
                }
            } else {
                // 校验失败
                validMsg = TokenErr;
            }
        }
        if (validMsg.length() > 0) {
            return ResultUtils.failure(TokenErr, "");
        }
        return "";
    }

    /**
     * 检查该IP底下有没有车辆.
     *
     * @param ip 车辆IP
     * @return 有的话返回成功
     */
    private String ipUseable(String ip) {
        if (StringUtils.isEmpty(ip)) {
            return ResultUtils.failure("access without route.", "");
        }
        // 根据ip取出车辆信息
        Carinfo carinfo = null;
        try {
            carinfo = carinfoService.queryByIP(ip);
            if (null == carinfo) {
                return ResultUtils.failure("can not find car according to ip", "");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultUtils.failure("server error", "");
        }
        if (CarinfoService.ZT_UNUSABLE.equals(carinfo.getJlczt())) {
            return ResultUtils.failure("status is not available", "");
        } else {
            return "";
        }
    }

}
