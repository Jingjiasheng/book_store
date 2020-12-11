package com.asheng.bookstore.controller.city_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/city")
public class CityController {

    @RequestMapping("/cityList")
    public ModelAndView toCityList(){
        ModelAndView modelAndView = new ModelAndView("city/city-list-page");
        return modelAndView;
    }

    @RequestMapping("/cityCommon")
    public ModelAndView toCityCommon(String opt,Integer cityId){
        ModelAndView modelAndView = new ModelAndView("city/city-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }

}
