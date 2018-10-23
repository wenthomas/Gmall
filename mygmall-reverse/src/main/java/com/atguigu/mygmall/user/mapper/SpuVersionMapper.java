package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SpuVersion;
import java.util.List;

public interface SpuVersionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpuVersion record);

    SpuVersion selectByPrimaryKey(Long id);

    List<SpuVersion> selectAll();

    int updateByPrimaryKey(SpuVersion record);
}