package com.hqhcn.android.tool.hikvision;


import com.hqh.android.entity.CameraInfo;
import com.hqh.android.entity.Carinfo;
import com.hqh.android.entity.Ksld;
import com.hqh.android.entity.NvrInfo;
import com.hqh.android.service.CameraInfoService;
import com.hqh.android.service.CarinfoService;
import com.hqh.android.service.KsldService;
import com.hqh.android.tool.AttrUtils;
import com.hqh.android.web.InitLoad;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * dvr自动拍照
 *
 * @author kk
 * @ClassName: DvrPicHelper
 * @date 2017-12-7 上午09:58:35
 */
@Component
public class DvrPicHelper {

    @Autowired
    DVRComConfig dvrComConfig0;
    @Autowired
    KsldService ksldService0;
    @Autowired
    CameraInfoService cameraInfoService0;
    @Autowired
    CarinfoService carinfoService0;

    static DVRComConfig dvrComConfig;
    static CameraInfoService cameraInfoService;
    static KsldService ksldService;
    static CarinfoService carinfoService;

    @PostConstruct
    void init() {
        dvrComConfig = dvrComConfig0;
        cameraInfoService = cameraInfoService0;
        ksldService = ksldService0;
        carinfoService = carinfoService0;
    }

    protected static final Logger logger = LoggerFactory.getLogger(DvrPicHelper.class);

    /**
     * @param ip      IP地址
     * @param port    端口号
     * @param usr     用户名
     * @param pwd     密码
     * @param channel 频道号
     * @param path    存放图片的目录
     * @return String 返回类型
     * @Title: getPic
     * @author zl 2014-12-22
     */
    public static void getPic(final String ip, final String port,
                              final String usr, final String pwd, final String channel,
                              final String path) {
        /**
         * DVR_COMLib.VideoCtrl是com组件里面CLSID，或者叫progID,就是控件id
         *
         */
        String method = dvrComConfig.getMethod();
        String picsize = dvrComConfig.getPicSize();
        String quality = dvrComConfig.getPicQuality();

        /**
         * CaptureJPEGPicture是com组件里面的方法名，
         * 后面"192.168.1.122","8000","admin","12345"
         * ,"D:\\pic\\"+Math.random()*10+
         * ".jpg","1","0","2"是方法里面要传递的参数,这里调用的是NVR自动抓拍图片
         * variant是方法返回，成功返回：true，失败返回错误信息
         */


        RemoteDvrCameraDriver.captureJPEGPicture(method, ip, port,
                usr, pwd, path, channel, picsize, quality);

    }

    /**
     * 拍照
     *
     * @param jlcxh   车辆序号
     * @param ksxm    当前要拍照的项目
     * @param picPath 照片存储路径
     */
    public static void getPic(final String jlcxh, final String ksxm, final String picPath) {
        Carinfo carinfo = carinfoService.query(AttrUtils.考试地点.toString(),jlcxh);
        NvrInfo nvrInfo;
        String channel = "1";
        if (null != carinfo && "2".equals(carinfo.getKskm())) {
            // 科目二的车辆
            String ksldName = carinfo.getKsld();
            Ksld ksld = ksldService.getByName(ksldName);
            if (null == ksld){
                logger.error(String.format("科目二考车(%s)没有配置考试路线,拍照失败!ksld=%s", jlcxh, carinfo.getKsld()));
                return;
            }
            CameraInfo cameraInfo = new CameraInfo();
            cameraInfo.setKsld(ksld.getName());
            cameraInfo.setKsxm(ksxm);
            List<CameraInfo> cameraInfoList = cameraInfoService.select(cameraInfo);
            if (CollectionUtils.isNotEmpty(cameraInfoList)) {
                cameraInfo = cameraInfoList.get(0);
                nvrInfo = InitLoad.name_nvrinfo.get(cameraInfo.getNvrId());
                channel = cameraInfo.getNvrChannel();
            }else {
                logger.error(String.format("科目二考车(%s)没有配置场地摄像头,拍照失败!ksld=%s,ksxm=%s", jlcxh, carinfo.getKsld(), ksxm));
                return;
            }
        }else{
            nvrInfo = InitLoad.name_nvrinfo.get(carinfo.getCam1Nvr());
            try {
                channel = carinfo.getCam1NvrChannel();
            } catch (Exception e) {
                logger.error("考车(" + jlcxh + ")1号摄像头通道号非数字:" + carinfo.getCam1NvrChannel());
            }
        }

        getPic(nvrInfo.getIp(), nvrInfo.getPort(), nvrInfo.getAccount(), nvrInfo.getPassword(), channel, picPath);
    }

//    public static void main(String[] arg) {
//        // 加载DVR配置
//        DVRComConfig.loadConfig();
//
//        String filename = Math.random() * 10 + ".jpg";
//        try {
//            Thread.sleep(10 * 1000);
//            System.out.println("--------------" + new Date());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        getPic("192.168.10.220", "8000", "admin", "ioidea@0715", "34", "D:\\picpath\\aa.jpg");
//    }
}
