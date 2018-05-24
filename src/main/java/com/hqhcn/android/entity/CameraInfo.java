package com.hqhcn.android.entity;

public class CameraInfo {
    private Long id;

    private String name;

    private String ip;

    private String port;

    private String account;

    private String password;

    private String kskm;

    private String ksld;

    private String ksxm;

    private String nvrId;

    private String nvrChannel;

    private String bz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getKskm() {
        return kskm;
    }

    public void setKskm(String kskm) {
        this.kskm = kskm == null ? null : kskm.trim();
    }

    public String getKsld() {
        return ksld;
    }

    public void setKsld(String ksld) {
        this.ksld = ksld == null ? null : ksld.trim();
    }

    public String getKsxm() {
        return ksxm;
    }

    public void setKsxm(String ksxm) {
        this.ksxm = ksxm == null ? null : ksxm.trim();
    }

    public String getNvrId() {
        return nvrId;
    }

    public void setNvrId(String nvrId) {
        this.nvrId = nvrId == null ? null : nvrId.trim();
    }

    public String getNvrChannel() {
        return nvrChannel;
    }

    public void setNvrChannel(String nvrChannel) {
        this.nvrChannel = nvrChannel == null ? null : nvrChannel.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }
}