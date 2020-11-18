package com.hx.dao;

import java.sql.SQLException;

import com.hx.entity.Host;

/**
 * 房东持久层接口
 */
public interface HostDao {
	/**
     * 根据房子id查询房顶信息的方法
     * @param id
     */
     public Host findHostMsg(int id) throws SQLException;
}
