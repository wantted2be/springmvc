package com.company.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    @RequestMapping(value = "/testInterceptor",method = RequestMethod.GET)
    public String testInterceptor(){
        return "success";
    }
}
