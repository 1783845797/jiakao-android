package com.hqhcn.android.web;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hqh.android.aop.CheckIP;
import com.hqh.android.cache.RedisCache;
import com.hqh.android.entity.*;
import com.hqh.android.service.*;
import com.hqh.android.tool.AttrUtils;
import com.hqh.android.tool.DateTools;
import com.hqh.android.tool.LogType;
import com.hqh.android.tool.ResultUtils;
import com.hqh.android.tool.swagger.annotation.SwaggerShow;
import com.hqh.android.webservice.TmriInvoker;
import com.hqh.android.webservice.WSInvoker;
import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

@SwaggerShow
@RestController
@Scope("prototype")
@RequestMapping(value = "android", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class AndroidController extends BaseController {
// TODO: 2018/2/28 0028 待测试 
    /**
     * 秘钥
     */
    private static final byte[] SECRET = "3d990d2276917dfac04467df11fff26d".getBytes();

    private final String FAILURE_CODE = "0";
    private final String SUCCESS_CODE = "1";

    private final String TOKEN_IP = "ip";
    private final String TOKEN_EXT = "ext";

    private String TokenErr = "Token不合法";

    @Autowired
    private AndroidService service;
    @Autowired
    private TmriInvoker tmri;
    @Autowired
    private ExamineeService examineeService;
    @Autowired
    private CarinfoService carinfoService;
    @Autowired
    private UsersService usersService;
    @Autowired
    private KsxmService ksxmService;
    @Autowired
    private GpsService gpsService;
    @Autowired
    private ExamProcService procService;
    @Autowired
    private ExamKfService kfService;
    @Autowired
    private KsldService ksldService;
    @Autowired
    private ExamsiteService examsiteService;
    @Autowired
    private CarModelService carModelService;
    @Autowired
    private VehInspRecordService vehInspRecordService;
    @Autowired
    private CameraInfoService cameraInfoService;
    @Autowired
    RedisCache cache;
    @Autowired
    WSInvoker wsInvoker;

    /**
     * 获取当前车载端连接IP
     *
     * @return 当前车载端连接IP
     */
    @ApiOperation(value = "获取当前车载端连接IP")
    @RequestMapping(value = "ip", method = RequestMethod.GET)
    public String ip() {
        return ResultUtils.success("", externalIP);
    }

    /**
     * 获取考试模式
     *
     * @return mode=1(多人)   mode=0(单人)
     */
    @ApiOperation(value = "当前考场的考试模式.0=单人,1=多人")
    @RequestMapping(value = "ksms", method = RequestMethod.GET)
    public String ksms(
            @ApiParam(value = "考试科目", allowableValues = "2,3", required = true) @RequestParam("kskm") String kskm) {
        if ("2".equalsIgnoreCase(kskm)) {
            // 科目二固定单人模式
            return ResultUtils.success("", 0);
        } else {
            // 科目三可以设定单人还是多人
            return ResultUtils.success("", InitLoad.mode());
        }
    }

    /**
     * 时间同步
     *
     * @return yyyy-MM-dd hh24:mi:ss
     */
    @RequestMapping(value = "sjtb", method = RequestMethod.GET)
    private String sjtb() {
        // 获取六合一时间
        String time = DateTools.nowTime();
        return ResultUtils.success("", time);
    }

    @CheckIP
    @ApiOperation(value = "token", hidden = true)
    @RequestMapping(value = "token", method = RequestMethod.GET)
    public String token() {
        // 生成Token并返回
        net.minidev.json.JSONObject payload = new net.minidev.json.JSONObject();
        // 有效期一天
        Date ext_day = DateUtils.addDays(new Date(), 1);
        payload.put(TOKEN_IP, externalIP);
        payload.put(TOKEN_EXT, DateTools.getFormatDate(ext_day, DateTools.yyyy_MM_dd_HH_mm_ss));
        JWSObject jwsObject = new JWSObject(new JWSHeader(JWSAlgorithm.HS256),
                new Payload(payload));
        try {
            jwsObject.sign(new MACSigner(SECRET));
        } catch (JOSEException e) {
            logger.error(e.getMessage());
            return ResultUtils.failure(e.getMessage(), "");
        }
        return ResultUtils.success("", jwsObject.serialize());
    }

    /**
     * 下载地图文件
     *
     * @throws IOException
     */
    @CheckIP
    @ApiOperation(value = "考试路段模型文件下载", notes = "返回模型内容")
    @RequestMapping(value = "data/map", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String map(@ApiParam(value = "考试路段名称") @RequestParam(value = "ksldName", required = false) String ksldName)
            throws IOException {
        Ksld entity = ksldService.getByName(ksldName);
        if (null != entity && StringUtils.isNotEmpty(entity.getModelPath())) {
            String content = FileUtils.readFileToString(new File(entity.getModelPath()), "GBK");
            return ResultUtils.success("", content);
        } else {
            return ResultUtils.failure("resource not found,", "");
        }
    }

    /**
     * 下载地图文件 - 文件
     *
     * @throws IOException
     */
    @CheckIP
    @ApiOperation(value = "考试路段模型文件下载", notes = "返回模型文件")
    @RequestMapping(value = "data/mapfile", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public void mapFile(
            @ApiParam(value = "考试路段名称") @RequestParam(value = "ksld", required = false) String ksld) throws IOException {

        if (StringUtils.isEmpty(ksld)) {
            Carinfo carinfo = carinfoService.queryByIP(externalIP);
            ksld = carinfo.getKsld();
        }

        Ksld entity = ksldService.getByName(ksld);

        if (null != entity && StringUtils.isNotEmpty(entity.getModelPath())) {
            String fileName = entity.getModelPath().substring(entity.getModelPath().lastIndexOf(File.separator) + 1);
            fileName = URLEncoder.encode(fileName, "UTF-8");
            response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
            response.getOutputStream().write(FileUtils.readFileToByteArray(new File(entity.getModelPath())));
        } else {
            response.getOutputStream().write("no resource file".getBytes());
        }
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }

    /**
     * 下载车型信息
     *
     * @throws IOException
     */
    @CheckIP
    @ApiOperation(value = "下载车辆模型文件", notes = "自动获取当前客户端IP对应车辆,不接受指定车辆")
    @RequestMapping(value = "data/car", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String car() throws IOException {
        Carinfo carinfo = getCarinfoByIP(externalIP);
        if (null == carinfo) {
            return ResultUtils.failure("not find carinfo according to request ip", "");
        } else {
            Carmodel carmodel = carModelService.getByCLPPXH(carinfo.getClppxh(), InitLoad.kcdddh);
            return ResultUtils.success("", FileUtils.readFileToString(new File(carmodel.getModelPath()), "GBK"));
        }
    }

    /**
     * 下载车型信息 - 文件格式
     *
     * @throws IOException
     */
    @CheckIP
    @ApiOperation(value = "下载车型模型文件", notes = "自动获取当前车辆")
    @RequestMapping(value = "data/carfile", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public void carfile() throws IOException {
        Carinfo carinfo = getCarinfoByIP(externalIP);
        if (null == carinfo) {
            response.getOutputStream().write("not find carinfo according to request ip".getBytes());
        } else {
            Carmodel carmodel = carModelService.getByCLPPXH(carinfo.getClppxh(), InitLoad.kcdddh);
            String fileName = carmodel.getModelPath().substring(carmodel.getModelPath().lastIndexOf(File.separator) + 1);
            fileName = URLEncoder.encode(fileName, "UTF-8");
            response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
            response.getOutputStream().write(FileUtils.readFileToByteArray(new File(carmodel.getModelPath())));
        }
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }

    @CheckIP
    @ApiOperation(value = "校验考试路段的MD5是否与服务端一致")
    @RequestMapping(value = "data/map/MD5check", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String mapMD5Check(@ApiParam(value = "考试路段MD5值", required = true) @RequestParam(value = "md5", required = true) String md5)
            throws NoSuchAlgorithmException, IOException {

        Carinfo carinfo = carinfoService.queryByIP(externalIP);
        if (null == carinfo) {
            return ResultUtils.failure("according to IP:" + externalIP + ",can not find carinfo", "");
        }

        Ksld ksld = ksldService.getByName(carinfo.getKsld());
        if (null == ksld) {
            return ResultUtils.failure("according to IP:" + externalIP + ",can not find ksld", "");
        }
        MessageDigest mMsgDigest = MessageDigest.getInstance("MD5");
        DigestInputStream dis = new DigestInputStream(FileUtils.openInputStream(new File(ksld.getModelPath())), mMsgDigest);
        byte[] tmp = new byte[128];
        while (true) {
            if (dis.read(tmp) < 128) {
                break;
            }
        }
        byte[] digest = mMsgDigest.digest();

        //关闭流，释放资源
        dis.close();
        String mapMD5 = Base64.getEncoder().encodeToString(digest);
        // X86 车载客户端 传不过来+号,所以用空格代替
        String mapMD5X86 = mapMD5.replace("+", " ");
        logger.debug("车载端传过来的MD5：" + md5);
        logger.debug("服务端生成的MD5：" + mapMD5);
        logger.debug("服务端生成的MD5(对应X86)：" + mapMD5X86);

        if (md5.equals(mapMD5)) {
            return ResultUtils.success("", "");
        } else if (md5.equals(mapMD5X86)) {
            return ResultUtils.success("", "");
        } else {
            logger.error("考试路段模型文件校验失败!车辆序号=" + carinfo.getJlcxh());
            return ResultUtils.failure("ksld model file check filed", "");
        }
    }

    @CheckIP
    @ApiOperation(value = "校验车辆模型文件的MD5是否与服务端一致", notes = "自动获取当前车辆")
    @RequestMapping(value = "data/car/MD5check", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String carMD5Check(@ApiParam(value = "车辆模型文件MD5值", required = true) @RequestParam(value = "md5", required = true) String md5)
            throws NoSuchAlgorithmException, IOException {

        Carinfo carinfo = carinfoService.queryByIP(externalIP);
        if (null == carinfo) {
            return ResultUtils.failure("according to:" + externalIP + ",can not find car");
        }

        Carmodel carmodel = carModelService.getByCLPPXH(carinfo.getClppxh(), InitLoad.kcdddh);
        if (null == carmodel) {
            return ResultUtils.failure("according to this clppxh" + carinfo.getClppxh() + ",can not find carmodel file");
        }

        MessageDigest mMsgDigest = MessageDigest.getInstance("MD5");
        DigestInputStream dis = new DigestInputStream(FileUtils.openInputStream(new File(carmodel.getModelPath())), mMsgDigest);
        byte[] tmp = new byte[128];
        while (true) {
            if (dis.read(tmp) < 128) {
                break;
            }
        }
        byte[] digest = mMsgDigest.digest();

        //关闭流，释放资源
        dis.close();
        String mapMD5 = Base64.getEncoder().encodeToString(digest);
        // X86 车载客户端 传不过来+号,所以用空格代替
        String mapMD5X86 = mapMD5.replace("+", " ");
        logger.debug("车载端传过来的MD5：" + md5);
        logger.debug("服务端生成的MD5：" + mapMD5);
        logger.debug("服务端生成的MD5(对应X86)：" + mapMD5X86);

        if (md5.equals(mapMD5)) {
            return ResultUtils.success();
        } else if (md5.equals(mapMD5X86)) {
            return ResultUtils.success();
        } else {
            logger.error("车辆模型文件校验失败!车辆序号=" + carinfo.getJlcxh());
            return ResultUtils.failure("carmodel file check failed");
        }
    }

    /**
     * 下载考试车辆信息
     */
    @ApiOperation(value = "获取客户端IP对应的考试车信息", notes = "自动获取当前客户端IP,不接受指定IP")
    @RequestMapping(value = "carinfo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String carinfo(
            @ApiParam("车载IP地址") @RequestParam(value = "ip", defaultValue = "", required = false) String ip) throws InterruptedException {

        // 判断哪台车的请求
        Carinfo carinfo = getCarinfoByIP(externalIP);
        if (null == carinfo) {
            return ResultUtils.failure("according to:" + externalIP + ",can not find car", "");
        }
        return ResultUtils.success("", carinfo);
    }

    /**
     * 考生分配
     */
    @ApiOperation(value = "返回分配过来的考生列表")
    @RequestMapping(value = "examinee", method = RequestMethod.GET)
    public String examinee() {
        // 判断哪台车的请求
        String req_ip = externalIP;
        // 根据ip取出车辆信息
        Carinfo carinfo = null;
        try {
            carinfo = carinfoService.queryByIP(req_ip);
            if (null == carinfo) {
                return ResultUtils.failure("not find carinfo according to request ip");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        List<Exampreasign> assigns = new ArrayList<>();
        try {
            assigns = examineeService.pull(carinfo.getJlcxh(), carinfo.getKskm());
        } catch (Exception e) {
            logger.error("获取考生列表失败", e);
            return ResultUtils.failure(e.getMessage());
        }

        List<Exampreasign> result = new ArrayList<>();
        for (Exampreasign assign : assigns) {
            Exampreasign exampreasign = examineeService.queryByLsh(assign.getLsh());
            if (null != exampreasign) {
                Exampreasign exampreasign1 = new Exampreasign();
                exampreasign1.setKscs(exampreasign.getKscs());
                exampreasign1.setLsh(exampreasign.getLsh());
                String uri = request.getRequestURI();
                exampreasign1.setPhoto(uri + "/" + assign.getLsh() + "/photo");
                exampreasign1.setSfzmhm(exampreasign.getSfzmhm());
                exampreasign1.setXm(exampreasign.getXm());
                exampreasign1.setZkzmbh(exampreasign.getZkzmbh());
                exampreasign1.setZt(assign.getZt());
                exampreasign1.setBdyzzt(assign.getBdyzzt());
                exampreasign1.setScyzzt(assign.getScyzzt());
                exampreasign1.setZw(exampreasign.getZw());
                exampreasign1.setHphm(carinfo.getHphm());
                exampreasign1.setKsy1(carinfo.getPky());
                // 考试状态,  根据该字段决定是否<续考>
                exampreasign1.setF1(exampreasign.getF1());

                result.add(exampreasign1);
            }
        }
        return ResultUtils.success(result);
    }

    @CheckIP
    @ApiOperation(value = "返回考生续考状态")
    @RequestMapping(value = "examinee/xukao", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String xukao(@ApiParam(value = "考生流水号", required = true) @RequestParam(value = "lsh") String lsh,
                        @ApiParam(value = "考试次数", required = true) @RequestParam(value = "kscs") int kscs) {
        List<Examproc> examprocs = procService.examproc(lsh, kscs);

        JSONArray result = new JSONArray();
        for (Examproc proc : examprocs) {
            JSONObject obj = new JSONObject();
            obj.put("ksxm", proc.getKsxm());
            if (null == proc.getJssj()) {
                obj.put("zt", 1);
            } else {
                obj.put("zt", 2);
            }
            List<ExamKf> examKfs = kfService.query(lsh, "", proc.getKsxm(), kscs);
            for (ExamKf examKf : examKfs) {
                String kfxm = obj.getString("kfxm") == null ? "" : obj.getString("kfxm");
                obj.put("kfxm", kfxm + "," + examKf.getKfxm());
            }
            if (!obj.isEmpty() && null != obj.getString("kfxm")) {
                obj.put("kfxm", obj.getString("kfxm").substring(1));
            }
            result.add(obj);
        }

        //将考生的考试状态设置成考试中
        examineeService.updateZT(lsh, ExamineeService.ZT_EXAMING);

        return ResultUtils.success("", result);
    }

    @CheckIP
    @ApiOperation("考生上车指纹判定结果上传")
    @RequestMapping(value = "examinee/zwpd", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String zwpd(@ApiParam(value = "考生流水号", required = true) @RequestParam(value = "lsh", required = true) String lsh,
                       @ApiParam(value = "指纹判定状态.1:通过,2:不通过", required = true, allowableValues = "1,2") @RequestParam(value = "zwpd", required = true) int zwpd) {
        Exampreasign exampreasign = new Exampreasign();
        exampreasign.setLsh(lsh);
        exampreasign.setScyzzt(zwpd);
        try {
            examineeService.updateByPrimaryKeySelective(exampreasign);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultUtils.failure("server work error!", "");
        }
        return ResultUtils.success("", "");
    }

    /**
     * 根据车载端的请求ip查询考试路段中的考试项目分配.<strong>有顺序</strong>
     *
     * @return [{考试项目代码1:考试项目名称1},{考试项目代码2:考试项目名称2}]
     */
    @ApiOperation(value = "返回考试项目", notes = "具体返回哪些考试项目,由客户端对应的考试车辆确定")
    @RequestMapping(value = "ksxm", method = RequestMethod.GET)
    public String ksxm(
            @ApiParam(value = "车辆序号", required = true) @RequestParam("jlcxh") String jlcxh) {
        // 根据ip取出车辆信息
        Carinfo carinfo = null;
        try {
            carinfo = carinfoService.query(InitLoad.kcdddh, jlcxh);
            if (null == carinfo) {
                return ResultUtils.failure("not find carinfo according to request ip", "");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        Ksld ksld = ksldService.getByName(carinfo.getKsld());
        if (null == ksld) {
            return ResultUtils.failure("The car not have exam route,query failed", "");
        }
        String ksxmpx = ksld.getKsxmpx();
        if (StringUtils.isEmpty(ksxmpx)) {
            return ResultUtils.failure("no test program in the vehicle is exam route", "");
        }
        JSONArray result = new JSONArray();

        Map<String, String> codeMap = ksxmService.getCodeMap(ksld.getKskm());

        String[] ksxms = ksxmpx.split(",");
        for (String ksxm : ksxms) {
            Ksxm ksxmEntity = new Ksxm();
            ksxmEntity.setCode(ksxm);
            ksxmEntity.setName(codeMap.get(ksxm));
            result.add(ksxmEntity);
        }
        return ResultUtils.success("", result);
    }

    @CheckIP
    @ApiOperation("下载考试评判项目阈值")
    @RequestMapping(value = "ksxm/threshold", method = RequestMethod.GET)
    public String threshold(
            @ApiParam(value = "考试科目", allowableValues = "2,3", required = true) @RequestParam(value = "kskm") String kskm) throws UnsupportedEncodingException {

        Examsite examsite = examsiteService.get(InitLoad.kcdddh);
        if (null == examsite) {
            return ResultUtils.success("", "");
        } else {
            String threshold;
            if ("2".equalsIgnoreCase(kskm)) {
                threshold = examsite.getF5();
            } else {
                threshold = examsite.getF4();
            }

            return ResultUtils.success("", new String(threshold.getBytes(), "GBK"));
        }
    }

    @ApiOperation(value = "返回评判项(扣分项)")
    @RequestMapping(value = "kfxm", method = RequestMethod.GET)
    public String kfxm(@ApiParam(value = "考试科目", allowableValues = "2,3") @RequestParam(value = "kskm", required = false) String kskm) throws UnsupportedEncodingException {
        // 判断哪台车的请求
        String req_ip = externalIP;
        // 根据ip取出车辆信息
        Carinfo carinfo = null;
        try {
            carinfo = carinfoService.queryByIP(req_ip);
            if (null == carinfo) {
                return ResultUtils.failure("can not find car according to request ip", "");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        // 返回科目二  和 科目三 的所有扣分项
        JSONArray kfxms = new JSONArray();
        if (StringUtils.isEmpty(kskm)) {
            kfxms.addAll(ksxmService.getKFX("2"));
            kfxms.addAll(ksxmService.getKFX("3"));
        } else {
            if ("2".equals(kskm)) {
                kfxms.addAll(ksxmService.getKFX("2"));
            } else if ("3".equals(kskm)) {
                kfxms.addAll(ksxmService.getKFX("3"));
            }
        }
        return ResultUtils.success("", kfxms);
    }

    /**
     * 陪考员 指纹/刷身份证 登录
     *
     * @return code(1 = 成功, 0 = 失败), msg(错误信息), body(返回数据)
     * @throws JOSEException
     */
    @CheckIP
    @ApiOperation(value = "陪考员指纹获取接口", notes = "不接受指定陪考员,默认返回所有的陪考元指纹信息")
    @RequestMapping(value = "pkyfingers", method = RequestMethod.GET)
    public String pkyfingers() throws JOSEException {
        // 陪考员ID=76
        List<Users> pkys = usersService.getRole(76);
        List<Users> result = new ArrayList<Users>();
        for (Users pky : pkys) {
            Users obj = new Users();
            obj.setUserCode(pky.getUserCode());
            obj.setF1(pky.getF1());
            result.add(obj);
        }

        return ResultUtils.success("", result);
    }

    /**
     * 车载端传回指纹比对成功 的 陪考员的账号,
     *
     * @param userCode 陪考员账号
     * @return {"msg":"","code":"1","body":{"photo":"/jiakao/android/pky/155/photo","userName":"张三"}}
     */
    @ApiOperation("陪考员信息查询接口")
    @RequestMapping(value = "pky/{userCode}", method = RequestMethod.GET)
    public String pky(
            @ApiParam(value = "陪考员账号", required = true) @PathVariable(value = "userCode") String userCode) {
        String ip = externalIP;
        Users result = new Users();
        // 更新车辆信息,绑定陪考员
        Carinfo carinfo = getCarinfoByIP(ip);
        if (null == carinfo) {
            return ResultUtils.failure("can not find car according to request ip", "");
        }
        try {
            UsersExample example = new UsersExample();
            example.createCriteria().andUserCodeEqualTo(userCode).andRoleIdEqualTo(76);
            List<Users> users = usersService.selectByExample(example);

            if (users == null || users.size() == 0) {
                return ResultUtils.failure("can not find user:" + userCode, "");
            } else if (users.size() > 1) {
                return ResultUtils.failure("sfzmhm repeat,login error:" + userCode, "");
            } else {
                // 陪考员登录成功后,将陪考员信息更新到发送请求的考试车辆上
                carinfo.setPky(users.get(0).getUserCode());
                carinfoService.update(carinfo);
            }
            String uri = externalIP;

            result.setUserName(users.get(0).getUserName());
            result.setPhoto(String.format("pky/%s/photo", userCode));

            // 更新用户的最近登陆IP,并刷新缓存

            Users users1 = new Users();
            users1.setLastLoginIp("");
            UsersExample usersExample = new UsersExample();
            usersExample.createCriteria().andLastLoginIpEqualTo(ip);
            usersService.updateByExampleSelective(users1, usersExample);

            Users users2 = new Users();
            users2.setUserCode(userCode);
            users2.setLastLoginIp(ip);
            users2.setLastLoginTime(new Date());
            usersService.update(users2);

            InitLoad.init_ip_userCode();
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultUtils.failure(e.getMessage(), "");
        }

        return ResultUtils.success("", result);
    }

    @CheckIP
    @ApiOperation("车载端-登录接口")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(
            @ApiParam(value = "安全员账号", required = true) @RequestParam("account") String account,
            @ApiParam(value = "安全员密码", required = true) @RequestParam("pass") String pass) {
        Users user = usersService.getUser(account, pass);

        if (null == user) {
            return ResultUtils.failure("username or password error", "");
        } else if (usersService.isPKY(user.getRoleId())) {
            // 限定角色ID=76 才能登陆监控端
            return ResultUtils.success("", user.getUserCode());
        } else {
            return ResultUtils.failure("role error", "");
        }
    }

    @CheckIP
    @ApiOperation(value = "返回陪考员头像", notes = "文件类型")
    @RequestMapping(value = "pky/{userCode}/photo", method = RequestMethod.GET, produces = "image/jpeg")
    public void pkyPhoto(
            @ApiParam(value = "陪考员账号", required = true) @PathVariable(value = "userCode", required = true) String userCode)
            throws IOException {
        Users pky = usersService.getEntity(userCode);
        if (null != pky) {
            response.getOutputStream().write(FileUtils.readFileToByteArray(new File(pky.getPhoto())));
            response.getOutputStream().flush();
            response.getOutputStream().close();
        }
    }

    @CheckIP
    @ApiOperation(value = "返回考生头像", notes = "文件类型")
    @RequestMapping(value = "examinee/{lsh}/photo", method = RequestMethod.GET)
    public void examineePhoto(
            @ApiParam(value = "考生流水号", required = true) @PathVariable(value = "lsh", required = true) String lsh)
            throws IOException {
        response.setContentType(MediaType.IMAGE_JPEG_VALUE + ";" + MediaType.IMAGE_PNG_VALUE);
        Exampreasign exampreasign = examineeService.queryByLsh(lsh);
        if (null != exampreasign) {
            response.getOutputStream().write(FileUtils.readFileToByteArray(new File(exampreasign.getPhoto())));
            response.getOutputStream().flush();
            response.getOutputStream().close();
        }
    }

    @CheckIP
    @ApiOperation(value = "车辆状态修改")
    @RequestMapping(value = "insprecord", method = RequestMethod.POST)
    public String insprecord(@ApiParam(value = "状态.0可用,1不可用", allowableValues = "0,1", required = true) @RequestParam("zt") String zt,
                             @ApiParam(value = "修改信息", required = true) @RequestParam("msg") String msg) {

        Carinfo carinfo = getCarinfoByIP(externalIP);
        carinfo.setJlczt(zt);

        VehInspRecord record = new VehInspRecord();
        record.setHphm(carinfo.getHphm());
        record.setHpzl(carinfo.getHpzl());
        record.setJklx(carinfo.getJklx());
        record.setJlcxh(carinfo.getJlcxh());
        record.setJlczt(carinfo.getJlczt());
        record.setKcdddh(carinfo.getKcdddh());
        record.setKskm(carinfo.getKskm());
        record.setSj(new Date());
        record.setMsg(msg);

        try {
            vehInspRecordService.createSelective(record);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResultUtils.failure(e.getMessage());
        }
        return ResultUtils.success();
    }

    @CheckIP
    @ApiOperation(value = "fileUpload")
    @PostMapping(value = "fileUpload")
    public String fileUpload(
            @ApiParam(value = "gps文件", required = true) @RequestParam("file") MultipartFile file) {
        SimpleDateFormat format = new SimpleDateFormat("YYYYMMDD");
        String dirName = AttrUtils.考试过程图片文件夹路径.toString() + File.separator + "GPS" + File.separator + format.format(new Date());
        String message = "";
        try {
            FileUtils.forceMkdir(new File(dirName));
            FileUtils.copyInputStreamToFile(file.getInputStream(),
                    new File(dirName + File.separator + file.getOriginalFilename()));
        } catch (Exception e) {
            logger.error("上传GPS文件失败!", e);
            message = e.getMessage();
        }
        return ResultUtils.success(message, dirName + File.separator + file.getOriginalFilename());
    }

    @ApiOperation(value = "apk下载")
    @GetMapping(value = "apk/type/{type}")
    public void apkDownLoad(
            @ApiParam(allowableValues = "1,2,3", value = "APK类型,1=驾培,2=驾考科目二,3=驾考科目三") @PathVariable("type") String type) {
        File apkFile = null;
        if ("1".equals(type)) {
            apkFile = new File("C:\\jiakao\\res\\dlexam.apk");
        } else if ("2".equals(type)) {
            apkFile = new File("C:\\jiakao\\res\\jiakao_km2.apk");
        } else if ("3".equals(type)) {
            apkFile = new File("C:\\jiakao\\res\\jiakao_km3.apk");
        }
        if (null != apkFile && apkFile.exists()) {
            try {
                response.setContentType("application/vnd.android.package-archive");
                response.addHeader("Content-Disposition", "attachment;filename=" + apkFile.getName());
                response.getOutputStream().write(FileUtils.readFileToByteArray(apkFile));
                response.getOutputStream().flush();
                response.getOutputStream().close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            response.setStatus(HttpStatus.NO_CONTENT.value());
        }
    }

    @ApiOperation("获取科目二场地摄像头RTSP地址")
    @GetMapping("rtsp")
    public String rtsp(
            @ApiParam(value = "考试项目", required = true) @RequestParam("ksxm") String ksxm) {
        Carinfo carinfo = carinfoService.queryByIP(externalIP);
        if (null == carinfo || null == carinfo.getKsld() || null == carinfo.getKskm()) {
            return ResultUtils.failure("考试路段或者考试科目未配置");
        }
        CameraInfoExample example = new CameraInfoExample();
        example.createCriteria().andKsldEqualTo(carinfo.getKsld()).andKskmEqualTo(carinfo.getKskm()).andKsxmEqualTo(ksxm);
        List<CameraInfo> cameraInfos = cameraInfoService.selectByExample(example);
        if (CollectionUtils.isNotEmpty(cameraInfos)) {
            CameraInfo cameraInfo = cameraInfos.get(0);
            String rtsp = String.format("rtsp://%s:%s@%s:554/stream", cameraInfo.getAccount(), cameraInfo.getPassword(), cameraInfo.getIp());
            return ResultUtils.success("", rtsp);
        } else {
            return ResultUtils.success("", "");
        }
    }


    // --------------服务内调用----------------
    @ApiOperation(value = "kskmbegin", hidden = true)
    @RequestMapping(value = "kskmbegin", method = RequestMethod.POST)
    public String kskmBegin1(String json) {
        JSONObject params = JSONObject.parseObject(json);
        String result = service.kskmBegin(
                params.getString("token"),
                params.getString("kskm"),
                params.getString("jlcxh"),
                params.getString("lsh"),
                params.getString("kscs"),
                params.getString("kssj"),
                params.getString("ip"));

        JSONObject resultJson = JSONObject.parseObject(result);
        if (SUCCESS_CODE.equals(resultJson.getString("code"))) {
            logService.info(LogType.car, params.getString("ip"), "", "2", "考试科目开始", InitLoad.ip_userCode.get(params.getString("ip")), removeToken(params));
        }
        return result;
    }

    @ApiOperation(value = "ksxmbegin", hidden = true)
    @RequestMapping(value = "ksxmbegin", method = RequestMethod.POST)
    public String ksxmBegin1(String json) {
        final JSONObject params = JSONObject.parseObject(json);

        String result = service.ksxmBegin(
                params.getString("token"),
                params.getString("lsh"),
                params.getString("kskm"),
                params.getString("jlcxh"),
                params.getString("ksxm"),
                params.getString("kscs"),
                params.getString("kssj"),
                params.getString("ip"));

        JSONObject resultJson = JSONObject.parseObject(result);
        logService.info(LogType.car, params.getString("ip"), "", "2", "考试项目开始", InitLoad.ip_userCode.get(params.getString("ip")), removeToken(params), resultJson.getString("code"));
        return result;
    }

    @ApiOperation(value = "koufen", hidden = true)
    @RequestMapping(value = "koufen", method = RequestMethod.POST)
    public String koufen1(String json) {
        JSONObject params = JSONObject.parseObject(json);
        String result = service.koufen(
                params.getString("token"),
                params.getString("lsh"),
                params.getString("kskm"),
                params.getString("ksxm"),
                params.getString("jlcxh"),
                params.getString("kfxm"),
                params.getString("sfzmhm"),
                params.getString("kfsj"),
                params.getString("kscs"),
                params.getString("ip"));

        JSONObject resultJson = JSONObject.parseObject(result);
        logService.info(LogType.car, params.getString("ip"), "", "2", "扣分", InitLoad.ip_userCode.get(params.getString("ip")), removeToken(params), resultJson.getString("code"));
        return result;
    }

    @ApiOperation(value = "ksxmend", hidden = true)
    @RequestMapping(value = "ksxmend", method = RequestMethod.POST)
    public String ksxmEnd1(String json) {
        JSONObject params = JSONObject.parseObject(json);
        String result = service.ksxmEnd(
                params.getString("token"),
                params.getString("lsh"),
                params.getString("kskm"),
                params.getString("ksxm"),
                params.getString("jlcxh"),

                params.getString("kscs"),
                params.getString("jssj"),
                params.getString("ip"));

        JSONObject resultJson = JSONObject.parseObject(result);
        logService.info(LogType.car, params.getString("ip"), "", "2", "考试项目结束", InitLoad.ip_userCode.get(params.getString("ip")), removeToken(params), resultJson.getString("code"));
        return result;
    }

    @ApiOperation(value = "kskmend", hidden = true)
    @RequestMapping(value = "kskmend", method = RequestMethod.POST)
    public String kskmEnd1(String json) {
        JSONObject params = JSONObject.parseObject(json);
        String result = service.kskmEnd(
                params.getString("token"),
                params.getString("kskm"),
                params.getString("jlcxh"),
                params.getString("lsh"),
                params.getString("kscs"),
                params.getString("jssj"),
                params.getString("kscj"),
                params.getString("ip"));

        JSONObject resultJson = JSONObject.parseObject(result);
        logService.info(LogType.car, params.getString("ip"), "", "2", "考试科目结束", InitLoad.ip_userCode.get(params.getString("ip")), removeToken(params), resultJson.getString("code"));
        return result;
    }

    @ApiOperation(value = "gps", hidden = true)
    @RequestMapping(value = "gps", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String gpsCloud(String json) {
        JSONObject params = JSONObject.parseObject(json);
        String result = service.gps(
                params.getString("token"),
                params.getString("kskm"),
                params.getString("ksxm"),
                params.getString("jlcxh"),
                params.getString("lsh"),
                params.getString("kscs"),
                params.getString("gps"),
                params.getString("ip"));

//        JSONObject resultJson = JSONObject.parseObject(result);
//        if (SUCCESS_CODE.equals(resultJson.getString("code"))) {
//            logService.info(LogType.car, params.getString("ip"), "", "2", "GPS", InitLoad.ip_userCode.get(params.getString("ip")), removeToken(params));
//        }
        return result;
    }

    // --------通用方法---------

    /**
     * 根据ip取出车辆信息
     *
     * @param ip 请求客户端IP
     * @return 车辆信息
     */
    private Carinfo getCarinfoByIP(String ip) {
        // 根据ip取出车辆信息
        Carinfo carinfo = null;
        try {
            carinfo = carinfoService.queryByIP(ip);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return carinfo;
    }


    private String removeToken(JSONObject jsonObject) {
        jsonObject.remove("token");
        return jsonObject.toJSONString();
    }


    //    测试接口
    @ApiOperation(value = "测试用接口-地图模型")
    @RequestMapping(value = "map11", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    private String map11() throws IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return FileUtils.readFileToString(new File("D:\\vv\\map.json"), "UTF-8");
    }

    @ApiOperation(value = "测试用接口-车辆模型")
    @RequestMapping(value = "car11", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    private String car11() throws IOException {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return FileUtils.readFileToString(new File("D:\\vv\\car.json"), "UTF-8");
    }

    @ApiOperation(value = "测试用接口-车辆gps轨迹模型")
    @RequestMapping(value = "gps", method = RequestMethod.GET)
    private String gps11(@ApiParam(value = "lsh", required = true) @RequestParam("lsh") String lsh,
                 @ApiParam(value = "kscs", required = true) @RequestParam("kscs") int kscs,
                 @ApiParam(value = "ksxm", required = true) @RequestParam("ksxm") String ksxm) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        long before = System.currentTimeMillis();
        JSONArray gpsJSONArray = new JSONArray();
        Gps gpsObj = gpsService.select(lsh, kscs, ksxm);

        String gps = StringUtils.isNotEmpty(gpsObj.getGps()) ? gpsObj.getGps() : "";

        Stream<String> stream = Stream.of(gps.split("\\$"));
        stream.filter(StringUtils::isNotEmpty)
                .map(line -> line.split(","))
                .map(v -> gps(v[3], v[6], v[46], v[7], v[8]))
                .forEach(gpsJSONArray::add);
        logger.debug("耗时:{}", System.currentTimeMillis() - before);
        return gpsJSONArray.toJSONString();
    }

    /**
     * @param angle 方向角
     * @param name  对应地图上项目名称
     * @param time  时间戳
     * @param x     平面坐标X轴
     * @param y     平面坐标Y轴
     */
    private JSONObject gps(String angle, String name, String time, String x, String y) {
        JSONObject gpsJson = new JSONObject();
        gpsJson.put("angle", angle);
        gpsJson.put("name", name);
        gpsJson.put("time", time);
        gpsJson.put("x", x);
        gpsJson.put("y", y);
        return gpsJson;
    }

}
