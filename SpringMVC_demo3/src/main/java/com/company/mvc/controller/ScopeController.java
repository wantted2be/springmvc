package com.company.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ScopeController {
    //使用ServletAPI向request域对象共享数据。。。转发访问
    @RequestMapping(value = "/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("hello","hello,ServletAPI");
        return "success";
    }

    //使用ModelAndView
    @RequestMapping(value = "/testModelAndView")
    public ModelAndView testModelAndView(){
        /**
         * ModelAndView有Model和View的功能
         * Model主要用于向请求域共享数据
         * View主要用于设置视图，实现页面跳转
         */
        ModelAndView mav = new ModelAndView();
        //处理模型数据，向请求域对象request共享数据
        mav.addObject("testRequestScope","hello,ModelAndView Scope");
        //设置视图名称
        mav.setViewName("success");
        return mav;
    }

    //使用Model
    @RequestMapping(value = "/testModel")
    public String testModel(Model model){
        //处理模型数据，向请求域对象request共享数据
        model.addAttribute("testRequestModelScope","hello,Model Scope");
        return "success";
    }

    //使用Map
    @RequestMapping(value = "/testMap")
    public String testMap(Map<String,Object> map){
        //处理模型数据，向请求域对象request共享数据
        map.put("testRequestMapScope","hello,Map Scope");
        return "success";
    }

    //使用ModelMap
    @RequestMapping(value = "/testModelMap")
    public String testModelMap(ModelMap modelMap){
        //处理模型数据，向请求域对象request共享数据
        modelMap.addAttribute("testRequestModelMapScope","hello,ModelMap Scope");
        return "success";
    }

    //向session域共享数据
    @RequestMapping(value = "/testSession")
    public String testSession(HttpSession httpSession){
        httpSession.setAttribute("testSession","hello session");
        return "success";
    }

    //通过Httpsession向application域共享对象
    @RequestMapping(value = "/testApplication")
    public String testApplication(HttpSession httpSession){
        ServletContext application = httpSession.getServletContext();
        application.setAttribute("testApplication","hello,Application");
        return "success";
    }
}
