package com.cncs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 账户的控制器
 */
@Controller
@RequestMapping(value = "/account")
public class AccountController {
    /**
     * 保存账户
     * @return
     */
    @RequestMapping(path = "/saveAccount",params = {"username=lisi"})
    public String saveAccount(){
        System.out.println("saveAccount 执行了。。。");
        System.out.println("方法中代码修改了，可以热部署。");
        return "success";
    }
}
