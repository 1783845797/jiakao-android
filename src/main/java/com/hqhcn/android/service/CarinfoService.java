package com.hqhcn.android.service;

import com.hqh.android.entity.Carinfo;
import com.hqh.android.entity.CarinfoExample;

import java.util.List;

public interface CarinfoService {

    /**
     * 状态:可用
     */
    final String ZT_USABLE = "0";
    /**
     * 状态:不可用
     */
    final String ZT_UNUSABLE = "1";

    /**
     * 车辆用途:考试
     */
    int TYPE_EXAM = 1;
    /**
     * 车辆用途:训练
     */
    int TYPE_TRAIN = 2;
    /**
     * 车辆用途:通用
     */
    int TYPE_BOTH = 3;

    List<Carinfo> query(CarinfoExample example);

    List<Carinfo> selectByExampleToPage(CarinfoExample example);

    List<String> queryJLCXH(CarinfoExample example);

    /**
     * 查询车辆信息
     *
     * @param kcdddh 考场地点代号
     * @param jlcxh  教练车序号 ""表示全部查询
     * @return
     */
    Carinfo query(String kcdddh, String jlcxh);


    void update(Carinfo entity);

    /**
     * 直接修改车辆的状态
     * @param jlcxh 车辆序号
     * @param zt 状态 0:正常 1:异常
     * @return
     */
    void update(String jlcxh, String zt);

    void add(Carinfo entity);

    /**
     * 根据IP查找车辆信息.考场代号默认用本地配置
     *
     * @param ip
     * @return
     * @throws Exception
     */
    Carinfo queryByIP(String ip);

    /**
     * 返回所有可用的车辆信息,闲置没有上路(jlczt=0)
     * @param kskm 考试科目
     * @return
     */
    List<Carinfo> usable(String kskm);

    List<Carinfo> queryByNvrName(String NvrName);

    /**
     * 车辆故障操作
     * @param jlcxh 教练车序号
     */
    void breakdown(String jlcxh);

}
