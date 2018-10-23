package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SpuImage;
import java.util.List;

public interface SpuImageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpuImage record);

    SpuImage selectByPrimaryKey(Long id);

    List<SpuImage> selectAll();

    int updateByPrimaryKey(SpuImage record);
}