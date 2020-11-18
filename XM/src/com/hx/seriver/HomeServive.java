package com.hx.seriver;

import java.util.List;

import com.hx.entity.User;
import com.hx.entity.Home;

public interface HomeServive {

	///查询所有房屋信息的方法
    public List<Home> findHomeMsg();

    //根据id 查询房屋信息
    public Home findIdMsg(int id);

    //添加用户预约房屋信息
    public boolean addyyHome(User user, int id);

}
