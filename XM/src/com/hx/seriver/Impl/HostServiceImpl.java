package com.hx.seriver.Impl;

import java.sql.SQLException;

import com.hx.dao.HostDao;
import com.hx.dao.Impl.HostDaoImpl;
import com.hx.entity.Host;
import com.hx.seriver.HostService;

public class HostServiceImpl implements HostService {

	 /**
     * 通过房子id 查询房东信息
     * @param id
     */
    @Override
    public Host findHostMsg(int id) {
        //创建房东持久层
        HostDao hostDao  = new HostDaoImpl();
        //调用持久层的方法
        try {
            return  hostDao.findHostMsg(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
