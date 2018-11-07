package com.jnshu.serviceImpl;

import com.jnshu.entity.First;
import com.jnshu.mapper.FirstMapper;
import com.jnshu.service.FirstMapperService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FirstServiceImpl implements FirstMapperService{
    @Autowired
    private FirstMapper firstMapper;

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return firstMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<First> findAll() {
        return findAll();
    }


    @Override
    public boolean insertSelective(First record) {
        return firstMapper.insertSelective(record);
    }

    @Override
    public First selectByPrimaryKey(Integer id) {
        return firstMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(First record) {
        return firstMapper.updateByPrimaryKeySelective(record);
    }


}
