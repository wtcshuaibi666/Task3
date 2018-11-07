package com.jnshu.serviceImpl;

import com.jnshu.entity.Message;
import com.jnshu.mapper.MessageMapper;
import com.jnshu.service.ManageService;
import com.jnshu.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;


    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(Message record) {
        return messageMapper.insert(record);
    }

    @Override
    public boolean insertSelective(Message record) {
        return messageMapper.insertSelective(record);
    }

    @Override
    public Message selectByPrimaryKey(Integer id) {
        return messageMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Message record) {
        return messageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public boolean updateByPrimaryKey(Message record) {
        return messageMapper.updateByPrimaryKey(record);
    }
}
