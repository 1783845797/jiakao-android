package com.hqhcn.android.entity;

public class Attr {
    private String name;

    private String value;

    private String kcdddh;

    private String bz;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getKcdddh() {
        return kcdddh;
    }

    public void setKcdddh(String kcdddh) {
        this.kcdddh = kcdddh == null ? null : kcdddh.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }
}