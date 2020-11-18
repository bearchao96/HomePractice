package com.hx.dao;

import java.sql.SQLException;
import java.util.List;

import com.hx.entity.Home;

/**
 * 房屋持久层接口
 * @author bear
 *
 */
public interface HomeDao {

  //添加房屋信息的方法	
  public void addAllHome(Home home) throws SQLException;

  //查询所有房屋信息
  public List<Home> findAllHome() throws SQLException;
  //根据房屋id 查找对应 
  public Home findByID(int home_id) throws SQLException;
  //修改房屋信息
  public void updateHome(Home home, int id) throws SQLException;

  //根据房东姓名查询其发布分租房信息
  public List<Home> findHomeMsg2(String name) throws SQLException;

  //根据 房屋id 删除房屋信息
  public void deleteHome(int id) throws SQLException;
  
  
}
