package com.hqhcn.android.entity;

public class CodeWithBLOBs extends Code {
    private String dmsm1;

    private String dmsm2;

    private String dmsm3;

    private String dmsm4;

    public String getDmsm1() {
        return dmsm1;
    }

    public void setDmsm1(String dmsm1) {
        this.dmsm1 = dmsm1 == null ? null : dmsm1.trim();
    }

    public String getDmsm2() {
        return dmsm2;
    }

    public void setDmsm2(String dmsm2) {
        this.dmsm2 = dmsm2 == null ? null : dmsm2.trim();
    }

    public String getDmsm3() {
        return dmsm3;
    }

    public void setDmsm3(String dmsm3) {
        this.dmsm3 = dmsm3 == null ? null : dmsm3.trim();
    }

    public String getDmsm4() {
        return dmsm4;
    }

    public void setDmsm4(String dmsm4) {
        this.dmsm4 = dmsm4 == null ? null : dmsm4.trim();
    }
}