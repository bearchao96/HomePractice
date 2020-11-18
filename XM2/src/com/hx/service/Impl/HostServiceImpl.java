package com.hx.service.Impl;

import java.sql.SQLException;
import java.util.List;

import com.hx.dao.HomeDao;
import com.hx.dao.HostDao;
import com.hx.dao.Impl.HomeDaoImpl;
import com.hx.dao.Impl.HostDaoImpl;
import com.hx.entity.Home;
import com.hx.entity.Host;
import com.hx.service.HostService;
/**
 * 房东业务层接口实现类
 * @author bear
 *
 */
public class HostServiceImpl implements HostService {

	/**
	 * 查询所有房东信息
	 */
	@Override
	public List<Host> findAllHost() {
		//创建房东的持久层对象
		HostDao hostDao = new HostDaoImpl();
		try {
			//创建房子持久层对象
			HomeDao homedao = new HomeDaoImpl();
		   //调用方法
			List<Host> findAllHost = hostDao.findAllHost();
			//遍历集合
			for (Host host : findAllHost) {
				Home home = homedao.findByID(host.getHome_id());
				host.setHome(home);
			}
			return findAllHost;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	
	/**
	 * 完善房东信息
	 */
	@Override
	public void updateHost(Host host,int id) {
		//创建房东的持久层对象
	    HostDao hostDao = new HostDaoImpl();	
	    //调用方法
	    try {
			hostDao.updateHost(host,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
