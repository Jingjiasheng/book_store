package com.asheng.bookstore.controller.book_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bookState")
public class BookStateController {

    @RequestMapping("/bookStateList")
    public ModelAndView toBookStateList(){
        ModelAndView modelAndView = new ModelAndView("book/book-state-list-page");
        return modelAndView;
    }

    @RequestMapping("/bookStateCommon")
    public ModelAndView toBookStateCommon(String opt,Integer bookStateId){
        ModelAndView modelAndView = new ModelAndView("book/book-state-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }
    
}
