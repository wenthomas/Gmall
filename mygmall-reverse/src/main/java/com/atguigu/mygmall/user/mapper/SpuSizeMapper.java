package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SpuSize;
import java.util.List;

public interface SpuSizeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpuSize record);

    SpuSize selectByPrimaryKey(Long id);

    List<SpuSize> selectAll();

    int updateByPrimaryKey(SpuSize record);
}