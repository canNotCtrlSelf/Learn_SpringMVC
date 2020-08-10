package com.cncs.controller;

import com.cncs.domain.Account;
import com.cncs.domain.User;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 请求参数的绑定
 */
@Controller
@RequestMapping("/params")
public class RequestParamsController {

    /**
     * 基本类型
     *
     * @param username
     * @return
     */
    @RequestMapping("/basicParam")
    public String BasicParam(String username) {
        System.out.println("用户名：" + username);
        return "success";
    }

    /**
     * 引用类型
     *
     * @param account
     * @return
     */
    @RequestMapping("/accountParam")
    public String AccountParam(Account account) {
        System.out.println(account);
        return "success";
    }

    /**
     * 引用类型
     *
     * @param account
     * @return
     */
    @RequestMapping("/accountParam2")
    public String AccountParam2(Account account) {
        System.out.println(account);
        return "success";
    }

    /**
     * 引用类型
     *
     * @param account
     * @return
     */
    @RequestMapping("/accountParam3")
    public String AccountParam3(Account account) {
        System.out.println(account);
        return "success";
    }

    /**
     * 引用类型
     *
     * @param
     * @return
     */
    @RequestMapping("/customConventer")
    public String customConventer(User user) {
        System.out.println(user);
        return "success";
    }

    /**
     * 引用类型
     *
     * @param
     * @return
     */
    @RequestMapping("/servletAPI")
    public String servletAPI(HttpSession httpSession, HttpServletRequest httpRequest, HttpServletResponse httpResponse) {
        System.out.println(httpResponse);
        System.out.println(httpSession);
        System.out.println(httpRequest);
        System.out.println(httpSession.getServletContext());
        return "success";
    }
}
