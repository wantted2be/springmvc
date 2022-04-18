package com.company.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value = "/hello")  //经常用于不同模块的请求控制器，表示不同的模块
public class RequestMappingController {
    //请求控制器所映射的请求路径是 /hello/success
    @RequestMapping(
            value = {"/success","/test"},
            method = {RequestMethod.POST,RequestMethod.GET}
    )
    public String success(){
        return "success";  //
    }

    @GetMapping(
            value = {"/testgetmapping"}
    )
    public String toGetMapping(){
        return "success";
    }

    @RequestMapping(value = "/testPut",method = RequestMethod.PUT)
    public String testPut(){
        return "success";
    }

    @RequestMapping(
            value = "/testParamsAndHeaders",
            params = {"username","password='123'"},
            headers = {"Host=localhost:8080"}
    )
    public String testParamsAndHeaders(){
        return "success";
    }

    @RequestMapping(value = "/**/testAnt")
    public String testAnt(){
        return "success";
    }
    @RequestMapping(value = "/testPath/{id}/{username}")
    public String testPath(@PathVariable(value = "id")Integer id,@PathVariable(value = "username")String username){
        System.out.println("id: "+ id);
        System.out.println("username: " + username);
        return "success";
    }
}
