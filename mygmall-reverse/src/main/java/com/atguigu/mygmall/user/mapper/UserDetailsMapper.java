package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.UserDetails;
import java.util.List;

public interface UserDetailsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDetails record);

    UserDetails selectByPrimaryKey(Long id);

    List<UserDetails> selectAll();

    int updateByPrimaryKey(UserDetails record);
}