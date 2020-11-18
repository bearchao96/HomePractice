package com.hx.service.Impl;

import java.sql.SQLException;
import java.util.List;

import com.hx.dao.UserDao;
import com.hx.dao.YyHomeDao;
import com.hx.dao.Impl.UserDaoImpl;
import com.hx.dao.Impl.YyHomeDaoImpl;
import com.hx.entity.User;
import com.hx.entity.YyHome;
import com.hx.service.YyHomeService;

/**
 * 预约订单的业务层接口实现类
 * @author bear
 *
 */
public class YyHomeServiceImpl implements YyHomeService {

	//查找所有房屋预约定单
	@Override
	public List<YyHome> findAllyyhome() {
		try {	
		//创建房屋订单持久层对象
		YyHomeDao yyHomeDao = new YyHomeDaoImpl();
		//创建用户持久层对象
		UserDao userdao = new UserDaoImpl();
		//调用方法
		
		List<YyHome> findAllyyhome = yyHomeDao.findAllyyhome();
		//遍历
		for (YyHome yyHome : findAllyyhome) {
			User user = userdao.findByIdUser(yyHome.getUser_id());
			yyHome.setUser(user);
		}
			
			return findAllyyhome;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}
