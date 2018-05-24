package com.hqhcn.android.dao;

import com.hqh.android.entity.Examsite;
import com.hqh.android.entity.ExamsiteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamsiteMapper {
    long countByExample(ExamsiteExample example);

    int deleteByExample(ExamsiteExample example);

    int deleteByPrimaryKey(String kcdddh);

    int insert(Examsite record);

    int insertSelective(Examsite record);

    List<Examsite> selectByExample(ExamsiteExample example);

    Examsite selectByPrimaryKey(String kcdddh);

    int updateByExampleSelective(@Param("record") Examsite record, @Param("example") ExamsiteExample example);

    int updateByExample(@Param("record") Examsite record, @Param("example") ExamsiteExample example);

    int updateByPrimaryKeySelective(Examsite record);

    int updateByPrimaryKey(Examsite record);

    List selectByExampleToPage(ExamsiteExample example);
}