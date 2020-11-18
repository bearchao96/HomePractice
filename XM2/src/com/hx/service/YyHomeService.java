package com.hx.service;

import java.util.List;

import com.hx.entity.YyHome;

/**
 *预约订单的业务层接口
 * @author bear
 *
 */
public interface YyHomeService {

	//查找所有订单信息
	public List<YyHome> findAllyyhome();
	
}
