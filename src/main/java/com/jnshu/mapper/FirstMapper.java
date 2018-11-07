package com.jnshu.mapper;

import com.jnshu.entity.First;


import java.util.List;

public interface FirstMapper {
    boolean deleteByPrimaryKey(Integer id);

    List<First> findAll();

    boolean insertSelective(First record);

    First selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(First record);


}