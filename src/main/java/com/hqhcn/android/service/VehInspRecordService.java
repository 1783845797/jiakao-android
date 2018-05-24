package com.hqhcn.android.service;

import com.hqh.android.entity.VehInspRecord;
import com.hqh.android.entity.VehInspRecordExample;

import java.util.List;

public interface VehInspRecordService {

    void create(VehInspRecord entity);

    /**
     * 添加检测记录
     * 同步更新车辆的状态
     * @param entity
     */
    void createSelective(VehInspRecord entity);

    List<VehInspRecord> retrieve(VehInspRecordExample example);

    VehInspRecord retrieve(long id);

    void update(VehInspRecord entity, VehInspRecordExample example);

    void updateSelective(VehInspRecord entity, VehInspRecordExample example);

    void delete(long id);

    List<VehInspRecord> selectByExampleToPage(VehInspRecordExample example);
}
