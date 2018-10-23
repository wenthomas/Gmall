package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.BaseAttrValue;
import java.util.List;

public interface BaseAttrValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseAttrValue record);

    BaseAttrValue selectByPrimaryKey(Long id);

    List<BaseAttrValue> selectAll();

    int updateByPrimaryKey(BaseAttrValue record);
}