package com.asheng.bookstore.controller.book_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bookPress")
public class BookPressController {

    @RequestMapping("/bookPressList")
    public ModelAndView toBookPressList(){
        ModelAndView modelAndView = new ModelAndView("book/book-press-list-page");
        return modelAndView;
    }

    @RequestMapping("/bookPressCommon")
    public ModelAndView toBookPressCommon(String opt,Integer bookPressId){
        ModelAndView modelAndView = new ModelAndView("book/book-press-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }
    
}
