package com.hqhcn.android.service;

import com.hqh.android.entity.Ksld;
import com.hqh.android.entity.Ksxm;
import com.hqh.android.entity.KsxmExample;

import java.util.List;
import java.util.Map;

public interface KsxmService {

    List<Ksxm> selectByExample(KsxmExample example);
    /**
     * 根据考试科目拿到下面的考试项目信息
     *
     * @param kskm 考试科目
     * @return [{考试项目1},{考试项目2}...]
     */
    List<Ksxm> getKSXM(String kskm);

    /**
     * 根据考试科目拿到下面的考试项目代码
     *
     * @param kskm 考试科目
     * @return [考试项目代码1, 考试项目代码2...]
     */
    List<String> getKSXMcode(String kskm);

    /**
     * 只返回考试项目得code和name
     *
     * @param kskm 考试科目
     */
    List<Ksxm> getCodeName(String kskm);

    /**
     * 根据考试科目拿到下面的通用扣分项
     *
     * @param kskm 考试科目
     * @return
     */
    List<Ksxm> getTYXM(String kskm);

    /**
     * 根据考试科目拿到下面的专用扣分项
     *
     * @param kskm 考试科目
     * @return
     */
    List<Ksxm> getZYKFX(String kskm);

    /**
     * 根据考试科目和考试项目拿到下面的专用扣分项
     *
     * @param kskm 考试科目(可选)
     * @param ksxm 考试项目
     * @return
     */
    List<Ksxm> getZYKFX(String kskm, String ksxm);

    List<Ksld> queryToPage(KsxmExample example);

    /**
     * 新加一个考试项目 要在所有该科目下的路线中同步新增
     * @param entity 考试项目对象
     */
    void add(Ksxm entity);

    Ksxm selectByCode(String code);

    void update(Ksxm entity);

    void delete(Ksxm entity);

    /**
     * 返回Map类型,key是考试项目代码,value是该代码对应的名称
     * @param kskm  考试科目
     * @return
     */
    Map<String ,String> getCodeMap(String kskm);

    /**
     * 拿到所有<code>启用中</code>的扣分项(包括通用扣分项和专用扣分项)
     * @param kskm 考试科目,null=全部
     * @return
     */
    List<Ksxm> getKFX(String kskm);

    /**
     * 拿到所有扣分项(包括通用扣分项和专用扣分项),包括<code>启用</code>和<code>停用</code>状态
     * @param kskm 考试科目,null=全部
     * @param zt 状态 0=停用 1=启用 -1=全部
     * @return
     */
    List<Ksxm> getKFX(String kskm, int zt);

    /**
     * 拿到六合一扣分项(包括通用扣分项和专用扣分项)
     *
     * @return
     */
    List<Ksxm> getKFX61(String kskm);
}
