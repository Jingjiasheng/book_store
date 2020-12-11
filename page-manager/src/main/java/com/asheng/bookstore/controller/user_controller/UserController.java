package com.asheng.bookstore.controller.user_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/userList")
    public ModelAndView toUserList(){
        ModelAndView modelAndView = new ModelAndView("user/user-list-page");
        return modelAndView;
    }

    @RequestMapping("/userCommon")
    public ModelAndView toUserCommon(String opt,Integer userId){
        ModelAndView modelAndView = new ModelAndView("user/user-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }

}
