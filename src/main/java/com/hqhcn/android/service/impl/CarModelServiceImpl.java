package com.hqhcn.android.service.impl;

import com.hqh.android.dao.CarmodelMapper;
import com.hqh.android.entity.*;
import com.hqh.android.service.CarModelService;
import com.hqh.android.service.CarinfoService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarModelServiceImpl implements CarModelService {

    @Autowired
    CarmodelMapper mapper;
    @Autowired
    CarinfoService carinfoService;


    @Override
    public List<String> getCLPPXH(String kcdddh) {
        CarmodelExample example = new CarmodelExample();
        example.createCriteria().andKcdddhEqualTo(kcdddh);

        return mapper.selectCLPPXHByExample(example);
    }

    @Override
    public void insert(Carmodel entity) {
        mapper.insert(entity);
    }

    @Override
    public Carmodel get(String id, String kcdddh) {
        Carmodel key = new Carmodel();
        key.setId(id);
        key.setKcdddh(kcdddh);
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public Carmodel getByCLPPXH(String clppxh, String kcdddh) {
        CarmodelExample example = new CarmodelExample();
        example.createCriteria().andKcdddhEqualTo(kcdddh).andClppxhEqualTo(clppxh);
        List<Carmodel> carmodels = query(example);
        return CollectionUtils.isEmpty(carmodels) ? null : carmodels.get(0);
    }

    @Override
    public void update(Carmodel entity) {
        mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<Carmodel> queryToPage(CarmodelExample example) {
        return mapper.selectByExampleToPage(example);
    }

    @Override
    public List<Carmodel> query(CarmodelExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public void delete(CarmodelKey carmodelKey) throws Exception {
        Carmodel carmodel = mapper.selectByPrimaryKey(carmodelKey);
        if (null != carmodel) {
            String clppxh = carmodel.getClppxh();
            CarinfoExample example = new CarinfoExample();
            example.createCriteria().andClppxhEqualTo(clppxh);
            List<Carinfo> carinfos = carinfoService.query(example);
            if (CollectionUtils.isEmpty(carinfos)) {
                mapper.deleteByPrimaryKey(carmodelKey);
            } else {
                throw new RuntimeException("此车辆模型正在使用中,删除失败!");
            }
        }
    }
}
