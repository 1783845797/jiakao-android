package com.hqhcn.android.entity;

import java.util.Date;

public class VehInspRecord {
    private Long id;

    private String jlcxh;

    private String kcdddh;

    private String hphm;

    private String jlczt;

    private String hpzl;

    private String jklx;

    private String kskm;

    private Date sj;

    private String msg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getHphm() {
        return hphm;
    }

    public void setHphm(String hphm) {
        this.hphm = hphm == null ? null : hphm.trim();
    }

    public String getJlczt() {
        return jlczt;
    }

    public void setJlczt(String jlczt) {
        this.jlczt = jlczt == null ? null : jlczt.trim();
    }

    public String getHpzl() {
        return hpzl;
    }

    public void setHpzl(String hpzl) {
        this.hpzl = hpzl == null ? null : hpzl.trim();
    }

    public String getJklx() {
        return jklx;
    }

    public void setJklx(String jklx) {
        this.jklx = jklx == null ? null : jklx.trim();
    }

    public String getKskm() {
        return kskm;
    }

    public void setKskm(String kskm) {
        this.kskm = kskm == null ? null : kskm.trim();
    }

    public Date getSj() {
        return sj;
    }

    public void setSj(Date sj) {
        this.sj = sj;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }
}