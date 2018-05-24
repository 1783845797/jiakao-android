package com.hqhcn.android.dao;

import com.hqh.android.entity.NvrInfo;
import com.hqh.android.entity.NvrInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NvrInfoMapper {
    long countByExample(NvrInfoExample example);

    int deleteByExample(NvrInfoExample example);

    int deleteByPrimaryKey(String name);

    int insert(NvrInfo record);

    int insertSelective(NvrInfo record);

    List<NvrInfo> selectByExample(NvrInfoExample example);

    NvrInfo selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") NvrInfo record, @Param("example") NvrInfoExample example);

    int updateByExample(@Param("record") NvrInfo record, @Param("example") NvrInfoExample example);

    int updateByPrimaryKeySelective(NvrInfo record);

    int updateByPrimaryKey(NvrInfo record);

    /**
     * 分页查询
     *
     * @param example
     * @return
     */
    List<NvrInfo> selectByExampleToPage(NvrInfoExample example);

    List<String> selectNameByExample(NvrInfoExample example);
}