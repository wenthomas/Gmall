package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SpuSaleAttr;
import java.util.List;

public interface SpuSaleAttrMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpuSaleAttr record);

    SpuSaleAttr selectByPrimaryKey(Long id);

    List<SpuSaleAttr> selectAll();

    int updateByPrimaryKey(SpuSaleAttr record);
}