package com.jnshu.mapper;

import com.jnshu.entity.ListManagement;

public interface ListManagementMapper {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(ListManagement record);

    boolean insertSelective(ListManagement record);

    ListManagement selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(ListManagement record);

    boolean updateByPrimaryKey(ListManagement record);
}