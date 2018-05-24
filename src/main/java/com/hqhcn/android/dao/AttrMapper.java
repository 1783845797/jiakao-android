package com.hqhcn.android.dao;

import com.hqh.android.entity.Attr;
import com.hqh.android.entity.AttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttrMapper {
    long countByExample(AttrExample example);

    int deleteByExample(AttrExample example);

    int insert(Attr record);

    int insertSelective(Attr record);

    List<Attr> selectByExample(AttrExample example);

    int updateByExampleSelective(@Param("record") Attr record, @Param("example") AttrExample example);

    int updateByExample(@Param("record") Attr record, @Param("example") AttrExample example);


    /**
     * 查询分页记录
     *
     * @param example
     * @return
     */
    List<Attr> selectByExampleToPage(AttrExample example);
}