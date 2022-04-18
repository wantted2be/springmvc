package com.company.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping(value = "/")
    public String index(){
        System.out.println("");
        System.out.println("hot fixed");
        return "index";
    }
}
