package com.hqhcn.android.entity;

import java.util.Date;

public class Code extends CodeKey {
    private String dmsx;

    private Short sxh;

    private String ywdx;

    private String zt;

    private String csbj;

    private Date gxsj;

    public String getDmsx() {
        return dmsx;
    }

    public void setDmsx(String dmsx) {
        this.dmsx = dmsx == null ? null : dmsx.trim();
    }

    public Short getSxh() {
        return sxh;
    }

    public void setSxh(Short sxh) {
        this.sxh = sxh;
    }

    public String getYwdx() {
        return ywdx;
    }

    public void setYwdx(String ywdx) {
        this.ywdx = ywdx == null ? null : ywdx.trim();
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getCsbj() {
        return csbj;
    }

    public void setCsbj(String csbj) {
        this.csbj = csbj == null ? null : csbj.trim();
    }

    public Date getGxsj() {
        return gxsj;
    }

    public void setGxsj(Date gxsj) {
        this.gxsj = gxsj;
    }
}