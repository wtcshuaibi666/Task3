package com.jnshu.service;

import com.jnshu.entity.Second;




public interface SecondService {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Second record);

    boolean insertSelective(Second record);

    Second selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(Second record);

    boolean updateByPrimaryKey(Second record);
}
