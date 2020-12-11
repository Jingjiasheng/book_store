package com.asheng.bookstore.controller.book_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bookCategory")
public class BookCategoryController {

    @RequestMapping("/bookCategoryList")
    public ModelAndView tobookCategoryList(){
        ModelAndView modelAndView = new ModelAndView("book/book-category-list-page");
        return modelAndView;
    }

    @RequestMapping("/bookCategoryCommon")
    public ModelAndView tobookCategoryCommon(String opt,Integer bookCategoryId){
        ModelAndView modelAndView = new ModelAndView("book/book-category-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }
    
}
