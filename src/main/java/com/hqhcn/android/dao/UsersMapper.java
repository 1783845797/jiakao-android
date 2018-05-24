package com.hqhcn.android.dao;

import com.hqh.android.entity.Users;
import com.hqh.android.entity.UsersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(String userCode);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(String userCode);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    List<Users> selectByExampleToPage(UsersExample example);
}