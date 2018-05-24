package com.hqhcn.android.dao;

import com.hqh.android.entity.Examproc;
import com.hqh.android.entity.ExamprocExample;
import com.hqh.android.entity.ExamprocKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamprocMapper {
    long countByExample(ExamprocExample example);

    int deleteByExample(ExamprocExample example);

    int deleteByPrimaryKey(ExamprocKey key);

    int insert(Examproc record);

    int insertSelective(Examproc record);

    List<Examproc> selectByExample(ExamprocExample example);

    Examproc selectByPrimaryKey(ExamprocKey key);

    int updateByExampleSelective(@Param("record") Examproc record, @Param("example") ExamprocExample example);

    int updateByExample(@Param("record") Examproc record, @Param("example") ExamprocExample example);

    int updateByPrimaryKeySelective(Examproc record);

    int updateByPrimaryKey(Examproc record);
}