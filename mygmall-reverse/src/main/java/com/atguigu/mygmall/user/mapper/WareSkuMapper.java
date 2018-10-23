package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.WareSku;
import java.util.List;

public interface WareSkuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WareSku record);

    WareSku selectByPrimaryKey(Long id);

    List<WareSku> selectAll();

    int updateByPrimaryKey(WareSku record);
}