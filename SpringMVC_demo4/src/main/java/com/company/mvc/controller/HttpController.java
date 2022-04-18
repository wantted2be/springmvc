package com.company.mvc.controller;

import com.company.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HttpController {

    @RequestMapping(value = "/testRequestBody",method = RequestMethod.POST)
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println(requestBody);
        return "success";
    }

    @RequestMapping(value = "/testRequestEntity",method = RequestMethod.POST)
    public String testRequestEntity(RequestEntity<String> requestEntity){
        System.out.println("requestHeader:"+requestEntity.getHeaders());
        System.out.println("requestBody:"+requestEntity.getBody());
        return "success";
    }

    @RequestMapping(value = "/testResponse")
    public void testResponse(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.getWriter().print("hello,response");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody  //设置了这个返回值就变成了响应体数据
    public String testResponseBody(){
        return "success";
    }

    @RequestMapping(value = "/testResponseBodyUser")
    @ResponseBody
    public User testResponseUser(){
        User user = new User(1001,"admin","123456",23,"男");
        return user;
    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public String testAjax(String username, String password){
        System.out.println("username:"+username+",password:"+password);
        return "hello,ajax";
    }
}
