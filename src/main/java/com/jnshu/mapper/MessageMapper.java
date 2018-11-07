package com.jnshu.mapper;

import com.jnshu.entity.Message;

public interface MessageMapper {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Message record);

    boolean insertSelective(Message record);

    Message selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(Message record);

    boolean updateByPrimaryKey(Message record);
}