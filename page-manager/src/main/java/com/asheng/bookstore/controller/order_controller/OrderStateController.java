package com.asheng.bookstore.controller.order_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/orderState")
public class OrderStateController {

    @RequestMapping("/orderStateList")
    public ModelAndView toOrderList(){
        ModelAndView modelAndView = new ModelAndView("order/order-state-list-page");
        return modelAndView;
    }

    @RequestMapping("/orderStateCommon")
    public ModelAndView toOrderCommon(String opt,Integer orderId){
        ModelAndView modelAndView = new ModelAndView("order/order-state-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }

}
