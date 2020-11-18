package com.hx.service;

import com.hx.entity.Admin;

/**
 * 用户的登录业务层接口
 * @author bear
 *
 */
public interface LoginService {

	//管理员登录的方法
   public	Admin Login(String name, String password);
	
}
