package com.jnshu.serviceImpl;

import com.jnshu.entity.Fenlei;
import com.jnshu.mapper.FenleiMapper;
import com.jnshu.service.FenleiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FenleiServiceImpl implements FenleiService{
    @Autowired
    private FenleiMapper fenleiMapper;

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return fenleiMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(Fenlei record) {
        return fenleiMapper.insert(record);
    }

    @Override
    public boolean insertSelective(Fenlei record) {
        return fenleiMapper.insertSelective(record);
    }

    @Override
    public Fenlei selectByPrimaryKey(Integer id) {
        return fenleiMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Fenlei record) {
        return fenleiMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public boolean updateByPrimaryKey(Fenlei record) {
        return fenleiMapper.updateByPrimaryKey(record);
    }
}
