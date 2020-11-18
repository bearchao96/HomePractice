package com.hx.dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hx.dao.YyHomeDao;
import com.hx.entity.YyHome;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * 用户预约房屋订单持久层接口实现类
 * @author bear
 *
 */
public class YyHomeDaoImpl implements YyHomeDao {

	//创建数据库连接
    public static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    //获取数据库操作对象
    public static QueryRunner queryRunner = new QueryRunner(dataSource);
	/**
	 * 用户预约房屋订单查询
	 * @throws SQLException 
	 */
	@Override
	public List<YyHome> findAllyyhome() throws SQLException {
		//操作数据库查询
		return queryRunner.query("select * from yyhome", new  BeanListHandler<YyHome>(YyHome.class));
		
	}

}
