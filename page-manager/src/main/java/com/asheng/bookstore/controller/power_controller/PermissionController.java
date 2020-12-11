package com.asheng.bookstore.controller.power_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/permission")
public class PermissionController {

    @RequestMapping("/permissionList")
    public ModelAndView toPermissionList(){
        ModelAndView modelAndView = new ModelAndView("power/permission-list-page");
        return modelAndView;
    }

    @RequestMapping("/permissionCommon")
    public ModelAndView toPermissionCommon(String opt,Integer permissionId){
        ModelAndView modelAndView = new ModelAndView("power/permission-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }

}
