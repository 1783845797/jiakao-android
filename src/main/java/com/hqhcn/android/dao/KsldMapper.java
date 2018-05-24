package com.hqhcn.android.dao;

import com.hqh.android.entity.Ksld;
import com.hqh.android.entity.KsldExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KsldMapper {
    long countByExample(KsldExample example);

    int deleteByExample(KsldExample example);

    int deleteByPrimaryKey(String id);

    int insert(Ksld record);

    int insertSelective(Ksld record);

    List<Ksld> selectByExample(KsldExample example);

    Ksld selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Ksld record, @Param("example") KsldExample example);

    int updateByExample(@Param("record") Ksld record, @Param("example") KsldExample example);

    int updateByPrimaryKeySelective(Ksld record);

    int updateByPrimaryKey(Ksld record);

    /**
     * 分页查询
     *
     * @param example
     * @return
     */
    List<Ksld> selectByExampleToPage(KsldExample example);
}