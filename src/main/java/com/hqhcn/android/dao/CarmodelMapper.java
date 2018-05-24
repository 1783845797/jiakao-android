package com.hqhcn.android.dao;

import com.hqh.android.entity.Carmodel;
import com.hqh.android.entity.CarmodelExample;
import com.hqh.android.entity.CarmodelKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarmodelMapper {
    long countByExample(CarmodelExample example);

    int deleteByExample(CarmodelExample example);

    int deleteByPrimaryKey(CarmodelKey key);

    int insert(Carmodel record);

    int insertSelective(Carmodel record);

    List<Carmodel> selectByExample(CarmodelExample example);

    Carmodel selectByPrimaryKey(CarmodelKey key);

    int updateByExampleSelective(@Param("record") Carmodel record, @Param("example") CarmodelExample example);

    int updateByExample(@Param("record") Carmodel record, @Param("example") CarmodelExample example);

    int updateByPrimaryKeySelective(Carmodel record);

    int updateByPrimaryKey(Carmodel record);


    List<String> selectCLPPXHByExample(CarmodelExample example);

    /**
     * 查询分页记录
     *
     * @param example
     * @return
     */
    List<Carmodel> selectByExampleToPage(CarmodelExample example);
}