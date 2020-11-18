package com.hx.dao.Impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.hx.dao.HostDao;
import com.hx.entity.Host;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * 房东持久层接口实现类
 */
public class HostDaoImpl implements HostDao {
	 /**
     * 根据房子的id 查找房东信息
     * @param id
     */
    @Override
    public Host findHostMsg(int id) throws SQLException {
        //创建数据库连接池对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //获取数据库操作对象
        QueryRunner queryRunner = new QueryRunner(dataSource);
        //操作数据库
       return  queryRunner.query("select * from fhost where  home_id = ? ",new BeanHandler<Host>(Host.class),id);
    }
}
