package com.hqhcn.android.entity;

import java.util.Date;

public class Ksld {
    private String id;

    private String name;

    private String bz;

    private String ksxmpx;

    private String kskm;

    private String kcdddh;

    private String modelPath;

    private Integer zt;

    private Integer lc;

    private String pic;

    private Date gxsj;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getKsxmpx() {
        return ksxmpx;
    }

    public void setKsxmpx(String ksxmpx) {
        this.ksxmpx = ksxmpx == null ? null : ksxmpx.trim();
    }

    public String getKskm() {
        return kskm;
    }

    public void setKskm(String kskm) {
        this.kskm = kskm == null ? null : kskm.trim();
    }

    public String getKcdddh() {
        return kcdddh;
    }

    public void setKcdddh(String kcdddh) {
        this.kcdddh = kcdddh == null ? null : kcdddh.trim();
    }

    public String getModelPath() {
        return modelPath;
    }

    public void setModelPath(String modelPath) {
        this.modelPath = modelPath == null ? null : modelPath.trim();
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public Integer getLc() {
        return lc;
    }

    public void setLc(Integer lc) {
        this.lc = lc;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getGxsj() {
        return gxsj;
    }

    public void setGxsj(Date gxsj) {
        this.gxsj = gxsj;
    }
}