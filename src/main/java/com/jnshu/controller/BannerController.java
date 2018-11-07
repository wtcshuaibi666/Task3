package com.jnshu.controller;

import com.jnshu.entity.Banner;
import com.jnshu.service.BannerService;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class BannerController {

    private static final Logger logger = LogManager.getLogger(BannerController.class);
    @Autowired
    BannerService bannerService;

    //    添加banner
    @RequestMapping(value = "/banner", method = RequestMethod.POST)
    public ModelAndView addBanner(Banner banner, ModelAndView modelAndView) {
        logger.info(banner);
        if (bannerService.insertSelective(banner)) {
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "添加成功");
        } else {
            modelAndView.addObject("code", 404);
            modelAndView.addObject("msg", "添加错误");

        }
        modelAndView.setViewName("json");
        return modelAndView;
    }
//删除banner
    @RequestMapping(value = "/banner/{id}", method = RequestMethod.DELETE)
    public ModelAndView deleteBanner(@PathVariable int id, ModelAndView modelAndView) {
        if (bannerService.deleteByPrimaryKey(id)) {
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "删除成功");
        } else {
            modelAndView.addObject("code", 404);
            modelAndView.addObject("msg", "操作失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }
    //更改banner
    @RequestMapping(value = "/banner",method = RequestMethod.PUT)
    public ModelAndView updateBanner(Banner banner,ModelAndView modelAndView){
        if (bannerService.updateByPrimaryKeySelective(banner)){
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "更改成功");
        }else {
            modelAndView.addObject("code", 404);
            modelAndView.addObject("msg", "操作失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }
    @RequestMapping(value = "/banner/{id}",method = RequestMethod.GET)
    public ModelAndView getBanner(@PathVariable int id,ModelAndView modelAndView){
        Banner banner=bannerService.selectByPrimaryKey(id);
        if (banner!=null){
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "查询成功");
            modelAndView.addObject("banner",banner);

        }else {
            modelAndView.addObject("code", 404);
            modelAndView.addObject("msg", "操作失败");
        }
        modelAndView.setViewName("banner1");
        return modelAndView;
    }

    //条件查询接口未调试成功
    @RequestMapping(value = "/banner/list",method = RequestMethod.GET)
    public ModelAndView getBannerList(ModelAndView modelAndView,Boolean status,String create_by) {
        List<Banner> bannerList = bannerService.findAll();
            if (bannerList != null) {
                modelAndView.addObject("code", 200);
                modelAndView.addObject("msg", "查询成功");
                modelAndView.addObject("bannerList", bannerList);

            } else {
                modelAndView.addObject("code", 404);
                modelAndView.addObject("msg", "操作失败");
            }
            modelAndView.setViewName("banner2");
            return modelAndView;
        }

        @RequestMapping(value = "/banner/status/{id}", method = RequestMethod.PUT)
        public ModelAndView updateStatus (ModelAndView modelAndView,@PathVariable int id){
            bannerService.updateStatus(id);
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "修改成功");
            modelAndView.setViewName("json");
            return modelAndView;
        }
    }


