package com.hqhcn.android.service.impl;

import com.hqh.android.dao.ExamsiteMapper;
import com.hqh.android.entity.Examsite;
import com.hqh.android.entity.ExamsiteExample;
import com.hqh.android.entity.Ksld;
import com.hqh.android.entity.KsldExample;
import com.hqh.android.service.ExamsiteService;
import com.hqh.android.service.KsldService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExamsiteServiceImpl implements ExamsiteService {

    @Autowired
    ExamsiteMapper mapper;
    @Autowired
    KsldService ksldService;

    @Override
    public Map queryToMap(ExamsiteExample example) {
        List<Examsite> list_data = mapper.selectByExample(example);
        Map map = new HashMap();
        for (Examsite entity : list_data) {
            map.put(entity.getKcdddh(), entity.getKcmc());
        }
        return map;
    }

    @Override
    public List<Examsite> selectByExample(ExamsiteExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public int insert(Examsite entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public List selectByExampleToPage(ExamsiteExample example) {
        return mapper.selectByExampleToPage(example);
    }

    @Override
    public List getKcdddhKcmc() {
        List<Examsite> result = new ArrayList<>();
        for (Examsite site : selectByExample(null)) {
            Examsite obj = new Examsite();
            obj.setKcdddh(site.getKcdddh());
            obj.setKcmc(site.getKcmc());
            result.add(obj);
        }
        return result;
    }

    @Override
    public Examsite get(String kcdddh) {
        return mapper.selectByPrimaryKey(kcdddh);
    }

    @Override
    @Transactional
    public void update(Examsite entity) {
        // 如果更新了阈值中的考试三项目要及时更新考试路段
        if (StringUtils.isNotEmpty(entity.getF4())) {
            String f4 = entity.getF4();
            // 取到 3010001,里面记录了哪些 考试项目 正在使用
            String ksxmsUseable = f4.substring(f4.indexOf("3010001") + "3010001".length()+1, f4.indexOf("3010002") - 1);
            String[] ksxms = ksxmsUseable.split(",");
            ksxmsUseable = "";
            for (String ksxm : ksxms) {
                if (!"0".equals(ksxm)) {
                    ksxmsUseable += ksxm + ",";
                }
            }
            ksxmsUseable = ksxmsUseable.substring(0, ksxmsUseable.length() - 1);

            // 更新考试路段中的考试项目
            Ksld ksld = new Ksld();
            ksld.setKsxmpx(ksxmsUseable);
            KsldExample example = new KsldExample();
            example.createCriteria().andKskmEqualTo(entity.getKskm());
            ksldService.update(ksld,example);
        }else if (StringUtils.isNotEmpty(entity.getF5())) {
            String f5 = entity.getF5();
            // 取到 3010001,里面记录了哪些 考试项目 正在使用
            String ksxmsUseable = f5.substring(f5.indexOf("1000001") + "1000001".length()+1, f5.indexOf("1000002") - 1);
            String[] ksxms = ksxmsUseable.split(",");
            ksxmsUseable = "";
            for (String ksxm : ksxms) {
                if (!"0".equals(ksxm)) {
                    ksxmsUseable += ksxm + ",";
                }
            }
            ksxmsUseable = ksxmsUseable.substring(0, ksxmsUseable.length() - 1);

            // 更新考试路段中的考试项目
            Ksld ksld = new Ksld();
            ksld.setKsxmpx(ksxmsUseable);
            KsldExample example = new KsldExample();
            example.createCriteria().andKskmEqualTo(entity.getKskm());
            ksldService.update(ksld,example);
        }

        entity.setKskm("");
        mapper.updateByPrimaryKeySelective(entity);
    }

}
