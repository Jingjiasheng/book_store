package com.asheng.bookstore.controller.book_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/bookList")
    public ModelAndView toBookList(){
        ModelAndView modelAndView = new ModelAndView("book/book-list-page");
        return modelAndView;
    }

    @RequestMapping("/bookCommon")
    public ModelAndView toBookCommon(String opt,Integer bookId){
        ModelAndView modelAndView = new ModelAndView("book/book-common-page");
        modelAndView.addObject("opt",opt);
        return modelAndView;
    }

}
