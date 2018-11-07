package com.jnshu.serviceImpl;

import com.jnshu.entity.User;
import com.jnshu.mapper.UserMapper;
import com.jnshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public boolean insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public boolean updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
