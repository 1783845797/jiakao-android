package com.hqhcn.android.service.impl;

import com.hqh.android.dao.CarinfoMapper;
import com.hqh.android.entity.Carinfo;
import com.hqh.android.entity.CarinfoExample;
import com.hqh.android.entity.Exampreasign;
import com.hqh.android.entity.ExampreasignExample;
import com.hqh.android.service.CarinfoService;
import com.hqh.android.service.ExamineeService;
import com.hqh.android.tool.AttrUtils;
import com.hqh.android.web.InitLoad;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CarinfoServiceImpl implements CarinfoService {

    @Autowired
    CarinfoMapper mapper;
    @Autowired
    ExamineeService examineeService;

    @Override
    public List<Carinfo> query(CarinfoExample example) {
        try {
            return mapper.selectByExample(example);
        } catch (Exception e) {
            return Collections.emptyList();
        }

    }

    @Override
    public List<Carinfo> selectByExampleToPage(CarinfoExample example) {
        return mapper.selectByExampleToPage(example);
    }

    @Override
    public List<String> queryJLCXH(CarinfoExample example) {
        return mapper.selectJLCXHByExample(example);
    }

    @Override
    public Carinfo query(String kcdddh, String jlcxh) {
        CarinfoExample example = new CarinfoExample();
        if (StringUtils.isEmpty(jlcxh)){
            example.createCriteria().andKcdddhEqualTo(kcdddh);
        }else {
            example.createCriteria().andKcdddhEqualTo(kcdddh).andJlcxhEqualTo(jlcxh);
        }
        List<Carinfo> carinfos = query(example);
        return carinfos == null || carinfos.size() == 0 ? null : carinfos.get(0);
    }

    @Override
    @Transactional
    public void update(Carinfo entity) {
        if (CarinfoService.ZT_UNUSABLE.equals(entity.getJlczt())){
            breakdown(entity.getJlcxh());
        }

        mapper.updateByPrimaryKeySelective(entity);
        InitLoad.init_jlcxh_carinfo();
    }

    @Override
    public void update(String jlcxh, String zt) {
        Carinfo carinfo = new Carinfo();
        carinfo.setKcdddh(InitLoad.kcdddh);
        carinfo.setJlcxh(jlcxh);
        carinfo.setJlczt(zt);
        update(carinfo);
    }

    @Override
    public void add(Carinfo entity) {
        mapper.insertSelective(entity);
        InitLoad.init_jlcxh_carinfo();
    }

    @Override
    public Carinfo queryByIP(String ip) {
        CarinfoExample example = new CarinfoExample();
        example.createCriteria().andJbrEqualTo(ip).andKcdddhEqualTo(InitLoad.kcdddh);
        List<Carinfo> carinfos = query(example);
        return carinfos == null || carinfos.size() == 0 ? null : carinfos.get(0);
    }

    @Override
    public List<Carinfo> usable(String kskm) {
        CarinfoExample example = new CarinfoExample();
        example.createCriteria().andJlcztEqualTo("0").andKskmEqualTo(kskm).andKcdddhEqualTo(InitLoad.kcdddh);
        return mapper.selectByExample(example);
    }

    @Override
    public List<Carinfo> queryByNvrName(String NvrName) {
        CarinfoExample example1 = new CarinfoExample();
        example1.createCriteria().andCam1NvrEqualTo(NvrName);

        CarinfoExample.Criteria criteria2 = new CarinfoExample().createCriteria();
        criteria2.andCam2NvrEqualTo(NvrName);

        CarinfoExample.Criteria criteria3 = new CarinfoExample().createCriteria();
        criteria3.andCam3NvrEqualTo(NvrName);

        example1.or(criteria2);
        example1.or(criteria3);
        List<Carinfo> carinfos =mapper.selectByExample(example1);
        return carinfos;
    }

    @Override
    @Transactional
    public void breakdown(String jlcxh) {
        jlcxh = jlcxh.trim();

        // 将该车上 未完成考试 的考生状态改成未分配,保留 考试路段信息,然后清除已分配的车辆记录
        ExampreasignExample example57 = new ExampreasignExample();
        example57.createCriteria().andJlcxhEqualTo(jlcxh).andZtIn(Arrays.asList(
                ExamineeService.ZT_EXAMING, ExamineeService.ZT_EXAM1STEND));
        Exampreasign exampreasign57 = new Exampreasign();
        exampreasign57.setZt(ExamineeService.ZT_UNASSIGN);
        exampreasign57.setJlcxh("");
        examineeService.update(exampreasign57, example57);

        // 将该车上 未开始考试的考生 状态改成未分配,清除 考试路段信息,然后清除已分配的车辆记录
        ExampreasignExample example34 = new ExampreasignExample();
        example34.createCriteria().andJlcxhEqualTo(jlcxh).andZtIn(Arrays.asList(
                ExamineeService.ZT_NOTINCAR, ExamineeService.ZT_NOEXAM));
        Exampreasign Exampreasign34 = new Exampreasign();
        Exampreasign34.setZt(ExamineeService.ZT_UNASSIGN);
        Exampreasign34.setKsld("");
        Exampreasign34.setJlcxh("");
        examineeService.update(Exampreasign34, example34);
    }

}
