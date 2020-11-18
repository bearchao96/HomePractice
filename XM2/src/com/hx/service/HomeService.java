package com.hx.service;

import java.util.List;

import com.hx.entity.Home;

/**
 * 房屋业务层接口
 * @author bear
 *
 */
public interface HomeService {

  //添加房屋信息的方法	
  public void addAllHome(Home home);
 
  //查找所有房屋信息
  public List<Home> findAllHome();

  //修改房屋信息
  public void updateHome(Home home, int id);

  //根据房屋id查询房屋
  public Home findById(int id);

  //根据房东姓名查询其发布分租房信息
  public List<Home> findHomeMsg2(String name);

  //根据id删除房屋信息
  public void deleteHome(int id);
  
}
