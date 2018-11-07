package com.jnshu.controller;

import com.jnshu.entity.First;
import com.jnshu.service.LianService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LianController {
    private static final Logger logger = LogManager.getLogger(FirstController.class);
    @Autowired
    LianService lianService;

    @RequestMapping(value = "/lian/{id}", method = RequestMethod.GET)
    public ModelAndView getLian(@PathVariable int id, ModelAndView modelAndView) {
        logger.info(id);
        First first = lianService.findFirstList(id);
        if (first != null) {
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "查询成功");
            modelAndView.addObject("first", first);

        }
        modelAndView.setViewName("json");
        return modelAndView;
    }
}