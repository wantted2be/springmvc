package com.company.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

//    @RequestMapping(value = "/")
//    public String index(){
//        return "index";
//    }

    @RequestMapping(value = "/test_view")
    public String testView(){
        return "test_view";
    }

//    @RequestMapping(value = "/test_restful")
//    public String test_restful(){
//        return "test_restful";
//    }
}
