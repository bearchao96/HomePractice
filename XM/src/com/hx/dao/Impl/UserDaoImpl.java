package com.hx.dao.Impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.hx.dao.UserDao;
import com.hx.entity.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * 用户持久层接口实现类
 */
public class UserDaoImpl implements UserDao {
	//创建数据库连接
    public static  ComboPooledDataSource dataSource = new ComboPooledDataSource();
    //获取数据库操作对象
    public static QueryRunner queryRunner = new QueryRunner(dataSource);

    /**
     * 用户注册的方法
     * @param user
     */
    @Override
    public void UserRegist(User user) throws SQLException {
        //获取当前系统时间
        long timeMillis = System.currentTimeMillis();
        //操作数据库
        queryRunner.update("insert into t_user values(null,?,?,?,?)",timeMillis,user.getU_name(),user.getU_password(),user.getU_phone());
    }

    /**
     * 根据账号查询用户
     * @param u_usernum
     */
    @Override
    public User isLogin(long u_usernum) throws SQLException {
        //操作数据库
        return queryRunner.query("select * from t_user where u_num = ?",new BeanHandler<User>(User.class),u_usernum);
    }

    /**
     * 登录的方法
     * @param u_usernum
     * @param u_password
     * @return
     */
    @Override
    public User Login(long u_usernum, String u_password) throws SQLException {
        //操作数据库查询
         return queryRunner.query("select * from t_user where u_num = ? and u_password = ?", new BeanHandler<User>(User.class),u_usernum,u_password);

    }

    /**
     *  根据用户手机号返回账号个刚注册的用户
     * @param phone
     * @return
     */
    @Override
    public User findByNum(long phone) throws SQLException {
        //操作查询
        return queryRunner.query("select * from t_user where u_phone = ?",new BeanHandler<User>(User.class),phone);
    }
}
