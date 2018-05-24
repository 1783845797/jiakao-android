package com.hqhcn.android.service.impl;

import com.hqh.android.dao.NvrInfoMapper;
import com.hqh.android.entity.NvrInfo;
import com.hqh.android.entity.NvrInfoExample;
import com.hqh.android.service.NvrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NvrInfoServiceImpl implements NvrInfoService {

    @Autowired
    NvrInfoMapper mapper;

    @Override
    public List<NvrInfo> selectByExample(NvrInfoExample example) {
        return mapper.selectByExample(example);
    }
    @Override
    public List<String> selectNameByExample(NvrInfoExample example) {
        return mapper.selectNameByExample(example);
    }

    @Override
    public NvrInfo selectByPrimaryKey(String name) {
        return mapper.selectByPrimaryKey(name);
    }

    @Override
    public int add(NvrInfo entity) {
        try {
            return mapper.insert(entity);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int updateByPrimaryKeySelective(NvrInfo entity) {
        try {
            return mapper.updateByPrimaryKeySelective(entity);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int deleteByPrimaryKey(String name) {
        try {
            return mapper.deleteByPrimaryKey(name);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public List<NvrInfo> query(NvrInfoExample example) {
        return mapper.selectByExampleToPage(example);
    }
}
