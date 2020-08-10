package com.cncs.controller;

import com.cncs.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("testException executing...");
        try {
            //模拟异常
            int a = 33 / 0;
        } catch (Exception e) {
            //打印异常
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SysException("内部错误！ 请与管理员联系！");
        }

        return "success";
    }
}
