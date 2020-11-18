package com.hx.dao;

import java.sql.SQLException;
import java.util.List;

import com.hx.entity.User;

/**
 * 用户持久层接口
 * @author bear
 *
 */
public interface UserDao {

	//查询所有用户
	public List<User> findAllUser() throws SQLException;

	//根据id 查找用户
	public User findByIdUser(String user_id) throws SQLException;

}
