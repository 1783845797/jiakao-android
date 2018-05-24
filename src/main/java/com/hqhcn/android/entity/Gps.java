package com.hqhcn.android.entity;

public class Gps extends GpsKey {
    private String kskm;

    private String carinfoId;

    private String gps;

    public String getKskm() {
        return kskm;
    }

    public void setKskm(String kskm) {
        this.kskm = kskm == null ? null : kskm.trim();
    }

    public String getCarinfoId() {
        return carinfoId;
    }

    public void setCarinfoId(String carinfoId) {
        this.carinfoId = carinfoId == null ? null : carinfoId.trim();
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps == null ? null : gps.trim();
    }
}