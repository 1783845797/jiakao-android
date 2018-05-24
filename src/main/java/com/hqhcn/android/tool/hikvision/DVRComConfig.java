package com.hqhcn.android.tool.hikvision;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * DVR通用配置
 */
@Component
@ConfigurationProperties(prefix = "jiakao.dvrcom")
public class DVRComConfig {

    String url;

    String method;
    String picSize;
    String picQuality;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPicSize() {
        return picSize;
    }

    public void setPicSize(String picSize) {
        this.picSize = picSize;
    }

    public String getPicQuality() {
        return picQuality;
    }

    public void setPicQuality(String picQuality) {
        this.picQuality = picQuality;
    }
}
