package com.jnshu.serviceImpl;

import com.jnshu.entity.Management;
import com.jnshu.mapper.ManagementMapper;
import com.jnshu.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagementServiceImpl implements ManageService {
    @Autowired
    private ManagementMapper managementMapper;

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return managementMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Management> findAll() {
        return managementMapper.findAll();
    }


    @Override
    public boolean insertSelective(Management record) {
        return managementMapper.insertSelective(record);
    }

    @Override
    public Management selectByPrimaryKey(Integer id) {
        return managementMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Management record) {
        return managementMapper.updateByPrimaryKeySelective(record);
    }


}
