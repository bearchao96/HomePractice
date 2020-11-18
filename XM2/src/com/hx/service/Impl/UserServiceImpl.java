package com.hx.service.Impl;

import java.sql.SQLException;
import java.util.List;

import com.hx.dao.UserDao;
import com.hx.dao.Impl.UserDaoImpl;
import com.hx.entity.User;
import com.hx.service.UserService;

/**
 * 用户业务层接口实现类
 * @author bear
 *
 */
public class UserServiceImpl implements UserService {

	/**
	 * 查询所有用户的方法
	 */
	@Override
	public List<User> findAllUser() {
		//创建用户持久层
		UserDao userDao = new UserDaoImpl();
		try {
			return userDao.findAllUser();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
