package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.UserAddress;
import java.util.List;

public interface UserAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserAddress record);

    UserAddress selectByPrimaryKey(Long id);

    List<UserAddress> selectAll();

    int updateByPrimaryKey(UserAddress record);
}