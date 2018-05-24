package com.hqhcn.android.service;

import com.hqh.android.entity.MonitorPolicy;
import com.hqh.android.entity.MonitorPolicyExample;

import java.util.List;

public interface MonitorPolicyService {

    List selectByExampleToPage(MonitorPolicyExample example);

    /**
     * 新增监控配置有2个条件
     * 1. 监控段能监控的设备上限受限制
     * 2. 同时每个考车只能被一个监控端监控
     *
     * @see com.xiangtu.tool.AttrUtils.每个监控端能监控的设备上限
     */
    void add(MonitorPolicy entity) throws Exception;

    List<MonitorPolicy> query(String monitorIP, String jlcxh, String kskm);

    /**
     * 替换记录
     * @param newOne 替换之后保存下来的
     * @param oldOne 替换之后删除的
     */
    void replace(MonitorPolicy newOne, MonitorPolicy oldOne) throws Exception;

    void delete(MonitorPolicy entity);

    void update(MonitorPolicy newOne, MonitorPolicy oldOne);
}
