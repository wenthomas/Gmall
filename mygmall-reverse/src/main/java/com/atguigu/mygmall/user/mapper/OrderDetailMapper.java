package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.OrderDetail;
import java.util.List;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderDetail record);

    OrderDetail selectByPrimaryKey(Long id);

    List<OrderDetail> selectAll();

    int updateByPrimaryKey(OrderDetail record);
}