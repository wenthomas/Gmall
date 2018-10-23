package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.PaymentInfo;
import java.util.List;

public interface PaymentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentInfo record);

    PaymentInfo selectByPrimaryKey(Integer id);

    List<PaymentInfo> selectAll();

    int updateByPrimaryKey(PaymentInfo record);
}