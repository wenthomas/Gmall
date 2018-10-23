package com.atguigu.mygmall.service;

import com.atguigu.mygmall.bean.UserAddress;
import com.atguigu.mygmall.bean.UserInfo;

import java.util.List;

/**
 * @author Verno
 * @create 2018-10-22 18:48
 */

public interface UserService {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);

    List<UserAddress> selectToAll();
}
