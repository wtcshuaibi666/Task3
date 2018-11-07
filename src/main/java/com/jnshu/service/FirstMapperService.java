package com.jnshu.service;

import com.jnshu.entity.First;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface FirstMapperService {
    boolean deleteByPrimaryKey(Integer id);

    List<First> findAll();

    boolean insertSelective(First record);

    First selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(First record);

}
