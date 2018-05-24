package com.hqhcn.android.service;


import com.hqh.android.entity.Log;
import com.hqh.android.entity.LogExample;
import com.hqh.android.tool.LogType;

import java.util.List;

public interface LogService {
    void add(Log entity) throws Exception;

    List<Log> query(LogExample example);

    /**
     * 添加到操作日志记录
     *
     * @param cz       操作类型
     * @param czip     操作员电脑IP
     * @param jmw      加密位
     * @param logtype  1:系统日志 2:业务日志 3:非常规操作
     * @param program  模块代码
     * @param usercode 操作员账号
     * @param xxsm     详细说明
     * @throws Exception
     */
    void info(LogType cz, String czip, String jmw, String logtype,
              String program, String usercode, String xxsm);

    /**
     * 添加到操作日志记录
     *
     * @param cz         操作类型
     * @param czip       操作员电脑IP
     * @param jmw        加密位
     * @param logtype    1:系统日志 2:业务日志 3:非常规操作
     * @param program    模块代码
     * @param usercode   操作员账号
     * @param xxsm       详细说明
     * @param resultCode 操作结果 0:失败 1:成功
     * @throws Exception
     */
    void info(LogType cz, String czip, String jmw, String logtype,
              String program, String usercode, String xxsm, String resultCode);


    /**
     * 只查询今天的数据
     *
     * @param example
     * @return
     * @throws Exception
     */
    List<Log> queryToday(LogExample example);
}
