package com.hqhcn.android.service.impl;

import com.hqh.android.dao.UsersMapper;
import com.hqh.android.entity.Users;
import com.hqh.android.entity.UsersExample;
import com.hqh.android.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper userDao;

    /**
     * 用户添加保存
     */
    @Override
    public void add(Users entity) throws Exception {
        userDao.insert(entity);
    }

    /**
     * 用户信息删除
     */
    @Override
    public int delete(String usersCode) throws Exception {
        return userDao.deleteByPrimaryKey(usersCode);
    }

    /**
     * 根据用户账号查询用户对象
     */
    @Override
    public Users getEntity(String usersCode) {
        return userDao.selectByPrimaryKey(usersCode);
    }

    /**
     * 查询用户信息分页列表
     */
    @Override
    public List<Users> query(UsersExample example) throws Exception {
        List<Users> list_data = userDao.selectByExampleToPage(example);
        return list_data;
    }

    /**
     * 根据条件查询用户信息
     */
    @Override
    public List<Users> selectByExample(UsersExample example) {
        return userDao.selectByExample(example);
    }

    @Override
    public Users getUser(String userCode, String password) {
        Users currentUser = selectByID(userCode);
        if (null == currentUser) {
            return null;
        }
        UsersExample example = new UsersExample();
        example.createCriteria().andUserCodeEqualTo(userCode).andPasswordEqualTo(encryptPassword(userCode, currentUser.getF5(), password));
        List<Users> users = userDao.selectByExample(example);
        if (users == null || users.size() == 0) {
            return null;
        } else {
            return users.get(0);
        }
    }

    /**
     * 用户信息修改
     */
    @Override
    public int update(Users entity) {
        return userDao.updateByPrimaryKeySelective(entity);
    }

    /**
     * 用户信息修改
     */
    @Override
    public void updateByExampleSelective(Users entity, UsersExample example) {
        userDao.updateByExampleSelective(entity, example);
    }

    @Override
    public Users selectByID(String userCode) {
        return userDao.selectByPrimaryKey(userCode);
    }

    @Override
    public List<Users> getRole(int roleID) {
        UsersExample example = new UsersExample();
        example.createCriteria().andRoleIdEqualTo(roleID);
        return selectByExample(example);
    }

    @Override
    public boolean loginAble(int userStat) {
        if (1 == userStat) {
            return true;
        }
        return false;
    }

//    @Override
//    public boolean isLogined(String userCode) {
//        String sessionID = OnlineUserSessionListener.getSessionID(userCode);
//        if (StringUtils.isNotEmpty(sessionID)) {
//            return true;
//        }
//        return false;
//    }

    @Override
    public boolean isAdmin(String userCode) {
        return "admin".equals(userCode);
    }

    @Override
    public String encryptPassword(String usercode, String identifier, String password) {
        password = usercode + identifier + password;
        String cryptogram = DigestUtils.md5DigestAsHex(password.getBytes());
        return cryptogram;
    }

    @Override
    public void disable(String usercode) {
        Users userDisable = new Users();
        userDisable.setUserCode(usercode);
        userDisable.setUserstat(2);
        update(userDisable);
    }

    @Override
    public boolean isPKY(int roleID) {
        return pkyRoleID.equals(roleID + "");
    }

}
