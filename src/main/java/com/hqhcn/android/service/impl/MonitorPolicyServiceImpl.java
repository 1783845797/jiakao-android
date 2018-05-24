package com.hqhcn.android.service.impl;

import com.hqh.android.dao.MonitorPolicyMapper;
import com.hqh.android.entity.MonitorPolicy;
import com.hqh.android.entity.MonitorPolicyExample;
import com.hqh.android.service.MonitorPolicyService;
import com.hqh.android.tool.AttrUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MonitorPolicyServiceImpl implements MonitorPolicyService {

    @Autowired
    MonitorPolicyMapper mapper;

    @Override
    public List selectByExampleToPage(MonitorPolicyExample example) {
        return mapper.selectByExampleToPage(example);
    }

    @Override
    public void add(MonitorPolicy entity) throws Exception {
        if (isFull(entity.getMonitorIp())) {
            throw new RuntimeException("添加失败!该监控段已达到监控上限");
        }
        if (isExist(entity)) {
            throw new RuntimeException("添加失败!该车已配置监控端");
        }
        mapper.insert(entity);
    }

    @Override
    public List<MonitorPolicy> query(String monitorIP, String jlcxh, String kskm) {
        MonitorPolicyExample example = new MonitorPolicyExample();
        MonitorPolicyExample.Criteria criteria =  example.createCriteria();
        if (StringUtils.isNotEmpty(monitorIP)){
            criteria.andMonitorIpEqualTo(monitorIP);
        }
        if (StringUtils.isNotEmpty(jlcxh)){
            criteria.andJlcxhEqualTo(jlcxh);
        }
        if (StringUtils.isNotEmpty(kskm)){
            criteria.andKskmEqualTo(kskm);
        }
        return mapper.selectByExample(example);
    }

    @Override
    @Transactional
    public void replace(MonitorPolicy newOne, MonitorPolicy oldOne) throws Exception {
        add(newOne);
        delete(oldOne);
    }

    @Override
    public void delete(MonitorPolicy entity) {
        MonitorPolicyExample example = new MonitorPolicyExample();
        MonitorPolicyExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(entity.getMonitorIp())) {
            criteria.andMonitorIpEqualTo(entity.getMonitorIp());
        }
        if (StringUtils.isNotEmpty(entity.getJlcxh())) {
            criteria.andJlcxhEqualTo(entity.getJlcxh());
        }
        if (StringUtils.isNotEmpty(entity.getKskm())) {
            criteria.andKskmEqualTo(entity.getKskm());
        }
        mapper.deleteByExample(example);
    }

    @Override
    public void update(MonitorPolicy newOne, MonitorPolicy oldOne) {

        if (!newOne.getMonitorIp().equals(oldOne.getMonitorIp())){
            // 如果没有该监控端IP,就没有必要检测监控端是否达到上限
            if (isFull(newOne.getMonitorIp())) {
                throw new RuntimeException("添加失败!该监控段已达到监控上限");
            }
        }
        if (!newOne.getJlcxh().equals(oldOne.getJlcxh())){
            if (isExist(newOne)) {
                throw new RuntimeException("添加失败!该车已配置监控端");
            }
        }

        MonitorPolicyExample oldExample = new MonitorPolicyExample();
        MonitorPolicyExample.Criteria criteria = oldExample.createCriteria();
        if (StringUtils.isNotEmpty(oldOne.getMonitorIp())) {
            criteria.andMonitorIpEqualTo(oldOne.getMonitorIp());
        }
        if (StringUtils.isNotEmpty(oldOne.getJlcxh())) {
            criteria.andJlcxhEqualTo(oldOne.getJlcxh());
        }
        if (StringUtils.isNotEmpty(oldOne.getKskm())) {
            criteria.andKskmEqualTo(oldOne.getKskm());
        }
        mapper.updateByExampleSelective(newOne,oldExample);
    }

    /**
     * 检测该车辆是否存在配置记录
     * @param entity 监控配置 {@link MonitorPolicy}
     */
    private boolean isExist(MonitorPolicy entity) {
        boolean isExist = false;
        List<MonitorPolicy> policies = query(null, entity.getJlcxh(), entity.getKskm());
        if (CollectionUtils.isNotEmpty(policies)) {
            isExist = true;
        }
        return isExist;
    }

    /**
     * 检测监控端上否已达到监控车辆总数上限 {@link AttrUtils}
     * @param monitorIP 监控端IP
     */
    private boolean isFull(String monitorIP) {
        boolean isFullOfMonitor = false;
        List<MonitorPolicy> policiesThisMonitor = query(monitorIP, null, null);
        if (CollectionUtils.isNotEmpty(policiesThisMonitor)) {
            if (policiesThisMonitor.size() >= AttrUtils.每个监控端能监控的设备上限.toInt()) {
                isFullOfMonitor = true;
            }
        }
        return isFullOfMonitor;
    }
}
