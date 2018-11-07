package com.jnshu.service;

import com.jnshu.entity.ListManagement;

public interface ListService {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(ListManagement record);

    boolean insertSelective(ListManagement record);

    ListManagement selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(ListManagement record);

    boolean updateByPrimaryKey(ListManagement record);
}
