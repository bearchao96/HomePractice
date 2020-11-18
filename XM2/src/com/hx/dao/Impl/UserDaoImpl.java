package com.hx.dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hx.dao.UserDao;
import com.hx.entity.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 用户持久层接口实现类
 * @author bear
 *
 */
public class UserDaoImpl implements UserDao {

	//创建数据库连接
    public static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    //获取数据库操作对象
    public static QueryRunner queryRunner = new QueryRunner(dataSource);
	/**
	 * 查询所有用户
	 * @throws SQLException 
	 */
	@Override
	public List<User> findAllUser() throws SQLException {
		//操作查询
		return queryRunner.query("select * from t_user", new BeanListHandler<User>(User.class));
	}
	
	/**
	 * 根据id查询用户
	 * @throws SQLException 
	 */
	@Override
	public User findByIdUser(String user_id) throws SQLException {
		//操作查询
		return queryRunner.query("select * from t_user where u_id = ?", new BeanHandler<User>(User.class),user_id);
		
	}

}
