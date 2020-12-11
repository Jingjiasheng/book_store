package com.asheng.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseController {

    @RequestMapping({"/index"," "})
    public String toIndex(){

        return "base/index";
    }
}
