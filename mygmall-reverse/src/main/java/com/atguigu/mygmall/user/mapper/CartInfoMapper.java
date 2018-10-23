package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.CartInfo;
import java.util.List;

public interface CartInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CartInfo record);

    CartInfo selectByPrimaryKey(Long id);

    List<CartInfo> selectAll();

    int updateByPrimaryKey(CartInfo record);
}