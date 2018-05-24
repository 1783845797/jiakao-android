package com.hqhcn.android.dao;

import com.hqh.android.entity.Carinfo;
import com.hqh.android.entity.CarinfoExample;
import com.hqh.android.entity.CarinfoKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarinfoMapper {
    long countByExample(CarinfoExample example);

    int deleteByExample(CarinfoExample example);

    int deleteByPrimaryKey(CarinfoKey key);

    int insert(Carinfo record);

    int insertSelective(Carinfo record);

    List<Carinfo> selectByExample(CarinfoExample example);

    Carinfo selectByPrimaryKey(CarinfoKey key);

    int updateByExampleSelective(@Param("record") Carinfo record, @Param("example") CarinfoExample example);

    int updateByExample(@Param("record") Carinfo record, @Param("example") CarinfoExample example);

    int updateByPrimaryKeySelective(Carinfo record);

    int updateByPrimaryKey(Carinfo record);

    /**
     * 查询分页记录
     *
     * @param example
     * @return
     */
    List<Carinfo> selectByExampleToPage(CarinfoExample example);


    List<String> selectJLCXHByExample(CarinfoExample example);
}