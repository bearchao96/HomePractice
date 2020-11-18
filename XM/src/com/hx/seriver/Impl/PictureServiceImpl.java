package com.hx.seriver.Impl;

import java.sql.SQLException;
import java.util.List;

import com.hx.dao.PictureDao;
import com.hx.dao.Impl.PictureDaoImpl;
import com.hx.entity.Picture;
import com.hx.seriver.PictureService;
/**
 * 房屋业务层接口实现类
 */
public class PictureServiceImpl implements PictureService {
	/**
     * 通过房屋 id 查询对应图片
     * @param id
     * @return
     */
    @Override
    public Picture findPicture(int id) {
        //创建图片 持久层
        PictureDao pictureDao = new PictureDaoImpl();
        //调用方法查找
        try {
            Picture picture = pictureDao.findPicture(id);
            return picture;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查找所有图片的方法
     * @return
     */
    @Override
    public List<Picture> findAllPicture() {
        //创建图片 持久层
        PictureDao pictureDao = new PictureDaoImpl();
        //调用方法查找
        try {
           return  pictureDao.findAllPicture();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
