package com.hx.dao;

import java.sql.SQLException;
import java.util.List;

import com.hx.entity.YyHome;

/**
 * 用户预约房屋订单持久层接口
 * @author bear
 *
 */
public interface YyHomeDao {

	//用户预约订单的查询
	public List<YyHome> findAllyyhome() throws SQLException;

}
