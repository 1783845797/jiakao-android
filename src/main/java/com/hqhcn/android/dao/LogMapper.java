package com.hqhcn.android.dao;

import com.hqh.android.entity.Log;
import com.hqh.android.entity.LogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogMapper {
    long countByExample(LogExample example);

    int deleteByExample(LogExample example);

    int insert(Log record);

    int insertSelective(Log record);

    List<Log> selectByExample(LogExample example);

    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);

    List<Log> selectByExampleToPage(LogExample example);
}