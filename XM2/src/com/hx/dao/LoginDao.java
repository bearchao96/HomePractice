package com.hx.dao;

import java.sql.SQLException;

import com.hx.entity.Admin;

/**
 * 管理员登录的持久层接口
 * @author bear
 *
 */
public interface LoginDao {

	/**
	 * 用户登录的方法
	 * @param name
	 * @param password
	 * @throws SQLException 
	 */
      public Admin Login(String name, String password) throws SQLException;
 
}
