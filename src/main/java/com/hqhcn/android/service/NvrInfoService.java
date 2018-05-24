package com.hqhcn.android.service;


import com.hqh.android.entity.NvrInfo;
import com.hqh.android.entity.NvrInfoExample;

import java.util.List;

public interface NvrInfoService {

    /**
     * @param @param  example
     * @param @return 设定文件
     * @return List<Resources>    返回类型
     * @throws
     * @Title: selectByExample
     * 根据条件查询资源信息
     * @author zl
     * 2013-6-28
     */
    List<NvrInfo> selectByExample(NvrInfoExample example);

    List<String> selectNameByExample(NvrInfoExample example);

    NvrInfo selectByPrimaryKey(String name);

    int add(NvrInfo entity);

    int updateByPrimaryKeySelective(NvrInfo entity);

    int deleteByPrimaryKey(String name);

    List<NvrInfo> query(NvrInfoExample example);
}
