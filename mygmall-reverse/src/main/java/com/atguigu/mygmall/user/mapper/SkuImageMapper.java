package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SkuImage;
import java.util.List;

public interface SkuImageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SkuImage record);

    SkuImage selectByPrimaryKey(Long id);

    List<SkuImage> selectAll();

    int updateByPrimaryKey(SkuImage record);
}