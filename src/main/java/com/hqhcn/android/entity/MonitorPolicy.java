package com.hqhcn.android.entity;

public class MonitorPolicy {
    private String monitorIp;

    private String jlcxh;

    private String kskm;

    public String getMonitorIp() {
        return monitorIp;
    }

    public void setMonitorIp(String monitorIp) {
        this.monitorIp = monitorIp == null ? null : monitorIp.trim();
    }

    public String getJlcxh() {
        return jlcxh;
    }

    public void setJlcxh(String jlcxh) {
        this.jlcxh = jlcxh == null ? null : jlcxh.trim();
    }

    public String getKskm() {
        return kskm;
    }

    public void setKskm(String kskm) {
        this.kskm = kskm == null ? null : kskm.trim();
    }
}