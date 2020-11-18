package com.hx.seriver;

import com.hx.entity.Host;

/**
 * 房东的业务层接口
 */
public interface HostService {

	/**
     * 通过房子id 查询房东信息
     * @param id
     */
    public Host findHostMsg(int id);
}
