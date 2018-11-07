package com.jnshu.mapper;

import com.jnshu.entity.Management;


import java.util.List;

public interface ManagementMapper {
    boolean deleteByPrimaryKey(Integer id);

   List<Management> findAll();

    boolean insertSelective(Management record);

    Management selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(Management record);

}