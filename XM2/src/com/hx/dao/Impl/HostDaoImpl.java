package com.hx.dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hx.dao.HostDao;
import com.hx.entity.Host;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * 房东持久层接口实现类
 * @author bear
 *
 */
public class HostDaoImpl implements HostDao {

	
	 //创建数据库连接
    public static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    //获取数据库操作对象
    public static QueryRunner queryRunner = new QueryRunner(dataSource);
	/**
	 * 查找房东信息
	 * @throws SQLException 
	 */
	@Override
	public List<Host> findAllHost() throws SQLException {
		//操作数据库查询
		return queryRunner.query("select * from fhost", new BeanListHandler<Host>(Host.class));
		
		
	}
	
	
	/**
	 * 完善房东信息
	 * @throws SQLException 
	 */
	@Override
	public void updateHost(Host host,int id) throws SQLException {
		//操作数据库
		queryRunner.update("update fhost set f_jiyi=? ,f_company = ? ,f_phone = ? where home_id = ?",host.getF_jiyi(),host.getF_company(),host.getF_phone(),id);
		
	}
	
	
}
