package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.WareOrderTask;
import java.util.List;

public interface WareOrderTaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WareOrderTask record);

    WareOrderTask selectByPrimaryKey(Long id);

    List<WareOrderTask> selectAll();

    int updateByPrimaryKey(WareOrderTask record);
}