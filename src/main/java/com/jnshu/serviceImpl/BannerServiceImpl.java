package com.jnshu.serviceImpl;

import com.jnshu.entity.Banner;
import com.jnshu.mapper.BannerMapper;
import com.jnshu.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper bannerMapper;
    @Override
    public boolean deleteByPrimaryKey(Integer id){
        return bannerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Banner> findAll() {
        return bannerMapper.findAll();
    }


    @Override
    public boolean insertSelective(Banner record) {
        return bannerMapper.insertSelective(record);
    }

    @Override
    public Banner selectByPrimaryKey(Integer id) {
        return bannerMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Banner record) {
        return bannerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public boolean updateStatus(int id){
        return bannerMapper.updateStatus(id);
    }
}
