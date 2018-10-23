package com.atguigu.mygmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.mygmall.bean.UserAddress;
import com.atguigu.mygmall.bean.UserInfo;
import com.atguigu.mygmall.service.UserService;
import com.atguigu.mygmall.user.mapper.UserAddressMapper;
import com.atguigu.mygmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;



import java.util.List;

/**
 * @author Verno
 * @create 2018-10-22 18:53
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(UserInfo record) {
        return 0;
    }

    @Override
    public UserInfo selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public List<UserInfo> selectAll() {
        List<UserInfo> userInfos = userInfoMapper.selectAll();

        return userInfos;
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return 0;
    }

    @Override
    public List<UserAddress> selectToAll() {
        List<UserAddress> userAddress = userAddressMapper.selectAll();
        return userAddress;
    }
}
