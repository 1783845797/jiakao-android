package com.hqhcn.android.tool.hikvision;


import com.alibaba.fastjson.JSONArray;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;

/**
 * dvr与camera远程驱动调用
 *
 * @author braveheartwzm
 */
@Component
public class RemoteDvrCameraDriver {

    @Autowired
    DVRComConfig dvrComConfig0;

    protected static final Logger logger = LoggerFactory.getLogger(RemoteDvrCameraDriver.class);
    /**
     * 远程服务请求参数名称：指令
     */
    private static final String PARAM_NAME_COMMAND = "command";
    /**
     * 远程服务请求参数名称：数据
     */
    private static final String PARAM_NAME_DATA = "datas";
    static DVRComConfig dvrComConfig;

    @PostConstruct
    void init() {
        dvrComConfig = dvrComConfig0;
    }

    /**
     * 调用驱动
     *
     * @param commandName 指令名称
     * @param params      参数数组，请按顺序写入
     */
    private static void invokeDriver(String commandName, String... params) {
        OkHttpClient client = new OkHttpClient();

        RequestBody formBody = new FormBody.Builder()
                .add(PARAM_NAME_COMMAND, commandName)
                .add(PARAM_NAME_DATA, JSONArray.toJSONString(params))
                .build();

        Request request = new Request.Builder()
                .url(dvrComConfig.getUrl())
                .post(formBody)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                logger.error("连接拍照服务失败");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    logger.error("Unexpected code " + response);
                }

                String ret = response.body().string();
                if ("[\"1\",\"true\"]".equals(ret)){
                    // 拍照成功
                }
            }
        });


//        Response response = null;
//        try {
//            response = client.newCall(request).execute();
//            if (!response.isSuccessful()){
//                // 请求失败
//                System.out.println("请求失败");
//            }else {
//                System.out.println(response.body().string());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "";
    }

    /**
     * 1.按时间下载视频
     *
     * @param command   驱动指令
     * @param ip        DVR的IP地址
     * @param port      端口
     * @param account   登陆账号
     * @param password  密码
     * @param channel   通道号
     * @param startTime 开始时间 yyyy-MM-dd HH:mm:ss
     * @param endTime   结束时间 yyyy-MM-dd HH:mm:ss
     * @param filePath  存放地址
     */
//    public static String downLoadVideo(String command, String ip, String port,
//                                       String account, String password, String channel, String startTime,
//                                       String endTime, String filePath) {
//        return invokeDriver(command, ip, port, account, password, channel,
//                startTime, endTime, filePath);
//    }

    /**
     * 2.实时抓拍图片
     *
     * @param command     驱动指令
     * @param ip          DVR/IPC的IP地址
     * @param port        端口
     * @param account     登陆账号
     * @param password    密码
     * @param filePath    存放地址
     * @param channel     通道号
     * @param wPicSize    图片大小
     * @param wPicQuality 图片质量
     */
    public static void captureJPEGPicture(String command, String ip,
                                          String port, String account, String password, String filePath,
                                          String channel, String wPicSize, String wPicQuality) {
        invokeDriver(command, ip, port, account, password, filePath,
                channel, wPicSize, wPicQuality);
    }

    /**
     * 3.同步时间
     *
     * @param command  驱动指令
     * @param ip       DVR/IPC的IP地址
     * @param port     端口
     * @param account  登陆账号
     * @param password 密码
     * @param channel  通道号
     * @param time     时间 yyyy-MM-dd HH:mm:ss
     */
//    public static String timeSyn(String command, String ip, String port,
//                                 String account, String password, String channel, String time) {
//        return invokeDriver(command, ip, port, account, password, channel, time);
//    }

    /**
     * 4.手动开始录像
     *
     * @param command  驱动指令
     * @param ip       DVR的IP地址
     * @param port     端口
     * @param account  登陆账号
     * @param password 密码
     * @param channel  通道号
     */
//    public static String startDVRRecord(String command, String ip, String port,
//                                        String account, String password, String channel) {
//        return invokeDriver(command, ip, port, account, password, channel);
//    }

    /**
     * 5.手动停止录像
     *
     * @param command  驱动指令
     * @param ip       DVR的IP地址
     * @param port     端口
     * @param account  登陆账号
     * @param password 密码
     * @param channel  通道号
     */
//    public static String stopDVRRecord(String command, String ip, String port,
//                                       String account, String password, String channel) {
//        return invokeDriver(command, ip, port, account, password, channel);
//    }

}
