package com.asheng.bookstore.controller.operation_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/operation")
public class OperationController {

    @RequestMapping("/operationList")
    public ModelAndView toOperationList(){
        ModelAndView modelAndView = new ModelAndView("operation_log/operation-list-page");
        return modelAndView;
    }

    @RequestMapping("/operationCommon")
    public ModelAndView toOperationCommon(String opt,Integer operationId){
        ModelAndView modelAndView = new ModelAndView("operation_log/operation-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }

}
