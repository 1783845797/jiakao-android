package com.hqhcn.android.service;

import com.hqh.android.entity.CameraInfo;
import com.hqh.android.entity.CameraInfoExample;

import java.util.List;

public interface CameraInfoService {

    List selectByExample(CameraInfoExample example);

    /**
     * 综合查询
     * @param entity 传入要查询的条件,封装成实体类
     * @return
     */
    List select(CameraInfo entity);

    void insert(CameraInfo entity);

    List selectByExampleToPage(CameraInfoExample example);

    /**
     * 查询考场配置
     *
     * @param id 驾校ID
     * @return
     */
    CameraInfo get(long id);

    void updateByPrimaryKeySelective(CameraInfo entity);

    void delete(long id);
}
