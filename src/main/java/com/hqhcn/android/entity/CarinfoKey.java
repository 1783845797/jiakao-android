package com.hqhcn.android.entity;

public class CarinfoKey {
    private String jlcxh;

    private String kcdddh;

    public String getJlcxh() {
        return jlcxh;
    }

    public void setJlcxh(String jlcxh) {
        this.jlcxh = jlcxh == null ? null : jlcxh.trim();
    }

    public String getKcdddh() {
        return kcdddh;
    }

    public void setKcdddh(String kcdddh) {
        this.kcdddh = kcdddh == null ? null : kcdddh.trim();
    }
}