package com.cncs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/springmvc")
@SessionAttributes(names = {"uname", "age"}, types = {String.class, Integer.class})
public class SessionAttributeController {


    @RequestMapping("/testPut")
    public String testPut(Model model) {
        model.addAttribute("uname", "zhangsan");
        model.addAttribute("age", 18);
        return "success";
    }

    @RequestMapping("/testGet")
    public String testGet(ModelMap modelMap) {
        System.out.println("uname:" + modelMap.get("uname") + ",age:" + modelMap.get("age"));
        return "success";
    }

    @RequestMapping("/testClean")
    public String testClean(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "success";
    }

}
