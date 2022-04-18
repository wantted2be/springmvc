package com.company.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    //“/”-->/WEB-INF/templates/index.html
    // @RequestMapping注解：处理请求和控制器方法之间的映射关系
    // @RequestMapping注解的value属性可以通过请求地址匹配请求，/表示的当前工程的上下文路径
    // localhost:8080/springMVC/
    @RequestMapping(value = "/")
    public String index(){
        //返回视图名称
        return "index";
    }

    @RequestMapping(value = "/target")
    public String toTarget(){
        //返回视图名称
        return "target";
    }
}
