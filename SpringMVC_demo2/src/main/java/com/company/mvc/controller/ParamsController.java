package com.company.mvc.controller;

import com.company.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class ParamsController {
    @RequestMapping(value = "/testServletAPI")
    public String testServlet(HttpServletRequest request){
        //这个方法保证request参数名字和请求参数名字相同
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + "--password: "+ password);
        return "success";
    }

    @RequestMapping(value = "/testParams")
    public String testParams(
            @RequestParam(value = "user_name",required = false,defaultValue = "hehe") String username,
            String password,
            String[] hobby,
            @RequestHeader(value = "sayHaha",required = false,defaultValue = "haha") String host){
        //这个方法保证形参的名字和请求参数名字相同,
        // 如果多请求参数中出现了多个同名的请求参数可以在控制器方法中形参位置设置字符串类型或者是字符串数组
        System.out.println("username:" + username + "--password: "+ password +"--hobby:"+ Arrays.toString(hobby));
        System.out.println("host:" + host);
        return "success";
    }

    @RequestMapping(value = "/testBean")
    public String testBean(User user){
        System.out.println(user);
        return "success";
    }
}
