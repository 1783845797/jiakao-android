package com.hqhcn.android.web;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hqh.android.entity.*;
import com.hqh.android.service.*;
import com.hqh.android.tool.AttrUtils;
import com.hqh.android.tool.DateTools;
import com.hqh.android.tool.LogType;
import com.hqh.android.tool.swagger.annotation.SwaggerShow;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SwaggerShow
@Api(description = "监控端接口", tags = {"monitor"})
@RestController
@RequestMapping(value = "monitor", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class JKContorller extends BaseController{

    @Autowired
    NvrInfoService nvrInfoService;
    @Autowired
    CarinfoService carinfoService;
    @Autowired
    UsersService usersService;
    @Autowired
    KsldService ksldService;
    @Autowired
    KsxmService ksxmService;
    @Autowired
    AndroidController android;
    @Autowired
    ExamsiteService examsiteService;
    @Autowired
    ExamineeService examineeService;
    @Autowired
    MonitorPolicyService monitorPolicyService;
    @Autowired
    CameraInfoService camera;

    private final String FAILURE_CODE = "0";
    private final String SUCCESS_CODE = "1";

    @ApiOperation("监控端-登录接口")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(
            @ApiParam(value = "监控角色账号", required = true) @RequestParam("account") String account,
            @ApiParam(value = "监控角色密码", required = true) @RequestParam("pass") String pass) {
        Users user = usersService.getUser(account, pass);

        if (null == user) {
            return result(FAILURE_CODE, "用户名或密码错误", "");
        } else if (UsersService.monitorRoleID.equals(user.getRoleId() + "")) {
            // 限定角色ID=77 才能登陆监控端
            logService.info(LogType.monitor, externalIP, "", "2", "监控端登陆", account, "");
            user.setLastLoginIp(externalIP);
            user.setLastLoginTime(new Date());
            usersService.update(user);
            InitLoad.ip_userCode.put(externalIP, user.getUserCode());
            return result(SUCCESS_CODE, "", "");
        } else {
            return result(FAILURE_CODE, "角色不对", "");
        }
    }

    @ApiOperation("考生状态统计(当日)-查询接口")
    @RequestMapping(value = "count/{kskm}", method = RequestMethod.GET)
    private String count(
            @ApiParam(value = "考试科目", required = true) @PathVariable("kskm") String kskm) {
        ExampreasignExample exampleAll = new ExampreasignExample();
        exampleAll.createCriteria().andKskmEqualTo(kskm).andYkrqEqualTo(DateTools.toDate(DateTools.getYMD(), DateTools.yyyyMMdd));


        ExampreasignExample example89 = new ExampreasignExample();
        example89.createCriteria().andKskmEqualTo(kskm)
                .andZtIn(Arrays.asList(ExamineeService.ZT_EXAMEND, ExamineeService.ZT_EXAMENDOUTCAR))
                .andYkrqEqualTo(DateTools.toDate(DateTools.getYMD(), DateTools.yyyyMMdd));


        ExampreasignExample example012346 = new ExampreasignExample();
        example012346.createCriteria().andKskmEqualTo(kskm).andZtIn(Arrays.asList(
                ExamineeService.ZT_UNCHECKIN,
                ExamineeService.ZT_UNVERIFY,
                ExamineeService.ZT_UNASSIGN,
                ExamineeService.ZT_NOTINCAR,
                ExamineeService.ZT_NOEXAM,
                ExamineeService.ZT_EXAMMISSING))
                .andYkrqEqualTo(DateTools.toDate(DateTools.getYMD(), DateTools.yyyyMMdd));

        ExampreasignExample example57 = new ExampreasignExample();
        example57.createCriteria().andKskmEqualTo(kskm).andZtIn(Arrays.asList(
                ExamineeService.ZT_EXAMING,
                ExamineeService.ZT_EXAM1STEND))
                .andYkrqEqualTo(DateTools.toDate(DateTools.getYMD(), DateTools.yyyyMMdd));

        ExampreasignExample examplePass = new ExampreasignExample();
        if ("2".equalsIgnoreCase(kskm)) {
            examplePass.createCriteria().andKskmEqualTo(kskm).andKscjGreaterThanOrEqualTo(AttrUtils.科目二及格线.toInt())
                    .andYkrqEqualTo(DateTools.toDate(DateTools.getYMD(), DateTools.yyyyMMdd));
        } else if ("3".equals(kskm)) {
            examplePass.createCriteria()
                    .andKskmEqualTo(kskm)
                    .andZtIn(Arrays.asList(
                            ExamineeService.ZT_EXAMEND,
                            ExamineeService.ZT_EXAMENDOUTCAR))
                    .andKscjGreaterThanOrEqualTo(AttrUtils.科目三及格线.toInt())
                    .andYkrqEqualTo(DateTools.toDate(DateTools.getYMD(), DateTools.yyyyMMdd));
        }

        try {
            // 总人数
            long countAll = examineeService.count(exampleAll);
            // 已考人数
            long count89 = examineeService.count(example89);
            // 考试中
            long count57 = examineeService.count(example57);
            // 未考人数
            long count012346 = examineeService.count(example012346);
            // 及格人数
            long countpass = examineeService.count(examplePass);

            JSONObject result = new JSONObject();
            result.put("zrs", countAll);
            result.put("ykrs", count89);
            result.put("wkrs", count012346);
            result.put("ksz", count57);
            result.put("hgrs", countpass);

            return result(SUCCESS_CODE, "", result);
        } catch (Exception e) {
            return result(FAILURE_CODE, e.getMessage(), "");
        }
    }

    @ApiOperation(value = "获取指定监控端下所有的车辆信息",notes = "测试专用")
    @RequestMapping(value = "{ip:(?:\\d+\\.){3}\\d{1,}}/carinfos", method = RequestMethod.GET)
    private String retrieveCarinfoByMonitorIP(
            @ApiParam(value = "监控端IP", required = true) @PathVariable("ip") String ip) {
        List<MonitorPolicy> monitorPolicies = monitorPolicyService.query(ip, null, null);
        JSONArray result = new JSONArray();
        for (MonitorPolicy policy : monitorPolicies) {
            String jlcxh = policy.getJlcxh();
            Carinfo carinfo = carinfoService.query(InitLoad.kcdddh, jlcxh);
            if (null != carinfo) {
                JSONObject carinfoJSON = (JSONObject) JSONObject.toJSON(carinfo);
                carinfoJSON.put("cam1Nvr", nvrInfoService.selectByPrimaryKey(carinfo.getCam1Nvr()));
                carinfoJSON.put("cam2Nvr", nvrInfoService.selectByPrimaryKey(carinfo.getCam2Nvr()));
                carinfoJSON.put("cam3Nvr", nvrInfoService.selectByPrimaryKey(carinfo.getCam3Nvr()));
                result.add(carinfoJSON);
            }
        }
        return result(SUCCESS_CODE, "", result);
    }

    @ApiOperation("获取该监控端下所有的车辆信息")
    @RequestMapping(value = "carinfos", method = RequestMethod.GET)
    private String retrieveCarinfoByMonitorIP() {
        return retrieveCarinfoByMonitorIP(externalIP);
    }

    @ApiOperation("获取考生信息")
    @RequestMapping(value = "examinee/{lsh}", method = RequestMethod.GET)
    private String examinee(
            @ApiParam(value = "考生流水号", required = true) @PathVariable("lsh") String lsh) {
        Exampreasign exampreasign = examineeService.queryByLsh(lsh);
        if (null != exampreasign) {
            exampreasign.setPhoto(request.getRequestURI() + "/photo");
            JSONObject exampreasignJSON = (JSONObject) JSONObject.toJSON(exampreasign);
            if ("1".equals(exampreasign.getF1())){
                String xukaoMSG = android.xukao(exampreasign.getLsh(),exampreasign.getKscs());
                JSONObject xukaoJson = JSONObject.parseObject(xukaoMSG);
                exampreasignJSON.put("ksxms",xukaoJson.get("body"));
            }
            return result(SUCCESS_CODE, "", exampreasignJSON);
        } else {
            return result(FAILURE_CODE, String.format("找不到流水号为(%s)的考生",lsh), "");
        }
    }

    @ApiOperation(value = "返回考生头像", notes = "文件类型")
    @RequestMapping(value = "examinee/{lsh}/photo", method = RequestMethod.GET)
    private void examineePhoto(
            @ApiParam(value = "考生流水号", required = true) @PathVariable(value = "lsh") String lsh)
            throws IOException {
        response.setHeader("Accept", "image/webp");
        Exampreasign exampreasign = examineeService.queryByLsh(lsh);
        if (null != exampreasign) {
            response.getOutputStream().write(FileUtils.readFileToByteArray(new File(exampreasign.getPhoto())));
            response.getOutputStream().flush();
            response.getOutputStream().close();
        }
    }

    @ApiOperation(value = "返回扣分项目信息")
    @RequestMapping(value = "kfxm", method = RequestMethod.GET)
    private String kfxm(
            @ApiParam(value = "考试科目", allowableValues = "2,3") @RequestParam(value = "kskm", required = false) String kskm) {
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
        return result(SUCCESS_CODE, "", kfxms);
    }

    @ApiOperation("考试项目-查询接口")
    @RequestMapping(value = "ksxm", method = RequestMethod.GET)
    private String ksxm(
            @ApiParam(value = "教练车序号", required = true) @RequestParam("jlcxh") String jlcxh) {
        return android.ksxm(jlcxh);
    }

    @ApiOperation("科目二摄像头信息")
    @RequestMapping(value = "camera", method = RequestMethod.GET)
    private String camera(
            @ApiParam(value = "车辆序号", required = true) @RequestParam("jlcxh") String jlcxh,
            @ApiParam(value = "考试项目", required = true) @RequestParam("ksxm") String ksxm) {
        Carinfo carinfo = carinfoService.query(InitLoad.kcdddh, jlcxh);
        if (null == carinfo || StringUtils.isEmpty(carinfo.getKsld())) {
            return result(FAILURE_CODE, "找不到该车辆的考试路段信息", new JSONObject());
        }

        CameraInfo entity = new CameraInfo();
        entity.setKsld(carinfo.getKsld());
        entity.setKsxm(ksxm);
        List<CameraInfo> cameraInfos = camera.select(entity);
        if (CollectionUtils.isEmpty(cameraInfos)) {
            return result(FAILURE_CODE, "找不到摄像头配置", new JSONObject());
        }
        CameraInfo cameraInfo = cameraInfos.get(0);

        NvrInfo nvrInfo = nvrInfoService.selectByPrimaryKey(cameraInfo.getNvrId());
        if (null == nvrInfo) {
            return result(FAILURE_CODE, "找不到NVR配置", new JSONObject());
        } else {
            JSONObject result = (JSONObject) JSONObject.toJSON(cameraInfo);
            return result(SUCCESS_CODE, "", result);
        }
    }


    private String result(String code, String msg, Object body) {
        JSONObject result = new JSONObject();
        result.put("code", code);
        result.put("msg", msg);
        result.put("body", body == null ? "" : body);
        return result.toJSONString();
    }
}
