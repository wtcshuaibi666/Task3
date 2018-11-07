package com.jnshu.controller;

import com.jnshu.entity.First;
import com.jnshu.service.FirstMapperService;
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
public class FirstController {
    private static final Logger logger = LogManager.getLogger(FirstController.class);
    @Autowired
    FirstMapperService firstMapperService;
//    添加first

    @RequestMapping(value = "/first", method = RequestMethod.POST)
    public ModelAndView addFirst(First first, ModelAndView modelAndView) {
        logger.info(first);
        if (firstMapperService.insertSelective(first)) {
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "添加成功");
        } else {
            modelAndView.addObject("code", 404);
            modelAndView.addObject("msg", "添加失败");

        }

        modelAndView.setViewName("json");
        return modelAndView;
    }

    //    删除first
    @RequestMapping(value = "/first/{id}", method = RequestMethod.DELETE)
    public ModelAndView deleteFirst(@PathVariable int id, ModelAndView modelAndView) {
        logger.info(id);
        if (firstMapperService.deleteByPrimaryKey(id)) {
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "删除成功");
        } else {
            modelAndView.addObject("code", 404);
            modelAndView.addObject("msg", "删除失败");

        }
        modelAndView.setViewName("json");
        return modelAndView;

    }
//查询first
@RequestMapping(value = "first/{id}",method = RequestMethod.GET)
    public ModelAndView getFirst(@PathVariable int id,ModelAndView modelAndView){
        logger.info(id);
        First first = firstMapperService.selectByPrimaryKey(id);
        if(first!=null){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","查询成功");
            modelAndView.addObject("first",first);

        }else {
            modelAndView.addObject("code", 404);
            modelAndView.addObject("msg", "查询失败");
        }
        modelAndView.setViewName("first1");
        return modelAndView;
}

    @RequestMapping(value = "/first", method = RequestMethod.PUT)
    public ModelAndView updateFirst(ModelAndView modelAndView, First first) {
        if (firstMapperService.updateByPrimaryKeySelective(first)) {
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "更新成功");
        } else {
            modelAndView.addObject("code", 404);
            modelAndView.addObject("msg", "更新失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }

    @RequestMapping(value = "/first/list" ,method = RequestMethod.GET)
    public ModelAndView findAll(ModelAndView modelAndView,First first){
        List<First> firstList=firstMapperService.findAll();
        if (firstList!=null){
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "查询成功");
            modelAndView.addObject("firstList",firstList);
        } else {
            modelAndView.addObject("code", 404);
            modelAndView.addObject("msg", "更新失败");
        }
        modelAndView.setViewName("first2");
        return modelAndView;
    }
}