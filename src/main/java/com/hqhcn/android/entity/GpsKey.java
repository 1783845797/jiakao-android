package com.hqhcn.android.entity;

public class GpsKey {
    private String ksxm;

    private String ksLsh;

    private Integer kscs;

    public String getKsxm() {
        return ksxm;
    }

    public void setKsxm(String ksxm) {
        this.ksxm = ksxm == null ? null : ksxm.trim();
    }

    public String getKsLsh() {
        return ksLsh;
    }

    public void setKsLsh(String ksLsh) {
        this.ksLsh = ksLsh == null ? null : ksLsh.trim();
    }

    public Integer getKscs() {
        return kscs;
    }

    public void setKscs(Integer kscs) {
        this.kscs = kscs;
    }
}