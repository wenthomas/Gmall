package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.BaseCatalog3;
import java.util.List;

public interface BaseCatalog3Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseCatalog3 record);

    BaseCatalog3 selectByPrimaryKey(Long id);

    List<BaseCatalog3> selectAll();

    int updateByPrimaryKey(BaseCatalog3 record);
}