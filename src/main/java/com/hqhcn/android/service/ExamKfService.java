package com.hqhcn.android.service;

import com.hqh.android.entity.ExamKf;
import com.hqh.android.entity.ExamKfExample;

import java.util.List;

public interface ExamKfService {
    void insert(ExamKf entity, String jlcxh);

    List<ExamKf> query(ExamKfExample example);

    /**
     * 查询扣分记录
     * @param lsh   流水号
     * @param kskm  考试科目
     * @param kscs  考试次数,-1代表所有
     * @return
     */
    List<ExamKf> query(String lsh, String kskm, int kscs);

    /**
     * 查询扣分记录
     * @param lsh   流水号
     * @param kskm  考试科目
     * @param ksxm  考试项目,可空
     * @param kscs  考试次数,-1代表所有
     * @return
     */
    List<ExamKf> query(String lsh, String kskm, String ksxm, int kscs);

    void updateSelective(ExamKf entity);

    /**
     * 按考试次数来转移扣分数据
     * @param lsh   流水号
     * @param kskm  考试科目
     * @param ori   转移<span style="color:red">之前</span>的考试次数
     * @param des   转移<span style="color:red">之后</span>的考试次数
     */
    void moveByKscs(String lsh, String kskm, int ori, int des) throws Exception;
}
