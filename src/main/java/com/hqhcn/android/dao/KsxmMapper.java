package com.hqhcn.android.dao;

import com.hqh.android.entity.Ksld;
import com.hqh.android.entity.Ksxm;
import com.hqh.android.entity.KsxmExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KsxmMapper {
    long countByExample(KsxmExample example);

    int deleteByExample(KsxmExample example);

    int deleteByPrimaryKey(String code);

    int insert(Ksxm record);

    int insertSelective(Ksxm record);

    List<Ksxm> selectByExample(KsxmExample example);

    Ksxm selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") Ksxm record, @Param("example") KsxmExample example);

    int updateByExample(@Param("record") Ksxm record, @Param("example") KsxmExample example);

    int updateByPrimaryKeySelective(Ksxm record);

    int updateByPrimaryKey(Ksxm record);



    List<String> selectCodeByExample(KsxmExample example);

    /**
     * 分页查询
     *
     * @param example
     * @return
     */
    List<Ksld> selectByExampleToPage(KsxmExample example);

    List<Ksxm> selectCodeNameByExample(KsxmExample example);

}