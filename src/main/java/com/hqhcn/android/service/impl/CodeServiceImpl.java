package com.hqhcn.android.service.impl;

import com.hqh.android.dao.CodeMapper;
import com.hqh.android.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeMapper mapper;

    @Override
    public Map<String, Map<String, String>> loadCode() {
        Map<String, Map<String, String>> frmCode_map = new HashMap<String, Map<String, String>>();
        List list = mapper.loadCodeMap();
        for (Object obj : list) {
            Map<String, Object> map = (Map<String, Object>) obj;
            String xtlb = map.get("XTLB").toString();
            String dmlb = map.get("DMLB").toString();
            String dmz = map.get("DMZ").toString().trim();
            String dmsm1 = map.get("DMSM1").toString();

            if (null == frmCode_map.get(xtlb + "_" + dmlb)) {
                Map<String, String> codeMap = new LinkedHashMap<String, String>();
                codeMap.put(dmz, dmsm1);
                frmCode_map.put(xtlb + "_" + dmlb, codeMap);
            } else {
                frmCode_map.get(xtlb + "_" + dmlb).put(dmz, dmsm1);
            }
        }
        return frmCode_map;
    }
}
