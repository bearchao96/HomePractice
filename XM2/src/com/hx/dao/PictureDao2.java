package com.hx.dao;

import java.sql.SQLException;
import java.util.List;

import com.hx.entity.Picture;

/**
 * 图片持久层接口
 * @author bear
 *
 */
public interface PictureDao2 {

  //查询所有图片信息
  public List<Picture> findAllPicture() throws SQLException;

  //根据房屋id 查询图片
  public Picture findByID(int id) throws SQLException;
 
  //去数据库中修改数据
  public void updata(Picture picture, int id) throws SQLException;
  
		
}
