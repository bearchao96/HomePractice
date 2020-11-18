package com.hx.dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hx.dao.PictureDao2;
import com.hx.entity.Picture;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * 图片持久层接口实现类
 * @author bear
 *
 */
public class PictureDao2Impl implements PictureDao2 {

	 //创建数据库连接
    public static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    //获取数据库操作对象
    public static QueryRunner queryRunner = new QueryRunner(dataSource);
    
    /**
     * 查询所有图片的方法 
     * @throws SQLException 
     */
	@Override
	public List<Picture> findAllPicture() throws SQLException {
		//操作数据库
		return queryRunner.query("select * from picture", new BeanListHandler<Picture>(Picture.class));
		
	}

	/**
	 * 根据房屋id查询图片
	 * @throws SQLException 
	 */
	@Override
	public Picture findByID(int id) throws SQLException {
		//操作数据库
		return queryRunner.query("select * from picture where home_id = ?", new BeanHandler<Picture>(Picture.class),id);
		
	}

	/**
	 * 将上传的图片储存到数据库对应位置
	 * @throws SQLException 
	 */
	@Override
	public void updata(Picture picture,int id) throws SQLException {
		//根据房屋id查询图片
		Picture picture1 = queryRunner.query("select * from picture where home_id = ?", new BeanHandler<Picture>(Picture.class),id);
		//判断
		if(picture1.getP_address1() == null) {
			//操作数据库
			queryRunner.update("update picture set p_address1 = ? where home_id = ?",picture.getP_address1(),id);
		}else if(picture1.getP_address2() == null) {
			//操作数据库
			queryRunner.update("update picture set p_address2 = ? where home_id = ?",picture.getP_address2(),id);
		}else if(picture1.getP_address3() == null) {
			//操作数据库
			queryRunner.update("update picture set p_address3 = ? where home_id = ?",picture.getP_address3(),id);
		}
		
		
	}
    
}
