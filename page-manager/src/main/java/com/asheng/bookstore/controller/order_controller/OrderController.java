package com.asheng.bookstore.controller.order_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/orderList")
    public ModelAndView toOrderList(){
        ModelAndView modelAndView = new ModelAndView("order/order-list-page");
        return modelAndView;
    }

    @RequestMapping("/orderCommon")
    public ModelAndView toOrderCommon(String opt,Integer orderId){
        ModelAndView modelAndView = new ModelAndView("order/order-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }

}
