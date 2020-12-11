package com.asheng.bookstore.controller.book_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 胜&SS
 */
@Controller
@RequestMapping("/bookAbout")
public class BookAboutController {

    @RequestMapping("/bookAboutList")
    public ModelAndView toBookAboutList(){
        ModelAndView modelAndView = new ModelAndView("book/book-about-list-page");
        return modelAndView;
    }

    @RequestMapping("/bookAboutCommon")
    public ModelAndView toBookAboutCommon(String opt,Integer bookAboutId){
        ModelAndView modelAndView = new ModelAndView("book/book-about-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }
    
}
