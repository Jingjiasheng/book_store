package com.asheng.bookstore.controller.power_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/role")
public class RoleController {

    @RequestMapping("/roleList")
    public ModelAndView toRoleList(){
        ModelAndView modelAndView = new ModelAndView("power/role-list-page");
        return modelAndView;
    }

    @RequestMapping("/roleCommon")
    public ModelAndView toRoleCommon(String opt,Integer adminId){
        ModelAndView modelAndView = new ModelAndView("power/role-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }

}
