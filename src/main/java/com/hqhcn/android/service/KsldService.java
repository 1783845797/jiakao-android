package com.hqhcn.android.service;


import com.hqh.android.entity.Ksld;
import com.hqh.android.entity.KsldExample;

import java.util.List;

public interface KsldService {

    public static final int 状态_不可用 = 0;
    public static final int 状态_可用 = 1;

    List<Ksld> queryToPage(KsldExample example);

    List<Ksld> selectByExample(KsldExample example);

    Ksld get(String id);

    /**
     * 默认值返回第一条记录
     * @param name 考试路段名称
     * @return
     */
    Ksld getByName(String name);

    int add(Ksld entity);

    void update(Ksld entity);

    void update(Ksld entity, KsldExample example);

    void del(Ksld entity) throws Exception;
}
