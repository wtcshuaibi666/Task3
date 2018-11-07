package com.jnshu.controller;

import com.jnshu.entity.Management;
import com.jnshu.service.ManageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.apache.log4j.LogManager;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManagementController {
    private static final Logger logger= LogManager.getLogger(ManagementController.class);
    @Autowired
    ManageService manageService;

    @RequestMapping(value = "/management",method = RequestMethod.POST)
    public ModelAndView addManagement(Management management,ModelAndView modelAndView) {
        logger.info(management);
        if (manageService.insertSelective(management)) {
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "ok");
        } else {
            modelAndView.addObject("code", 404);
            modelAndView.addObject("msg", "no");


        }
        modelAndView.setViewName("json");
        return modelAndView;
    }
    @RequestMapping(value = "/management/{id}",method = RequestMethod.DELETE)
    public ModelAndView deleteManagement(ModelAndView modelAndView, @PathVariable int id){
        if(manageService.deleteByPrimaryKey(id)){
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }

    @RequestMapping(value = "/management/{id}",method = RequestMethod.GET)
    public ModelAndView selectManagement(ModelAndView modelAndView, @PathVariable int id){
        Management management=manageService.selectByPrimaryKey(id);
        if (management!=null){
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "成功");
            modelAndView.addObject("data",management);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","失败");
        }
        modelAndView.setViewName("banner1");
        return modelAndView;
    }

    @RequestMapping(value = "/management",method = RequestMethod.PUT)
    public ModelAndView updateManagement(ModelAndView modelAndView, Management management){
        if(manageService.updateByPrimaryKeySelective(management)){
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "成功");
        }else {
            modelAndView.addObject("code",400);
            modelAndView.addObject("msg","失败");
        }
        modelAndView.setViewName("banner1");
        return modelAndView;
    }


}
