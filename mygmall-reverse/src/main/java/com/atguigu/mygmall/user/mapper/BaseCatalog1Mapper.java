package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.BaseCatalog1;
import java.util.List;

public interface BaseCatalog1Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseCatalog1 record);

    BaseCatalog1 selectByPrimaryKey(Long id);

    List<BaseCatalog1> selectAll();

    int updateByPrimaryKey(BaseCatalog1 record);
}