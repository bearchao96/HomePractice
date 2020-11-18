package com.hx.seriver.Impl;

import java.sql.SQLException;
import java.util.List;

import com.hx.entity.User;
import com.hx.seriver.HomeServive;
import com.hx.dao.HomeDao;
import com.hx.dao.Impl.HomeDaoImpl;
import com.hx.entity.Home;

public class HomeServiceImpl implements HomeServive {

	/**
     * 查询所有房屋信息的方法
     * @return
     */
    @Override
    public List<Home> findHomeMsg() {
        //创建房屋持久层接口
        HomeDao homeDao = new HomeDaoImpl();
        //调用方法
        try {
             return homeDao.findHomeMsg();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 根据id 查询房屋信息
     * @param id
     * @return
     */
    @Override
    public Home findIdMsg(int id) {
        //创建房屋持久层对象
        HomeDao homeDao = new HomeDaoImpl();
        //调用查询方法
        try {
            return homeDao.findIdMsg(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 添加用户预约房屋信息
     * @param user
     * @param id
     * @return
     */
    @Override
    public boolean addyyHome(User user, int id) {
        //创建房屋持久层对象
        HomeDao homeDao = new HomeDaoImpl();
        //调用方法
        try {
            int i = homeDao.addyyHome(user, id);
            if(i == 1){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
