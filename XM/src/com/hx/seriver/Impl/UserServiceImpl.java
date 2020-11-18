package com.hx.seriver.Impl;

import java.sql.SQLException;

import com.hx.dao.UserDao;
import com.hx.dao.Impl.UserDaoImpl;
import com.hx.entity.User;
import com.hx.seriver.UserService;

public class UserServiceImpl implements UserService {

	/**
     * 注册的方法
     * @param user
     */
    @Override
    public void UserRegist(User user) {
        //创建持久层对象
        UserDao userDao = new UserDaoImpl();
        //调用方式
        try {
            userDao.UserRegist(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * 根据账号查询用户
     * @param u_usernum
     */
    @Override
    public User isLogin(long u_usernum) {
        //创建出持久层对象
        UserDao userDao = new UserDaoImpl();
        //调用方法
        try {
            return userDao.isLogin(u_usernum);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 登录的方法
     * @param u_usernum
     * @param u_password
     * @return
     */
    @Override
    public User Login(long u_usernum, String u_password) {
        //创建持久层对象
        UserDao userDao = new UserDaoImpl();
        //调用方法
        try {
            return userDao.Login(u_usernum,u_password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据用户手机号返回账号个刚注册的用户
     * @param phone
     * @return
     */
    @Override
    public User findByNum(long phone) {
        //创建持久层
        UserDao userDao = new UserDaoImpl();
        //调用方法
        try {
            return userDao.findByNum(phone);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
