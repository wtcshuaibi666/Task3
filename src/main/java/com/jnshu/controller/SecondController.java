package com.jnshu.controller;
import com.jnshu.entity.Second;
import com.jnshu.service.SecondService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SecondController {
    private static final Logger logger = LogManager.getLogger(SecondController.class);
    @Autowired
    SecondService secondService;

    //    添加second
    @RequestMapping(value = "/second", method = RequestMethod.POST)
    public ModelAndView addSecond(Second second, ModelAndView modelAndView) {
        logger.info(second);
        if (secondService.insertSelective(second)) {
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "添加成功");
        } else {
            modelAndView.addObject("code", 404);
            modelAndView.addObject("msg", "失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }
//    删除second
@RequestMapping(value = "/second/{id}",method = RequestMethod.DELETE)
    public ModelAndView deleteSecond(@PathVariable int id,ModelAndView modelAndView){
        logger.info(id);
        if (secondService.deleteByPrimaryKey(id)){
            modelAndView.addObject("code",200);
            modelAndView.addObject("msg","删除成功");
        }else{
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","失败");

        }
        modelAndView.setViewName("json");
        return modelAndView;
}
    @RequestMapping(value = "/second/{id}",method = RequestMethod.GET)
    public ModelAndView selectSecond(ModelAndView modelAndView,@PathVariable int id){
        Second second=secondService.selectByPrimaryKey(id);
        if(second!=null){
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "成功");
            modelAndView.addObject("second",second);
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","失败");
        }
        modelAndView.setViewName("second1");
        return modelAndView;
    }

    @RequestMapping(value = "/second",method = RequestMethod.PUT)
    public  ModelAndView updateSecond(ModelAndView modelAndView,Second second){
        if(secondService.updateByPrimaryKeySelective(second)){
            modelAndView.addObject("code", 200);
            modelAndView.addObject("msg", "成功");
        }else {
            modelAndView.addObject("code",404);
            modelAndView.addObject("msg","失败");
        }
        modelAndView.setViewName("json");
        return modelAndView;
    }
}
