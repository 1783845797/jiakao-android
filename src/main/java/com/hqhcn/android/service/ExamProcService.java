package com.hqhcn.android.service;

import com.hqh.android.entity.Examproc;
import com.hqh.android.entity.ExamprocExample;

import java.util.Date;
import java.util.List;

public interface ExamProcService {

    void insertSelective(Examproc entity);

    /**
     * 获取考试过程
     *
     * @param example 查找条件
     * @return
     */
    List<Examproc> select(ExamprocExample example);

    /**
     * 拿到单次考试科目过程
     *
     * @param lsh  流水号
     * @param kscs 考试次数,-1=全部
     * @return [{考试项目过程1},{考试项目过程2}...]
     */
    List<Examproc> examproc(String lsh, int kscs);

    /**
     * 获取考试过程
     *
     * @param lsh  流水号
     * @param kskm 考试科目
     * @param ksxm 考试项目
     * @param kscs 考试次数,-1=全部
     * @return [{考试项目过程1},{考试项目过程2}...]
     */
    List<Examproc> examproc(String lsh, String kskm, String ksxm, int kscs);

    /**
     * 拿到单次考试项目过程
     *
     * @param lsh  流水号
     * @param ksxm 考试项目
     * @param kscs 考试次数,0=全部
     * @return [{考试项目过程1},{考试项目过程2}...]
     */
    Examproc examproc(String lsh, String ksxm, int kscs);

    /**
     * 考试项目 开始时 写入过程表,抓拍,更新考生考试次数
     *
     * @param lsh   流水号
     * @param kscs  考试次数
     * @param ksxm  考试项目
     * @param jlcxh 教练车序号
     * @param kssj  开始时间
     * @return
     */
    void begin(String lsh, int kscs, String ksxm, String jlcxh, Date kssj, String kskm);

    /**
     * 考试科目 结束时 写入过程表
     *
     * @param lsh  流水号
     * @param kscs 考试次数
     * @param kskm 考试科目
     * @param jssj 结束时间
     * @param kscj 考试成绩
     * @return
     */
    int end(String lsh, int kscs, String kskm, String jlcxh, Date jssj, int kscj);

    /**
     * 考试项目 结束时 写入过程表
     *
     * @param lsh  流水号
     * @param kscs 考试次数
     * @param ksxm 考试项目
     * @param jssj 结束时间
     * @return
     */
    int ksxmend(String lsh, int kscs, String kskm, String ksxm, Date jssj);

    /**
     * 删除考试过程
     *
     * @param lsh  流水号
     * @param kscs 考试次数,-1表示全部
     * @param ksxm 考试项目,null表示全部
     */
    void delete(String lsh, int kscs, String ksxm) throws Exception;

    void updateByPrimaryKeySelective(Examproc proc);

    /**
     * 最大考试次数(含误判)
     *
     * @param lsh  流水号
     * @param kskm 考试科目
     * @param ksxm 考试项目
     * @return 最大考试次数
     */
    int maxKscsWithMisJudge(String lsh, String kskm, String ksxm);

    /**
     * 图片的命名规则
     *
     * @param lsh  流水号
     * @param ksxm 考试项目
     * @param kscs 考试次数
     * @param custom 自定义
     * @return 图片的绝对路径
     */
    String generatePicName(String lsh, String ksxm, int kscs, String custom);

    /**
     * 按考试次数来转移考试过程数据
     * @param lsh   流水号
     * @param kskm  考试科目
     * @param ori   转移<span style="color:red">之前</span>的考试次数
     * @param des   转移<span style="color:red">之后</span>的考试次数
     */
    void moveByKscs(String lsh, String kskm, int ori, int des) throws Exception;

    List<Examproc> queryByLsh(String lsh, Integer kscs);

    List<Examproc> queryByLsh(String lsh);

}
