package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.WareInfo;
import java.util.List;

public interface WareInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WareInfo record);

    WareInfo selectByPrimaryKey(Long id);

    List<WareInfo> selectAll();

    int updateByPrimaryKey(WareInfo record);
}