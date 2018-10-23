package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SkuSaleAttrValue;
import java.util.List;

public interface SkuSaleAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SkuSaleAttrValue record);

    SkuSaleAttrValue selectByPrimaryKey(Long id);

    List<SkuSaleAttrValue> selectAll();

    int updateByPrimaryKey(SkuSaleAttrValue record);
}