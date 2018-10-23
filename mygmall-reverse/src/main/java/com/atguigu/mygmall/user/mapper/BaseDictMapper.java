package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.BaseDict;
import java.util.List;

public interface BaseDictMapper {
    int deleteByPrimaryKey(String id);

    int insert(BaseDict record);

    BaseDict selectByPrimaryKey(String id);

    List<BaseDict> selectAll();

    int updateByPrimaryKey(BaseDict record);
}