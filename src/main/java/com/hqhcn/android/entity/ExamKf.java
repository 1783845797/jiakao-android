package com.hqhcn.android.entity;

import java.util.Date;

public class ExamKf {
    private Long id;

    private String lsh;

    private String kskm;

    private String ksxm;

    private String kfxm;

    private String sfzmhm;

    private Integer kscs;

    private Integer kfz;

    private String pic;

    private Date kfsj;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLsh() {
        return lsh;
    }

    public void setLsh(String lsh) {
        this.lsh = lsh == null ? null : lsh.trim();
    }

    public String getKskm() {
        return kskm;
    }

    public void setKskm(String kskm) {
        this.kskm = kskm == null ? null : kskm.trim();
    }

    public String getKsxm() {
        return ksxm;
    }

    public void setKsxm(String ksxm) {
        this.ksxm = ksxm == null ? null : ksxm.trim();
    }

    public String getKfxm() {
        return kfxm;
    }

    public void setKfxm(String kfxm) {
        this.kfxm = kfxm == null ? null : kfxm.trim();
    }

    public String getSfzmhm() {
        return sfzmhm;
    }

    public void setSfzmhm(String sfzmhm) {
        this.sfzmhm = sfzmhm == null ? null : sfzmhm.trim();
    }

    public Integer getKscs() {
        return kscs;
    }

    public void setKscs(Integer kscs) {
        this.kscs = kscs;
    }

    public Integer getKfz() {
        return kfz;
    }

    public void setKfz(Integer kfz) {
        this.kfz = kfz;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getKfsj() {
        return kfsj;
    }

    public void setKfsj(Date kfsj) {
        this.kfsj = kfsj;
    }
}