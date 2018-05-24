package com.hqhcn.android.service;


import com.hqh.android.entity.Gps;
import com.hqh.android.entity.GpsExample;

import java.util.Date;
import java.util.List;

public interface GpsService {

    List<Gps> selectByExample(GpsExample example);

    /**
     * 获取单个项目的GPS
     *
     * @param lsh  考生流水号
     * @param kscs 考生本次科目的考试次数
     * @param ksxm 考试项目代码
     *
     * @notnull @return  单个项目的gps数据对象
     */
    Gps select(String lsh, int kscs, String ksxm);

    /**
     * 获取单个考生单次的GPS,由多段考试项目的GPS路径组合成整次考试的GPS路径
     *
     * @param lsh  考生流水号
     * @param kscs 考生本次科目的考试次数
     * @return [{起步GPS信息},{直线行驶GPS信息},{加减档位GPS信息},...]
     */
    List<Gps> select(String lsh, int kscs);

    /**
     * 记录科目开始时间,和底下每个项目的时间
     *
     * @param kskm
     * @param carinfoID
     * @param lsh
     * @param kscs
     * @param kssj
     * @return
     */
    int kskmbegin(String kskm, String carinfoID, String lsh, int kscs, Date kssj);

    /**
     * 更新gps数据
     *
     * @param lsh  流水号
     * @param kscs 考试次数
     * @param ksxm 考试项目
     * @param GPS  GPS数据
     * @return
     */
    int addGPS(String lsh, int kscs, String ksxm, String GPS);

    /**
     * 按考试次数来转移GPS数据
     * @param lsh   流水号
     * @param kskm  考试科目
     * @param ori   转移<span style="color:red">之前</span>的考试次数
     * @param des   转移<span style="color:red">之后</span>的考试次数
     */
    void moveByKscs(String lsh, String kskm, int ori, int des);
}
