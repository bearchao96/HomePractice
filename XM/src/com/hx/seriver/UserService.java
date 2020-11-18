package com.hx.seriver;

import com.hx.entity.User;

/**
 * 用户业务层 接口
 */
public interface UserService {

	//用户注册的方法
	   public void UserRegist(User user);
	   
	   //根据账号查询用户
	   public User isLogin(long u_usernum);
	   
	  //用户登录的方法
	   public User Login(long u_usernum, String u_password);
	   
	   //根据用户手机号返回账号个刚注册的用户
	   public User findByNum(long phone);

}
