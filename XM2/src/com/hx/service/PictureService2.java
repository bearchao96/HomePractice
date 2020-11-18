package com.hx.service;

import java.util.List;

import com.hx.entity.Picture;
/**
 * 图片的业务层接口
 * @author bear
 *
 */
public interface PictureService2 {

	//查询所有图片
	public List<Picture> findAllPicture();
	
}
