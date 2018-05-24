package com.hqhcn.android.service.impl;

import com.hqh.android.dao.KsldMapper;
import com.hqh.android.entity.Carinfo;
import com.hqh.android.entity.CarinfoExample;
import com.hqh.android.entity.Ksld;
import com.hqh.android.entity.KsldExample;
import com.hqh.android.service.CarinfoService;
import com.hqh.android.service.KsldService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class KsldServiceImpl implements KsldService {

    @Autowired
    private KsldMapper mapper;
    @Autowired
    private CarinfoService carinfoService;

    @Override
    public List<Ksld> queryToPage(KsldExample example) {
        return mapper.selectByExampleToPage(example);
    }

    @Override
    public List<Ksld> selectByExample(KsldExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Ksld get(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public Ksld getByName(String name) {
        if (StringUtils.isNotEmpty(name)) {
            KsldExample example = new KsldExample();
            example.createCriteria().andNameEqualTo(name);
            List<Ksld> kslds = selectByExample(example);
            return kslds == null ? null : kslds.get(0);
        }else{
            return null;
        }
    }

    @Override
    public int add(Ksld entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public void update(Ksld entity) {
        mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public void update(Ksld entity, KsldExample example) {
        mapper.updateByExampleSelective(entity, example);
    }

    @Override
    @Transactional
    public void del(Ksld entity) throws Exception {
        entity = get(entity.getId());
        CarinfoExample carinfoExample = new CarinfoExample();
        carinfoExample.createCriteria().andKsldEqualTo(entity.getName());
        List<Carinfo> carinfos = carinfoService.query(carinfoExample);
        if (CollectionUtils.isEmpty(carinfos)){
            mapper.deleteByPrimaryKey(entity.getId());
        }else {
            throw new Exception("此考试路线正在使用中,删除失败!");
        }
    }
}
