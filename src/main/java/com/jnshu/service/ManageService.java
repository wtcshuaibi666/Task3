package com.jnshu.service;

import com.jnshu.entity.Management;


import java.util.List;

public interface ManageService {
    boolean deleteByPrimaryKey(Integer id);

    List<Management> findAll();

    boolean insertSelective(Management record);

    Management selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(Management record);

}
