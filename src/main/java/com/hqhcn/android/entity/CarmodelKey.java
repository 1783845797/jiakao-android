package com.hqhcn.android.entity;

public class CarmodelKey {
    private String kcdddh;

    private String id;

    public String getKcdddh() {
        return kcdddh;
    }

    public void setKcdddh(String kcdddh) {
        this.kcdddh = kcdddh == null ? null : kcdddh.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
}