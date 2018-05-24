package com.hqhcn.android.dao;

import com.hqh.android.entity.CameraInfo;
import com.hqh.android.entity.CameraInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CameraInfoMapper {
    long countByExample(CameraInfoExample example);

    int deleteByExample(CameraInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CameraInfo record);

    int insertSelective(CameraInfo record);

    List<CameraInfo> selectByExample(CameraInfoExample example);

    CameraInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CameraInfo record, @Param("example") CameraInfoExample example);

    int updateByExample(@Param("record") CameraInfo record, @Param("example") CameraInfoExample example);

    int updateByPrimaryKeySelective(CameraInfo record);

    int updateByPrimaryKey(CameraInfo record);

    List selectByExampleToPage(CameraInfoExample example);
}