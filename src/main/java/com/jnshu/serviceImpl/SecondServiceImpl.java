package com.jnshu.serviceImpl;

import com.jnshu.entity.Second;
import com.jnshu.mapper.SecondMapper;
import com.jnshu.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondServiceImpl implements SecondService {
    @Autowired
    private SecondMapper secondMapper;

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return secondMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(Second record) {
        return secondMapper.insert(record);
    }


    @Override
    public boolean insertSelective(Second record) {
        return secondMapper.insertSelective(record);
    }

    @Override
    public Second selectByPrimaryKey(Integer id) {
        return secondMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Second record) {
        return secondMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public boolean updateByPrimaryKey(Second record) {
        return secondMapper.updateByPrimaryKey(record);
    }


}
