package com.hqhcn.android.entity;

public class Carmodel extends CarmodelKey {
    private String clppxh;

    private String modelPath;

    private String pic;

    public String getClppxh() {
        return clppxh;
    }

    public void setClppxh(String clppxh) {
        this.clppxh = clppxh == null ? null : clppxh.trim();
    }

    public String getModelPath() {
        return modelPath;
    }

    public void setModelPath(String modelPath) {
        this.modelPath = modelPath == null ? null : modelPath.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}