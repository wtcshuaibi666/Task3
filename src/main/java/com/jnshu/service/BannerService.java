package com.jnshu.service;

import com.jnshu.entity.Banner;


import java.util.List;

public interface BannerService {
    boolean deleteByPrimaryKey(Integer id);

    List<Banner> findAll();

    boolean insertSelective(Banner record);

    Banner selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(Banner record);

    boolean updateStatus(int id);
}
