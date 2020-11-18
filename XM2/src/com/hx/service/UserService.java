package com.hx.service;

import java.util.List;

import com.hx.entity.User;

/**
 * 用户业务层接口
 * @author bear
 *
 */
public interface UserService {

	//查询所有用户的方法
	public List<User> findAllUser();

}
