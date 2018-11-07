package com.jnshu.serviceImpl;

import com.jnshu.entity.ListManagement;
import com.jnshu.mapper.ListManagementMapper;
import com.jnshu.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListServiceImpl implements ListService {
    @Autowired
    private ListManagementMapper listManagementMapper;

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return listManagementMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(ListManagement record) {
        return listManagementMapper.insert(record);
    }

    @Override
    public boolean insertSelective(ListManagement record) {
        return listManagementMapper.insertSelective(record);
    }

    @Override
    public ListManagement selectByPrimaryKey(Integer id) {
        return listManagementMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(ListManagement record) {
        return listManagementMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public boolean updateByPrimaryKey(ListManagement record) {
        return listManagementMapper.updateByPrimaryKey(record);
    }
}
