package com.hqhcn.android.web;

import com.hqh.android.dao.AttrMapper;
import com.hqh.android.entity.*;
import com.hqh.android.service.*;
import com.hqh.android.tool.AttrUtils;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.File;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Controller
@RequestMapping("system")
public class InitLoad extends HttpServlet {
    // TODO: 2017/9/27 0027  启动的时候要检测redis的连接,不要等到用到的时候报错

    protected static final Logger logger = LoggerFactory.getLogger(InitLoad.class);

    @Autowired
    private UsersService usersService0;
    @Autowired
    private ExamsiteService examsiteService0;
    @Autowired
    private CodeService codeService;
    @Autowired
    private KsxmService ksxmService0;
    @Autowired
    private CarinfoService carinfoService0;
    @Autowired
    private NvrInfoService nvrInfoService0;
    @Autowired
    private KsldService ksldService0;
    @Autowired
    AttrMapper mapper0;

    public static AttrMapper mapper;
    public static KsxmService ksxmService;
    public static ExamsiteService examsiteService;
    public static CarinfoService carinfoService;
    public static NvrInfoService nvrInfoService;
    public static UsersService usersService;
    public static KsldService ksldService;

    public Map<String, List> role_permission;
    public static Map<Integer, String> KSZT = new HashMap<>();

    public static String kcdddh = "3202820203";
    public static String dbType = "mysql";

    /**
     * 考车最近一次发送数据的时间戳<br />
     * {"考车1序号":"时间戳1","考车2序号":"时间戳2"...}
     **/
    public static ConcurrentMap<String, Long> jlcxh_timestamp = new ConcurrentHashMap<>();

    /**
     * 监控策略<br />
     * {"考车1":"监控端IP1","考车2":"监控端IP1","考车3":"监控端IP2"...}
     **/
    public static HashMap<String, String> monitor_policy = new HashMap<String, String>();

