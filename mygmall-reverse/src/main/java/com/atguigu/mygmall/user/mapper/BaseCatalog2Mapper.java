package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.BaseCatalog2;
import java.util.List;

public interface BaseCatalog2Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseCatalog2 record);

    BaseCatalog2 selectByPrimaryKey(Long id);

    List<BaseCatalog2> selectAll();

    int updateByPrimaryKey(BaseCatalog2 record);
}