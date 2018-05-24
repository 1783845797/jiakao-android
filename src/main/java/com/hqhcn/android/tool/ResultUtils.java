package com.hqhcn.android.tool;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 处理web包中的接口返回信息的工具类
 *
 * @author kejiangtao
 */
@Data
@AllArgsConstructor
public class ResultUtils {

    private static final String FAILURE_CODE = "0";
    private static final String SUCCESS_CODE = "1";

    String code;
    String msg;
    Object body;

    public static String success() {
        return success("", "");
    }

    public static String success(Object body) {
        return success("", body);
    }

    /**
     * 操作成功
     *
     * @param msg  操作消息
     * @param body 返回内容
     */
    public static String success(String msg, Object body) {
        JSONObject result = new JSONObject();
        result.put("code", SUCCESS_CODE);
        result.put("msg", msg);
        result.put("body", body == null ? "" : body);
        return result.toJSONString();
    }

    public static String failure(String msg) {
        return failure(msg, "");
    }

    /**
     * 操作失败
     *
     * @param msg  失败描述
     * @param body 返回内容
     * @return
     */
    public static String failure(String msg, Object body) {
        JSONObject result = new JSONObject();
        result.put("code", FAILURE_CODE);
        result.put("msg", msg);
        result.put("body", body == null ? "" : body);
        return result.toJSONString();
    }

    @Override
    public String toString() {
        JSONObject result = new JSONObject();
        result.put("code", code);
        result.put("msg", msg);
        result.put("body", body == null ? "" : body);
        return result.toJSONString();
    }
}
