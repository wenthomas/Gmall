package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SpuColor;
import java.util.List;

public interface SpuColorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpuColor record);

    SpuColor selectByPrimaryKey(Long id);

    List<SpuColor> selectAll();

    int updateByPrimaryKey(SpuColor record);
}