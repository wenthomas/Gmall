package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SpuInfo;
import java.util.List;

public interface SpuInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpuInfo record);

    SpuInfo selectByPrimaryKey(Long id);

    List<SpuInfo> selectAll();

    int updateByPrimaryKey(SpuInfo record);
}