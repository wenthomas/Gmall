package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.WareOrderTaskDetail;
import java.util.List;

public interface WareOrderTaskDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WareOrderTaskDetail record);

    WareOrderTaskDetail selectByPrimaryKey(Long id);

    List<WareOrderTaskDetail> selectAll();

    int updateByPrimaryKey(WareOrderTaskDetail record);
}