package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SkuAttrValue;
import java.util.List;

public interface SkuAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SkuAttrValue record);

    SkuAttrValue selectByPrimaryKey(Long id);

    List<SkuAttrValue> selectAll();

    int updateByPrimaryKey(SkuAttrValue record);
}