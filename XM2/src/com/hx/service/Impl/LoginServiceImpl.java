package com.hx.service.Impl;

import java.sql.SQLException;

import com.hx.dao.LoginDao;
import com.hx.dao.Impl.LoginDaoImpl;
import com.hx.entity.Admin;
import com.hx.service.LoginService;
/**
 * 用户的登录业务层实现类
 * @author bear
 *
 */
public class LoginServiceImpl implements LoginService {

	/**
	 * 管理员登录的方法
	 */
	@Override
	public Admin Login(String name, String password) {
		
		//创建持久层对象
		LoginDao loginDao = new LoginDaoImpl();
	   //调用方法
		try {
			Admin admin = loginDao.Login(name,password);
			return admin ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
		
}
