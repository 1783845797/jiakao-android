package com.hqhcn.android.entity;

public class ExampreasignWithBLOBs extends Exampreasign {
    private String jyw;

    private String ksxm;

    public String getJyw() {
        return jyw;
    }

    public void setJyw(String jyw) {
        this.jyw = jyw == null ? null : jyw.trim();
    }

    public String getKsxm() {
        return ksxm;
    }

    public void setKsxm(String ksxm) {
        this.ksxm = ksxm == null ? null : ksxm.trim();
    }
}