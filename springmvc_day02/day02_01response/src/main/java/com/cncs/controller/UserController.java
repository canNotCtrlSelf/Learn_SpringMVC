package com.cncs.controller;

import com.cncs.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回值是字符串
     * @return
     */
    @RequestMapping(path = "/testString")
    public String testString(){
        System.out.println("testString executed...");
        return "success";
    }

    /**
     * 返回值是void
     * @return
     */
    @RequestMapping(path = "/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid executed...");
        //1、使用请求转发
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    /**
     * 返回值是void
     * @return
     */
    @RequestMapping(path = "/testVoid2")
    public void testVoid2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid2 executed...");
        //1、使用重定向
        response.sendRedirect(request.getContextPath()+"/index.jsp");
    }

    /**
     * 返回值是void
     * @return
     */
    @RequestMapping(path = "/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView executed...");
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setUsername("lisisi");
        user.setAge(19);
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }

    /**
     * 返回值是json字符串
     * @return
     */
    @RequestMapping(path = "/testJson")
    public @ResponseBody User
    testJson(@RequestBody()String body) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("testJson executed...");
        System.out.println(body);
        User user = new User();
        user.setUsername("yui");
        user.setAge(18);
        return user;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model,String name,String address){
        System.out.println("name:"+name+",address:"+address);
        model.addAttribute("name","lisisi");
        model.addAttribute("address","广西南宁");
        return "hello_success";
    }

    @RequestMapping("/testModelAndView2")
    public ModelAndView testModelAndView(String name,String address){
        ModelAndView model =new ModelAndView();
        System.out.println("name:"+name+",address:"+address);
        model.addObject("name","王五");
        model.addObject("address","黑龙江双鸭山");
        model.setViewName("hello_success");
        return model;
    }
}
