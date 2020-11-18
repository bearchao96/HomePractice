package com.hx.seriver;

import java.util.List;

import com.hx.entity.Picture;

/**
 * 房屋图片业务层接口
 */
public interface PictureService {
	//通过房屋id 查询对应图片
    public Picture findPicture(int id);

    //查找所有图片信息
    public List<Picture> findAllPicture();
}
