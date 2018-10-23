package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SkuInfo;
import java.util.List;

public interface SkuInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SkuInfo record);

    SkuInfo selectByPrimaryKey(Long id);

    List<SkuInfo> selectAll();

    int updateByPrimaryKey(SkuInfo record);
}