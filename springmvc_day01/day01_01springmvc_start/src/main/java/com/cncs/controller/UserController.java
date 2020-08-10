package com.cncs.controller;

import com.cncs.domain.MyUser;
import com.cncs.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public void insertList(MyUser myUser){
        System.out.println("user:"+myUser);
    }
}
