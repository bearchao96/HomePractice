package com.hx.dao;

import java.sql.SQLException;
import java.util.List;

import com.hx.entity.Home;
import com.hx.entity.User;
/**
 * 房屋持久层接口
 */
public interface HomeDao {

	//查询所有房屋信息的方法
    public List<Home> findHomeMsg() throws SQLException;

    //根据id查询房屋信息
    public Home findIdMsg(int id) throws SQLException;

    //添加用户预约房屋信息
    public int addyyHome(User user, int id) throws SQLException;

}
