package com.asheng.bookstore.controller.user_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserAdminController {

    @RequestMapping("/adminList")
    public ModelAndView toAdminList(){
        ModelAndView modelAndView = new ModelAndView("user/admin-list-page");
        return modelAndView;
    }

    @RequestMapping("/adminCommon")
    public ModelAndView toAdminCommon(String opt,Integer adminId){
        ModelAndView modelAndView = new ModelAndView("user/admin-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }

}
