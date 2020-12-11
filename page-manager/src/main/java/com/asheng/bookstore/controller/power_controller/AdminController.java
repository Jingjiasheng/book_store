package com.asheng.bookstore.controller.power_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/adminList")
    public ModelAndView toAdminList(){
        ModelAndView modelAndView = new ModelAndView("power/admin-list-page");
        return modelAndView;
    }

    @RequestMapping("/adminCommon")
    public ModelAndView toAdminCommon(String opt,Integer roleId){
        ModelAndView modelAndView = new ModelAndView("power/admin-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }

}
