package com.hqhcn.android.tool;

public enum LogType {
    monitor("监控端操作"),
    car("车载端"),
    role("角色管理"),
    examsite("考场管理"),
    carinfo("车辆管理"),
    carmodel("车辆模型"),
    assign("考生分配"),
    resources("菜单管理"),
    users("用户管理"),
    examinee("考生管理"),
    monitorpolicy("监控配置"),
    misjudge("误判处理"),
    ksxm("考试项目"),
    system("系统管理"),
    camerainfo("摄像头管理"),
    nvrinfo("nvr管理");

    private String cz;

    LogType(String cz) {
        this.cz = cz;
    }

    public String toString(){
        return cz;
    }
}