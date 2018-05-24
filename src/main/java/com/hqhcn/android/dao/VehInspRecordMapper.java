package com.hqhcn.android.dao;

import com.hqh.android.entity.VehInspRecord;
import com.hqh.android.entity.VehInspRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VehInspRecordMapper {
    long countByExample(VehInspRecordExample example);

    int deleteByExample(VehInspRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VehInspRecord record);

    int insertSelective(VehInspRecord record);

    List<VehInspRecord> selectByExample(VehInspRecordExample example);

    VehInspRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VehInspRecord record, @Param("example") VehInspRecordExample example);

    int updateByExample(@Param("record") VehInspRecord record, @Param("example") VehInspRecordExample example);

    int updateByPrimaryKeySelective(VehInspRecord record);

    int updateByPrimaryKey(VehInspRecord record);

    /**
     * 查询分页记录
     *
     * @param example
     * @return
     */
    List<VehInspRecord> selectByExampleToPage(VehInspRecordExample example);
}