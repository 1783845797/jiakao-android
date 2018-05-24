package com.hqhcn.android.service;

import com.hqh.android.entity.Examsite;
import com.hqh.android.entity.ExamsiteExample;

import java.util.List;
import java.util.Map;

public interface ExamsiteService {

    Map queryToMap(ExamsiteExample example);

    List selectByExample(ExamsiteExample example);

    int insert(Examsite entity);

    List selectByExampleToPage(ExamsiteExample example);

    /**
     * 只返回考场名称和 考场代号
     *
     * @return
     */
    List getKcdddhKcmc();

    /**
     * 查询考场配置
     * @param kcdddh    考场地点代号
     * @return
     */
    Examsite get(String kcdddh);

    void update(Examsite entity);
}
