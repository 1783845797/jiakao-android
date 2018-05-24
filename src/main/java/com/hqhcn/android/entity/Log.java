package com.hqhcn.android.entity;

import java.util.Date;

public class Log {
    private String userCode;

    private String program;

    private String cz;

    private String xxsm;

    private String czip;

    private String jmw;

    private String id;

    private String logtype;

    private String f1;

    private String f2;

    private String f3;

    private Date czsj;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program == null ? null : program.trim();
    }

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz == null ? null : cz.trim();
    }

    public String getXxsm() {
        return xxsm;
    }

    public void setXxsm(String xxsm) {
        this.xxsm = xxsm == null ? null : xxsm.trim();
    }

    public String getCzip() {
        return czip;
    }

    public void setCzip(String czip) {
        this.czip = czip == null ? null : czip.trim();
    }

    public String getJmw() {
        return jmw;
    }

    public void setJmw(String jmw) {
        this.jmw = jmw == null ? null : jmw.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLogtype() {
        return logtype;
    }

    public void setLogtype(String logtype) {
        this.logtype = logtype == null ? null : logtype.trim();
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1 == null ? null : f1.trim();
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2 == null ? null : f2.trim();
    }

    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        this.f3 = f3 == null ? null : f3.trim();
    }

    public Date getCzsj() {
        return czsj;
    }

    public void setCzsj(Date czsj) {
        this.czsj = czsj;
    }
}