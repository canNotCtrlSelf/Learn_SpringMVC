package com.cncs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 配置控制器
 */
@Controller
@RequestMapping(path = "userssss")
public class HelloController {

    /**
     * 接受请求
     * @return 跳转的页面
     */
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello SpringMVC.");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping....");
        return "success";
    }
}
