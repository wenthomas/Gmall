package com.atguigu.mygmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.mygmall.bean.UserAddress;
import com.atguigu.mygmall.bean.UserInfo;
import com.atguigu.mygmall.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Verno
 * @create 2018-10-22 18:35
 */
@Controller
public class UserInfoHandler {

//    @Autowired
//    private UserInfoMapper userInfoMapper;
//
//    @Autowired
//    private UserAddressMapper userAddressMapper;

    @Reference
    private UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("queryAll")
    @ResponseBody
    public List<UserInfo> queryAll(){
        return userService.selectAll();
    }


    @RequestMapping("queryAddress")
    @ResponseBody
    public List<UserAddress> queryAddress(){
        return userService.selectToAll();
    }
}
