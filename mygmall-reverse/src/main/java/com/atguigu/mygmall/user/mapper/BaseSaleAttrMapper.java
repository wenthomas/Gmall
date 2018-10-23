package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.BaseSaleAttr;
import java.util.List;

public interface BaseSaleAttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseSaleAttr record);

    BaseSaleAttr selectByPrimaryKey(Long id);

    List<BaseSaleAttr> selectAll();

    int updateByPrimaryKey(BaseSaleAttr record);
}