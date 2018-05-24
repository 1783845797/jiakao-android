package com.hqhcn.android.dao;

import com.hqh.android.entity.ExamKf;
import com.hqh.android.entity.ExamKfExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamKfMapper {
    long countByExample(ExamKfExample example);

    int deleteByExample(ExamKfExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExamKf record);

    int insertSelective(ExamKf record);

    List<ExamKf> selectByExample(ExamKfExample example);

    ExamKf selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExamKf record, @Param("example") ExamKfExample example);

    int updateByExample(@Param("record") ExamKf record, @Param("example") ExamKfExample example);

    int updateByPrimaryKeySelective(ExamKf record);

    int updateByPrimaryKey(ExamKf record);
}