package com.hqhcn.android.service;

import com.hqh.android.entity.Exampreasign;
import com.hqh.android.entity.ExampreasignExample;

import java.util.List;

public interface ExamineeService {

    /**
     * 考试次数初始值
     */
    int KSCS_INIT = 0;
    /**
     * 考试次数最大值
     */
    int KSCS_MAX = 2;
    /**
     * 考试未开始
     */
    String F1_EXAMNOTBEGIN = "0";
    /**
     * 考试开始中
     */
    String F1_EXAMBEGINNING = "1";
    /**
     * 考试已结束
     */
    String F1_EXAMEND = "2";

    /**
     * 未报到
     */
    int ZT_UNCHECKIN = 0;
    /**
     * 报道未验证
     */
    int ZT_UNVERIFY = 1;

    /**
     * 验证通过考车未分配
     */
    int ZT_UNASSIGN = 2;

    /**
     * 已分配未上车
     */
    int ZT_NOTINCAR = 3;

    /**
     * 已上车未考试
     */
    int ZT_NOEXAM = 4;

    /**
     * 考试中
     */
    int ZT_EXAMING = 5;

    /**
     * 缺考
     */
    int ZT_EXAMMISSING = 6;

    /**
     * 考了1次,有可能还要考第二次说不准.
     */
    int ZT_EXAM1STEND = 7;

    /**
     * 考试结束未下车,确认不会再考试了
     */
    int ZT_EXAMEND = 8;

    /**
     * 考完下车
     */
    int ZT_EXAMENDOUTCAR = 9;

    /**
     * 报道验证状态 未验证
     */
    int BDYZZT_UNVERIFY = 0;

    /**
     * 报道验证状态 未通过
     */
    int BDYZZT_NOTPASS = 1;

    /**
     * 报道验证状态 通过
     */
    int BDYZZT_PASS = 2;

    /**
     * 报道验证状态 手动设置通过
     */
    int BDYZZT_PASSMANUAL = 3;

    /**
     * 上车验证状态 未验证
     */
    int SCYZZT_UNVERIFY = 0;

    /**
     * 上车验证状态 未通过
     */
    int SCYZZT_NOTPASS = 1;

    /**
     * 上车验证状态 通过
     */
    int SCYZZT_PASS = 2;

    /**
     * 上车验证状态 手动设置通过
     */
    int SCYZZT_PASSMANUAL = 3;

    List<Exampreasign> query(ExampreasignExample example);

    List<Exampreasign> queryToPage(ExampreasignExample example);

    int updateByPrimaryKeySelective(Exampreasign exampreasign);

    void updateByLSH(Exampreasign exampreasign);

    /**
     * 取出先n名考生
     *
     * @param example 取出条件
     * @param num     取出数量
     * @return
     */
    List<Exampreasign> unassignTop8(ExampreasignExample example, int num);

    Exampreasign queryByLsh(String lsh);

    /**
     * 只查询姓名,流水号,身份证,准考证这些信息
     *
     * @param example 查询条件
     * @return
     */
    List<Exampreasign> queryToPage1(ExampreasignExample example);

    /**
     * 重新考试,重置考试次数,并删除之前的考试过程记录
     * @param lsh
     * @return
     */
    void reset(String lsh) throws Exception;

    /**
     * 考生下载,不含 指纹 和 头像
     *
     * @param examinee
     */
    void examineeDownload(Exampreasign examinee);

    List<String> fetchExamPic(int size);

    void writeZTByLSH(String lsh, int zt);

    void insert(Exampreasign entity);

    void update(Exampreasign entity, ExampreasignExample example);

    void updateSelective(Exampreasign entity);

    void updateZT(String lsh, int zt);

    /**
     * 获取已分配到这辆车的考生
     * @param jlcxh 教练车序号
     * @param jlc_kskm 该教练车是科目几的考车
     * @return
     */
    List<Exampreasign> pull(String jlcxh, String jlc_kskm) throws Exception;

    long count(ExampreasignExample example);

    /**
     * 根据身份证号查询当天<code>未报道</code>考生
     * @return
     */
    List<Exampreasign> checkStudent(String sfzmhm);

    /**
     * 根据身份证号查询考生信息
     */
    List<Exampreasign> queryBySfzmhm(String sfzmhm);

    /**
     * 根据身份证号查询<code>当天</code>考生信息
     */
    List<Exampreasign> queryBySfzmhmToday(String sfzmhm);

}
