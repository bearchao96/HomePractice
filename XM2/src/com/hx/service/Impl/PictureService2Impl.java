package com.hx.service.Impl;

import java.sql.SQLException;
import java.util.List;

import com.hx.dao.HomeDao;
import com.hx.dao.PictureDao2;
import com.hx.dao.Impl.HomeDaoImpl;
import com.hx.dao.Impl.PictureDao2Impl;
import com.hx.entity.Home;
import com.hx.entity.Picture;
import com.hx.service.HomeService;
import com.hx.service.PictureService2;
/**
 * 图片的业务层接口实现类
 * @author bear
 *
 */

public class PictureService2Impl implements PictureService2 {

	/**
	 * 查询所有图片信息
	 */
	@Override
	public List<Picture> findAllPicture() {
		//创建图片持久层接口
		PictureDao2 pictureDao2 = new PictureDao2Impl();
		//调用方法查询
	try {	
		//创建房屋业务层层对象
		HomeDao homeDao = new HomeDaoImpl();
		List<Picture> findAllPicture = pictureDao2.findAllPicture();
	    for (Picture picture : findAllPicture) {
			Home home = homeDao.findByID(picture.getHome_id());
			picture.setHome(home);
		}		 
		return findAllPicture;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
