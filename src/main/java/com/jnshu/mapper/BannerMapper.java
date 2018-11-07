package com.jnshu.mapper;

import com.jnshu.entity.Banner;


import java.util.List;

public interface BannerMapper {
//    根据id删除
    boolean deleteByPrimaryKey(Integer id);

    List<Banner> findAll();

    boolean insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(Banner record);

    boolean updateStatus(int id);
}