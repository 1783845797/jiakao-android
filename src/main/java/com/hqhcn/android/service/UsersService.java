package com.hqhcn.android.service;

import com.hqh.android.entity.Users;
import com.hqh.android.entity.UsersExample;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
public interface UsersService {

    /**
     * 状态:停用
     */
    int ZT_INVALID = 2;
    /**
     * 状态:正常
     */
    int ZT_VALID = 1;

    /**
     * 陪考员角色ID
     */
    @Value("${jiakao.pky-roleID}")
    String pkyRoleID = "76";

    /**
     * 监控员角色ID
     */
    @Value("${jiakao.monitor-roleID}")
    String monitorRoleID = "77";

    /**
     * @param @param  entity
     * @param @throws Exception    设定文件
     * @return void    返回类型
     * @throws
     * @Title: add
     * 用户添加保存
     * @author zl
     * 2013-6-28
     */
    void add(Users entity) throws Exception;

    /**
     * @param @param  entity
     * @param @return
     * @param @throws Exception    设定文件
     * @return int    返回类型
     * @throws
     * @Title: update
     * 用户修改保存
     * @author zl
     * 2013-6-28
     */
    int update(Users entity);

    /**
     * 用户修改
     * @param entity 要修改的对象
     * @param example 修改条件
     * @return
     */
    void updateByExampleSelective(Users entity, UsersExample example);

    /**
     * @param @param  UsersCode
     * @param @return
     * @param @throws Exception    设定文件
     * @return int    返回类型
     * @throws
     * @Title: delete
     * 用户删除
     * @author zl
     * 2013-6-28
     */
    int delete(String UsersCode) throws Exception;

    /**
     * @param @param  UsersCode
     * @param @return
     * @param @throws Exception    设定文件
     * @return Users    返回类型
     * @throws
     * @Title: getEntity
     * 根据用户账号获取用户对象
     * @author zl
     * 2013-6-28
     */
    Users getEntity(String UsersCode);

    /**
     * @param @param  example
     * @param @return
     * @param @throws Exception    设定文件
     * @return List<Users>    返回类型
     * @throws
     * @Title: query
     * 用户信息分页查询
     * @author zl
     * 2013-6-28
     */
    List<Users> query(UsersExample example) throws Exception;

    /**
     * @param @param  example
     * @param @return 设定文件
     * @return List<Users>    返回类型
     * @throws
     * @Title: selectByExample
     * 根据条件查询用户信息
     * @author zl
     * 2013-6-28
     */
    List<Users> selectByExample(UsersExample example);

    /**
     * @param @param  userCode
     * @param @param  password
     * @param @return 设定文件
     * @return SuperUser    返回类型
     * @throws
     * @Title: getUser
     * 获取登录用户信息
     * @author zl
     * 2013-7-11
     */
    Users getUser(String userCode, String password);

    /**
     * 根据ID查找
     */
    Users selectByID(String userCode);

    /**
     * 按照角色获取用户列表
     * @param roleID    角色ID
     * @return
     */
    List<Users> getRole(int roleID);

    /**
     * 验证用户状态,看是否可以登陆
     * @param userStat 用户状态    状态->0-撤销 1-正常 2-停用
     * @return 能否登陆
     */
    boolean loginAble(int userStat);

    /**
     * 该账户是否已登陆
     * @param userCode 账号
     * @return 该账户是否已登陆
     */
//    boolean isLogined(String userCode);

    /**
     * 是否是超级管理员admin
     * @param userCode 账号
     * @return
     */
    boolean isAdmin(String userCode);

    /**
     * 密码加密保存
     *
     * @param usercode   账号
     * @param identifier 唯一标识符
     * @param password   明文密码
     * @return
     */
    String encryptPassword(String usercode, String identifier, String password);

    /**
     * 禁用账户
     * @param usercode
     */
    void disable(String usercode);

    boolean isPKY(int roleID);
}
