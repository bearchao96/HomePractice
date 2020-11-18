package com.hx.service;

import java.util.List;

import com.hx.entity.Host;

/**
 * 房东业务层的接口
 * @author bear
 *
 */
public interface HostService {

	//查询所有房东信息
	public List<Host> findAllHost();

	//完善房东信息
	public void updateHost(Host host, int id);

}
