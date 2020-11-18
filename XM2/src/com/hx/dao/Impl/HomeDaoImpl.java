package com.hx.dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hx.dao.HomeDao;
import com.hx.entity.Home;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 房屋持久层接口实现类
 * @author bear
 *
 */
public class HomeDaoImpl implements HomeDao {

	 //创建数据库连接
    public static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    //获取数据库操作对象
    public static QueryRunner queryRunner = new QueryRunner(dataSource);
	/**
	 * 添加房屋信息的方法
	 * @throws SQLException 
	 */
	@Override
	public void addAllHome(Home home) throws SQLException {
		//操作数据库添加
		queryRunner.update("insert into home values(null,?,?,?,?,?,?,?,?,?,?,?)"
				,home.getH_way(),home.getH_ms(),
				home.getH_type(),home.getH_direction(),
				home.getH_address1(),home.getH_address2(),
				home.getH_address3(),home.getH_money(),home.getH_buyway(),home.getH_msg(),home.getH_hostmsg());
		//通过地址查询
		Home home2 = queryRunner.query("select * from home where h_address3 = ?", new BeanHandler<Home>(Home.class),home.getH_address3());
		//向房东中添加相关数据
		queryRunner.update("insert into fhost values(null,?,null,null,?,null)",home.getH_hostmsg(),home2.getH_id());
		//向图片添加数据
		queryRunner.update("insert into picture values(null,null,null,null,?)",home2.getH_id());
		
	}
	
	/**
	 * 查询所有房屋信息
	 * @throws SQLException 
	 */
	@Override
	public List<Home> findAllHome() throws SQLException {
		return queryRunner.query("select * from home", new BeanListHandler<Home>(Home.class));
		
	}

	/**
	 * //根据房屋id 查找对应 
	 * @throws SQLException 
	 */
	@Override
	public Home findByID(int home_id) throws SQLException {
	
		return queryRunner.query("select * from home where h_id = ?", new BeanHandler<Home>(Home.class),home_id);
	}

	
	/**
	 * 修改房屋信息
	 * @throws SQLException 
	 */
	@Override
	public void updateHome(Home home, int id) throws SQLException {
		
		queryRunner.update("update home set h_way = ? ,h_ms = ? ,h_type = ? ,h_direction = ? ,h_money = ? ,h_buyway = ? ,h_msg = ? where h_id = ?"
				,home.getH_way(),home.getH_ms(),
				home.getH_type(),home.getH_direction(),
				home.getH_money(),home.getH_buyway(),
				home.getH_msg(),id);
	}

	/**
	 * 根据房东姓名查询其发布分租房信息
	 * @throws SQLException 
	 */
	@Override
	public List<Home> findHomeMsg2(String name) throws SQLException {
		
		return queryRunner.query("select * from home where h_hostmsg = ?", new BeanListHandler<Home>(Home.class),name);
		
	}

	/**
	 * 根据 房屋id删除房屋信息 同时删除该房屋的图片信息和
	 * @throws SQLException 
	 */
	@Override
	public void deleteHome(int id) throws SQLException {
		
		 queryRunner.update("delete from picture where home_id = ?",id);
		 queryRunner.update("delete from fhost where home_id = ?",id);
		 queryRunner.update("delete from home where h_id = ?",id);
	}
	   
	

}
