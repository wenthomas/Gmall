package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.BaseCatalog1Tm;
import java.util.List;

public interface BaseCatalog1TmMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseCatalog1Tm record);

    BaseCatalog1Tm selectByPrimaryKey(Long id);

    List<BaseCatalog1Tm> selectAll();

    int updateByPrimaryKey(BaseCatalog1Tm record);
}