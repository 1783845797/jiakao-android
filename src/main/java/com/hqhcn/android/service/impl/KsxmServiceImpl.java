package com.hqhcn.android.service.impl;


import com.hqh.android.dao.KsxmMapper;
import com.hqh.android.entity.Ksld;
import com.hqh.android.entity.Ksxm;
import com.hqh.android.entity.KsxmExample;
import com.hqh.android.service.KsldService;
import com.hqh.android.service.KsxmService;
import org.apache.commons.collections.map.LinkedMap;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class KsxmServiceImpl implements KsxmService {

    @Autowired
    private KsxmMapper mapper;
    @Autowired
    private KsldService ksldService;


    @Override
    public List<Ksxm> selectByExample(KsxmExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public List<Ksxm> getKSXM(String kskm) {
        KsxmExample example = new KsxmExample();
        if (StringUtils.isEmpty(kskm)) {
            example.createCriteria().andKfzEqualTo("");
        } else {
            example.createCriteria().andKskmEqualTo(kskm).andKfzEqualTo("");
        }
        return mapper.selectByExample(example);
    }

    @Override
    public List<String> getKSXMcode(String kskm) {
        List<Ksxm> ksxms = getKSXM(kskm);
        List<String> ksxmcode = new ArrayList<>();
        for (Ksxm ksxm : ksxms) {
            ksxmcode.add(ksxm.getCode() + "");
        }
        return ksxmcode;
    }

    @Override
    public List<Ksxm> getCodeName(String kskm) {
        KsxmExample example = new KsxmExample();
        if (StringUtils.isEmpty(kskm)) {
            example.createCriteria().andKfzEqualTo("");
        } else {
            example.createCriteria().andKskmEqualTo(kskm).andKfzEqualTo("");
        }
        return mapper.selectCodeNameByExample(example);
    }

    @Override
    public List<Ksxm> getTYXM(String kskm) {
        KsxmExample example = new KsxmExample();
        example.createCriteria().andKskmEqualTo(kskm).andUpCodeIsNull().andKfzNotEqualTo("");
        return mapper.selectByExample(example);
    }

    @Override
    public List<Ksxm> getZYKFX(String kskm) {
        KsxmExample example = new KsxmExample();
        example.createCriteria().andKskmEqualTo(kskm).andUpCodeIsNotNull().andKfzNotEqualTo("");
        return mapper.selectByExample(example);
    }

    @Override
    public List<Ksxm> getZYKFX(String kskm, String ksxm) {
        KsxmExample example = new KsxmExample();
        if (StringUtils.isEmpty(kskm)) {
            example.createCriteria().andUpCodeEqualTo(ksxm).andKfzNotEqualTo("");
        } else {
            example.createCriteria().andKskmEqualTo(kskm).andUpCodeEqualTo(ksxm).andKfzNotEqualTo("");
        }
        return mapper.selectByExample(example);
    }

    @Override
    public List<Ksld> queryToPage(KsxmExample example) {
        return mapper.selectByExampleToPage(example);
    }

    @Override
    public void add(Ksxm entity) {
        if (null == entity.getZt()){
            entity.setZt(1);
        }
        mapper.insertSelective(entity);
    }

    @Override
    public Ksxm selectByCode(String code) {
        return mapper.selectByPrimaryKey(code);
    }

    @Override
    public void update(Ksxm entity) {
        if (StringUtils.isEmpty(entity.getCode61())){
            entity.setCode61(entity.getCode());
        }
        mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public void delete(Ksxm entity) {
        mapper.deleteByPrimaryKey(entity.getCode());
    }

    @Override
    public Map<String, String> getCodeMap(String kskm) {
        Map<String, String> codeMap = new LinkedMap();
        List<Ksxm> ksxms = getKSXM(kskm);
        for (Ksxm ksxm : ksxms) {
            codeMap.put(ksxm.getCode() + "", ksxm.getName());
        }
        return codeMap;
    }

    @Override
    public List<Ksxm> getKFX(String kskm) {
        return getKFX(kskm,1);
    }

    @Override
    public List<Ksxm> getKFX(String kskm, int zt) {
        KsxmExample example = new KsxmExample();
        KsxmExample.Criteria criteria = example.createCriteria();
        criteria.andKfzNotEqualTo("");
        if (StringUtils.isNotEmpty(kskm)) {
            criteria.andKskmEqualTo(kskm);
        }
        if (-1 != zt) {
            criteria.andZtEqualTo(zt);
        }
        return mapper.selectByExample(example);
    }

    @Override
    public List<Ksxm> getKFX61(String kskm) {
        List kfx61 = new ArrayList<Ksxm>();
        for (Ksxm ksxm : getKFX(kskm, -1)) {
            if (ksxm.getCode61().equals(ksxm.getCode())) {
                // 六合一上传项目代码 和 扣分代码 一样的才是 六合一扣分项
                kfx61.add(ksxm);
            }
        }
        return kfx61;
    }
}
