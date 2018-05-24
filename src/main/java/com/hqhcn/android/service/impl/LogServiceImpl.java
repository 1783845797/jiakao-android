package com.hqhcn.android.service.impl;


import com.hqh.android.dao.LogMapper;
import com.hqh.android.entity.Log;
import com.hqh.android.entity.LogExample;
import com.hqh.android.service.LogService;
import com.hqh.android.tool.LogType;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logDao;

    /**
     * 日志信息插入
     */
    @Override
    public void add(Log entity) {
        String jyw = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            // TODO: 2018/1/22 0022 没有序列化
            md.update(entity.toString().getBytes());
            jyw = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        entity.setJmw(jyw);
        logDao.insert(entity);
    }

    /**
     * 查询日志信息列表
     */
    @Override
    public List<Log> query(LogExample example) {
        List<Log> list_data = logDao.selectByExampleToPage(example);
        return list_data;
    }

    @Override
    public void info(LogType cz, String czip, String jmw, String logtype, String program, String usercode, String xxsm) {
        info(cz, czip, jmw, logtype, program, usercode, xxsm, "1");
    }

    @Override
    public void info(LogType cz, String czip, String jmw, String logtype, String program, String usercode, String xxsm, String resultCode) {
        Log record = new Log();
        record.setId(UUID.randomUUID().toString());
        record.setCz(cz.toString());
        record.setCzip(czip);
        record.setCzsj(new Date());
        record.setJmw(jmw);
        record.setLogtype(logtype);
        record.setProgram(program);
        record.setUserCode(usercode == null ? "" : usercode);
        record.setXxsm(xxsm);
        record.setF1(resultCode);

        try {
            // TODO: 2018/2/28 0028 以后要统一
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(record.toString().getBytes());
            jmw = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        record.setJmw(jmw);
        add(record);
    }

    @Override
    public List<Log> queryToday(LogExample example) {
        // TODO: 2017/12/14 0014 待测试
        Date tomorrow = DateUtils.addDays(new Date(), 1);
        List<LogExample.Criteria> criteriaList = example.getOredCriteria();
        criteriaList.get(0).andCzsjBetween(
                DateUtils.truncate(new Date(), Calendar.DAY_OF_MONTH),
                DateUtils.truncate(tomorrow, Calendar.DAY_OF_MONTH));
        return logDao.selectByExample(example);
    }

}


