package com.hx.service.Impl;

import java.sql.SQLException;
import java.util.List;

import com.hx.dao.HomeDao;
import com.hx.dao.Impl.HomeDaoImpl;
import com.hx.entity.Home;
import com.hx.service.HomeService;

/**
 * 房屋业务层接口控制器
 * @author bear
 *
 */
public class HomeServiceImpl implements HomeService {

	/**
	 * 添加房屋信息的方法
	 */
	@Override
	public void addAllHome(Home home) {
		//创建房屋持久层接口
		HomeDao homeDao = new HomeDaoImpl();
		//调用方法
		try {
			homeDao.addAllHome(home);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 查找所有房屋信息
	 */
	@Override
	public List<Home> findAllHome() {
		//创建房屋持久层接口
		HomeDao homeDao = new HomeDaoImpl();
		//调用方法
		try {
			List<Home> findAllHome = homeDao.findAllHome();
			return findAllHome;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 修改房屋信息
	 */
	@Override
	public void updateHome(Home home,int id) {
		//创建房屋持久层接口
		HomeDao homeDao = new HomeDaoImpl();
		//调用方法
		try {
			homeDao.updateHome(home,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 根据房屋id 查询房屋信息
	 */
	@Override
	public Home findById(int id) {
		//创建房屋持久层接口
		HomeDao homeDao = new HomeDaoImpl();
		//调用方法
		try {
			Home home = homeDao.findByID(id);
			return home ;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 根据房东姓名查询其发布分租房信息
	 */
	@Override
	public List<Home> findHomeMsg2(String name) {
		//创建房屋持久层接口
		HomeDao homeDao = new HomeDaoImpl();
		//调用方法
		try {
			return homeDao.findHomeMsg2(name);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	/**
	 * 根据 id 删除房屋信息
	 */
	@Override
	public void deleteHome(int id) {
		//创建房屋持久层接口
	    HomeDao homeDao = new HomeDaoImpl();
	    //调用方法
	    try {
			homeDao.deleteHome(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
