package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.BaseTrademark;
import java.util.List;

public interface BaseTrademarkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseTrademark record);

    BaseTrademark selectByPrimaryKey(Long id);

    List<BaseTrademark> selectAll();

    int updateByPrimaryKey(BaseTrademark record);
}