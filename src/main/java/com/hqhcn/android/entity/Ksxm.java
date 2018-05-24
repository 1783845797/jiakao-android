package com.hqhcn.android.entity;

public class Ksxm {
    private String code;

    private String name;

    private String upCode;

    private String kfz;

    private String kskm;

    private Short zdpdx;

    private String code61;

    private Integer zt;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUpCode() {
        return upCode;
    }

    public void setUpCode(String upCode) {
        this.upCode = upCode == null ? null : upCode.trim();
    }

    public String getKfz() {
        return kfz;
    }

    public void setKfz(String kfz) {
        this.kfz = kfz == null ? null : kfz.trim();
    }

    public String getKskm() {
        return kskm;
    }

    public void setKskm(String kskm) {
        this.kskm = kskm == null ? null : kskm.trim();
    }

    public Short getZdpdx() {
        return zdpdx;
    }

    public void setZdpdx(Short zdpdx) {
        this.zdpdx = zdpdx;
    }

    public String getCode61() {
        return code61;
    }

    public void setCode61(String code61) {
        this.code61 = code61 == null ? null : code61.trim();
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }
}