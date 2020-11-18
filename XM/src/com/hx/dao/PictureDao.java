package com.hx.dao;

import java.sql.SQLException;
import java.util.List;

import com.hx.entity.Picture;

/**
 * 图片持久层接口
 */
public interface PictureDao {

    //根据房屋id 查找对应图片
   public  Picture findPicture(int id) throws SQLException;

   //查找所有图片的方法
    public List<Picture> findAllPicture() throws SQLException;
}
