package com.hqhcn.android.entity;

import java.util.Date;

public class Examproc extends ExamprocKey {
    private String kskm;

    private Integer kscj;

    private Integer kszt;

    private String jlcxh;

    private String pic1;

    private String pic2;

    private Date kssj;

    private Date jssj;

    private String jyw;

    public String getKskm() {
        return kskm;
    }

    public void setKskm(String kskm) {
        this.kskm = kskm == null ? null : kskm.trim();
    }

    public Integer getKscj() {
        return kscj;
    }

    public void setKscj(Integer kscj) {
        this.kscj = kscj;
    }

    public Integer getKszt() {
        return kszt;
    }

    public void setKszt(Integer kszt) {
        this.kszt = kszt;
    }

    public String getJlcxh() {
        return jlcxh;
    }

    public void setJlcxh(String jlcxh) {
        this.jlcxh = jlcxh == null ? null : jlcxh.trim();
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1 == null ? null : pic1.trim();
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    public Date getKssj() {
        return kssj;
    }

    public void setKssj(Date kssj) {
        this.kssj = kssj;
    }

    public Date getJssj() {
        return jssj;
    }

    public void setJssj(Date jssj) {
        this.jssj = jssj;
    }

    public String getJyw() {
        return jyw;
    }

    public void setJyw(String jyw) {
        this.jyw = jyw == null ? null : jyw.trim();
    }
}