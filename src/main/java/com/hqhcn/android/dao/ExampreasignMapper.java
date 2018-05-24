package com.hqhcn.android.dao;

import com.hqh.android.entity.Exampreasign;
import com.hqh.android.entity.ExampreasignExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExampreasignMapper {
    long countByExample(ExampreasignExample example);

    int deleteByExample(ExampreasignExample example);

    int deleteByPrimaryKey(String lsh);

    int insert(Exampreasign record);

    int insertSelective(Exampreasign record);

    List<Exampreasign> selectByExample(ExampreasignExample example);

    Exampreasign selectByPrimaryKey(String lsh);

    int updateByExampleSelective(@Param("record") Exampreasign record, @Param("example") ExampreasignExample example);

    int updateByExample(@Param("record") Exampreasign record, @Param("example") ExampreasignExample example);

    int updateByPrimaryKeySelective(Exampreasign record);

    int updateByPrimaryKey(Exampreasign record);

    //------------------------
    List<Exampreasign> selectByExampleToPage(ExampreasignExample example);

    /**
     * 只查询姓名,流水号,身份证,准考证这些信息
     *
     * @param example 查询条件
     * @return
     */
    List<Exampreasign> queryToPage1(ExampreasignExample example);

    /**
     * 从考生截图中随机取{size}张图
     * @param lsh 流水号
     * @param size 取回数量
     * @return
     */
    List<Exampreasign> fetchExamPic(String lsh, int size);

}