    @ResponseBody
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }


    @Override
    @PostConstruct
    public void init() throws ServletException {
        // 初始化
        KSZT.put(0, "未报到");
        KSZT.put(1, "已报道未验证");
        KSZT.put(2, "验证通过考车未分配");
        KSZT.put(3, "已分配未上车");
        KSZT.put(4, "已上车未考试");
        KSZT.put(5, "考试中");
        KSZT.put(6, "缺考");
        KSZT.put(7, "第一次考试完成");
        KSZT.put(8, "考试完成未下车");
        KSZT.put(9, "考完下车");

        super.init();
        ksxmService = ksxmService0;
        examsiteService = examsiteService0;
        carinfoService = carinfoService0;
        nvrInfoService = nvrInfoService0;
        mapper = mapper0;
        usersService = usersService0;
        ksldService = ksldService0;
        reload();
    }

    @ResponseBody
    @RequestMapping("refresh")
    String reload() {

        init_user();
        init_Code();
        init_kfxmMap();
        init_ksxmcode_name();
        init_jlcxh_carinfo();
        init_name_nvrinfo();
        init_id_ksld();
        init_attrName_Value();
        init_ip_userCode();

        createResDir();
        return "ok";
    }

    /**
     * 创建资源文件夹
     */
    void createResDir() {
        try {
            if (!new File(AttrUtils.资源模型文件夹.toString()).exists()) {
                FileUtils.forceMkdir(new File(AttrUtils.资源模型文件夹.toString()));
            }
        } catch (Exception e) {
            logger.error("创建资源文件夹失败!请检查" + AttrUtils.资源模型文件夹.toString(), e);
        }
        try {
            if (!new File(AttrUtils.考试过程图片文件夹路径.toString()).exists()) {
                FileUtils.forceMkdir(new File(AttrUtils.考试过程图片文件夹路径.toString()));
            }
        } catch (Exception e) {
            logger.error("创建资源文件夹失败!请检查" + AttrUtils.考试过程图片文件夹路径.toString(), e);
        }

        try {
            if (!new File(AttrUtils.考生图片文件夹.toString()).exists()) {
                FileUtils.forceMkdir(new File(AttrUtils.考生图片文件夹.toString()));
            }
        } catch (Exception e) {
            logger.error("创建资源文件夹失败!请检查" + AttrUtils.考生图片文件夹.toString(), e);
        }

    }


    /**
     * 车载考试分组模式
     *
     * @return 每辆车上同时上车的人数
     */
    public static int examineeNum() {
        Examsite examsite = examsiteService.get(InitLoad.kcdddh);
        return Integer.parseInt(examsite.getF1());
    }

    /**
     * 考试分组模式
     *
     * @return 0=单人,1=多人
     */
    public static int mode() {
        Examsite examsite = examsiteService.get(InitLoad.kcdddh);
        boolean isSingle = "1".equals(examsite.getF1());
        return isSingle == true ? 0 : 1;
    }

    // 系统配置参数Map
    public static Map<String, String> user_map = new LinkedHashMap<String, String>();

    /*
     * 读取系统设置默认参数
     */
    public boolean init_user() {
        // 刷新后的数据
        Map<String, String> nmap = new LinkedHashMap<String, String>();
        try {
            List<Users> list = usersService.selectByExample(null);
            for (Users user : list) {
                String code = user.getUserCode();
                String key = user.getUserName();
                nmap.put(code, key);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        user_map.clear();
        user_map.putAll(nmap);
        return true;
    }

    /**
     * FRM_CODE
     */
    public static Map<String, Map<String, String>> code_map = new HashMap<String, Map<String, String>>();

    boolean init_Code() {
        logger.debug("开始加载时间" + System.currentTimeMillis());
        code_map = codeService.loadCode();
        logger.debug("结束加载时间" + System.currentTimeMillis());
        return true;
    }


    /**
     * 扣分项目列表<br/>
     * {"扣分项目1":"扣分值1","扣分项目2","扣分值2"...}
     */
    public static Map<String, Integer> kfxmMap = new HashMap<>();
    /**
     * 扣分项目列表<br/>
     * {"扣分项目1":"扣分项目1名称","扣分项目2","扣分项目2名称"...}
     */
    public static Map<String, String> kfxmcode_name = new HashMap<>();

    public static void init_kfxmMap() {
        List<Ksxm> kfxms = ksxmService.getKFX(null, -1);
        for (Ksxm ksxm : kfxms) {
            try {
                kfxmMap.put(ksxm.getCode(), Integer.parseInt(ksxm.getKfz()));
            }catch (Exception e){
                logger.error("加载扣分项失败!项目代码=" + ksxm.getCode(), e);
            }

            kfxmcode_name.put(ksxm.getCode(), ksxm.getName());
        }
    }


    /**
     * 返回 考试项目的code和name,包括 通用扣分项 和 专用扣分项
     */
    public static Map<String, String> ksxmcode_name = new HashMap<>();

    public static void init_ksxmcode_name() {
        List<Ksxm> ksxms = ksxmService.getCodeName("");
        for (Ksxm ksxm : ksxms) {
            ksxmcode_name.put(ksxm.getCode(), ksxm.getName());
        }
    }

    /**
     * 返回 考试车辆列表
     */
    public static Map<String, Carinfo> jlcxh_carinfo = new HashMap<>();

    public static void init_jlcxh_carinfo() {
        CarinfoExample example = new CarinfoExample();
        example.createCriteria().andKcdddhEqualTo(kcdddh);
        List<Carinfo> carinfos = carinfoService.query(example);
        for (Carinfo carinfo : carinfos) {
            jlcxh_carinfo.put(carinfo.getJlcxh(), carinfo);
        }
    }

    /**
     * 返回 考试车辆列表
     */
    public static Map<String, NvrInfo> name_nvrinfo = new HashMap<>();

    public static void init_name_nvrinfo() {
        List<NvrInfo> nvrInfos = nvrInfoService.selectByExample(null);
        for (NvrInfo nvrInfo : nvrInfos) {
            name_nvrinfo.put(nvrInfo.getName(), nvrInfo);
        }
    }

    /**
     * 返回 考试路线列表
     */
    public static Map<String, String> ksld_id_name = new HashMap<>();

    public static void init_id_ksld() {
        List<Ksld> kslds = ksldService.selectByExample(null);
        for (Ksld ksld: kslds) {
            ksld_id_name.put(ksld.getId(), ksld.getName());
        }
    }


    /**
     * 加载 Attr 表
     */
    public static Map<String, String> attrName_Value = new HashMap<>();

    public static void init_attrName_Value() {
        String kcdddh = InitLoad.kcdddh;
        AttrExample example = new AttrExample();
        example.createCriteria().andKcdddhEqualTo(kcdddh);
        List<Attr> attrs = mapper.selectByExample(example);
        for (Attr attr : attrs) {
            String name = null == attr.getName() ? "" : attr.getName().trim();
            String value = null == attr.getValue() ? "" : attr.getValue().trim();
            attrName_Value.put(name, value);
        }
    }

    /**
     * user 缓存
     */
    public static Map<String, String> ip_userCode = new HashMap<>();

    public static void init_ip_userCode() {
        UsersExample example = new UsersExample();
        example.createCriteria().andDeptCodeEqualTo(InitLoad.kcdddh);
        List<Users> users = usersService.selectByExample(example);
        for (Users user : users) {
            ip_userCode.put(user.getLastLoginIp(), user.getUserCode());
        }
    }

}
