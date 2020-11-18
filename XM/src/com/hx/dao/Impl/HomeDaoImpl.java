package com.hx.dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hx.dao.HomeDao;
import com.hx.entity.Home;
import com.hx.entity.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * 房屋持久层接口实现类
 */
public class HomeDaoImpl implements HomeDao {

	 //创建数据库连接
    public static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    //获取数据库操作对象
    public static QueryRunner queryRunner = new QueryRunner(dataSource);
    /**
     * 查询所有房屋信息的接口
     */
    @Override
    public List<Home> findHomeMsg() throws SQLException {
        //操纵数据库

        return queryRunner.query("select * from home",new BeanListHandler<Home>(Home.class));

    }

    /**
     * 根据id 查询房屋信息
     * @param id
     * @return
     */
    @Override
    public Home findIdMsg(int id) throws SQLException {
        //操作数据库
        return queryRunner.query("select * from home where h_id = ?",new BeanHandler<Home>(Home.class),id);
    }

    /**
     *添加用户预约房屋信息
     * @param user
     * @param id
     * @return
     */
    @Override
    public int addyyHome(User user, int id) throws SQLException {
        //根据id拿到房屋
        Home home = this.findIdMsg(id);
        //添加房屋
        //操作数据库
        return queryRunner.update("insert into yyhome values(null,?,?,?,?,?,?)",home.getH_type(),home.getH_direction(),home.getH_address1(),home.getH_address2(),home.getH_address3(),user.getU_id());

    }

}
