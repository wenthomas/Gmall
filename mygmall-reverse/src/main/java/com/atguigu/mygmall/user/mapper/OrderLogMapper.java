package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.OrderLog;
import java.util.List;

public interface OrderLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderLog record);

    OrderLog selectByPrimaryKey(Long id);

    List<OrderLog> selectAll();

    int updateByPrimaryKey(OrderLog record);
}