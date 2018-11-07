package com.jnshu.service;

import com.jnshu.entity.User;

public interface UserService {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(User record);

    boolean insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(User record);

    boolean updateByPrimaryKey(User record);
}
