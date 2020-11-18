package com.hx.dao.Impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.hx.dao.LoginDao;
import com.hx.entity.Admin;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 管理员登录的持久层接口实现类
 * @author bear
 *
 */
public class LoginDaoImpl implements LoginDao {
	
	 //创建数据库连接
    public static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    //获取数据库操作对象
    public static QueryRunner queryRunner = new QueryRunner(dataSource);
	/**
	 * 用户登录的方法
	 * @throws SQLException 
	 */
	@Override
	public Admin Login(String name, String password) throws SQLException {
		//操作数据库
		return queryRunner.query("select * from admin where a_name = ? and a_password = ?", new BeanHandler<Admin>(Admin.class),name,password);
		
	}

}
