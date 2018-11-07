package com.jnshu.serviceImpl;

import com.jnshu.entity.First;
import com.jnshu.mapper.LianBiao;
import com.jnshu.service.LianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LianServiceImpl implements LianService {
    @Autowired
    LianBiao lianBiao;

    @Override
    public First findFirstList(int id) {
        return lianBiao.findFirstList(id);
    }
}
