package com.jnshu.mapper;

import com.jnshu.entity.User;

public interface UserMapper {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(User record);

    boolean insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(User record);

    boolean updateByPrimaryKey(User record);
}