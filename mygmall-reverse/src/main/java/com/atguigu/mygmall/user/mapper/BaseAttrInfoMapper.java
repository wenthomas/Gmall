package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.BaseAttrInfo;
import java.util.List;

public interface BaseAttrInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseAttrInfo record);

    BaseAttrInfo selectByPrimaryKey(Long id);

    List<BaseAttrInfo> selectAll();

    int updateByPrimaryKey(BaseAttrInfo record);
}