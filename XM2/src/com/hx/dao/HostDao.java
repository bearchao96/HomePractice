package com.hx.dao;

import java.sql.SQLException;
import java.util.List;

import com.hx.entity.Host;

/**
 * 房东持久层接口
 * @author bear
 *
 */
public interface HostDao {

	//查找房东信息
	public List<Host> findAllHost() throws SQLException;

	//完善房东信息
	public void updateHost(Host host, int id) throws SQLException;

}
