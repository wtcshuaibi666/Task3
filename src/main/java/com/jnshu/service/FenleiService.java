package com.jnshu.service;

import com.jnshu.entity.Fenlei;

public interface FenleiService {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Fenlei record);

    boolean insertSelective(Fenlei record);

    Fenlei selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(Fenlei record);

    boolean updateByPrimaryKey(Fenlei record);
}
