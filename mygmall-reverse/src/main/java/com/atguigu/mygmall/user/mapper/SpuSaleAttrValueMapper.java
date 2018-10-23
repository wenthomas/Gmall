package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SpuSaleAttrValue;
import java.util.List;

public interface SpuSaleAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpuSaleAttrValue record);

    SpuSaleAttrValue selectByPrimaryKey(Long id);

    List<SpuSaleAttrValue> selectAll();

    int updateByPrimaryKey(SpuSaleAttrValue record);
}