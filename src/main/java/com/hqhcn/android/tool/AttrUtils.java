package com.hqhcn.android.tool;


import com.hqh.android.web.InitLoad;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum AttrUtils {
    每次预约中最多能考试的次数("kscsMax"),
    科目三及格线("km3_pass_score_line"),
    科目二及格线("km2_pass_score_line"),
    考试过程图片文件夹路径("picDir"),
    考生图片文件夹("ksPicDir"),
    资源模型文件夹("ResDir"),
    考试系统编号("ksxtbh"),
    设备序号("sbxh"),
    排队大屏显示人数上限("num_of_queue"),
    每个监控端能监控的设备上限("client_limit_per_monitor"),
    最大在线人数("online_user_max"),
    用户最高访问频次("access_frequency"),
    考场序号("kcxh"),
    发证机关("fzjg"),
    管理部门("glbm"),
    考试地点("ksdd"),
    误判考试次数起始值("misjudge_kscs_origin"),
    /**
     * 测试模式(不通过六合一) 0:关闭 1:开启
     */
    测试模型("testMode"),
    六合一平台接口访问地址("tmri_url"),
    六合一平台接口序列号("jkxlh");


    private String name;
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    AttrUtils(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return InitLoad.attrName_Value.get(name);
    }

    /**
     * 转成 数字 类型
     *
     * @return 数字类型
     */
    public int toInt() {
        if (StringUtils.isNumeric(toString())) {
            return Integer.parseInt(toString());
        } else {
            logger.error("Attr." + name + "转数字失败!!!");
            return 0;
        }
    }
}
