package com.atguigu.mygmall.user.mapper;

import com.atguigu.mygmall.user.bean.SpuPoster;
import java.util.List;

public interface SpuPosterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SpuPoster record);

    SpuPoster selectByPrimaryKey(Long id);

    List<SpuPoster> selectAll();

    int updateByPrimaryKey(SpuPoster record);
}