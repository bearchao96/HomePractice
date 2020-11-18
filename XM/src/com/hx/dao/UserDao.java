package com.hx.dao;

import java.sql.SQLException;

import com.hx.entity.User;

/**
 * 用户持久层接口
 */
public interface UserDao {
	//注册的方法
    public void UserRegist(User user) throws SQLException;
    //根据账号查询用户
    public User isLogin(long u_usernum) throws SQLException;

    //登录的方法
    public User Login(long u_usernum, String u_password) throws SQLException;

    // 根据用户手机号返回账号个刚注册的用户
    public User findByNum(long phone) throws SQLException;
}
