package com.hx.dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hx.dao.PictureDao;
import com.hx.entity.Picture;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * 图片持久层接口实现类
 */
public class PictureDaoImpl implements PictureDao {
	//创建数据库连接
    public static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    //获取数据库操作对象
    public static QueryRunner queryRunner = new QueryRunner(dataSource);

    /**
     * //根据房屋id 查找对应图片
     * @param id
     * @return
     */
    @Override
    public Picture findPicture(int id) throws SQLException {
        //操作数据库查询
        return queryRunner.query("select * from  picture where home_id = ?",new BeanHandler<Picture>(Picture.class),id);

    }

    /**
     * 查找所有图片的方法
     * @return
     */
    @Override
    public List<Picture> findAllPicture() throws SQLException {
         return queryRunner.query("select * from picture ",new BeanListHandler<Picture>(Picture.class));

    }
}
