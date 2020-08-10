package com.cncs.controller;

import com.cncs.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
public class AnnoController {

    /**
     * RequestParam注解的使用
     *
     * @return
     */
    @RequestMapping(value = "/testRequestParam")
    public String useRequestParam(@RequestParam(name = "name") String username, @RequestParam(name = "age", required = false) Integer age) {
        System.out.println("testRequestParam执行了。。。");
        System.out.println("用户名:" + username + "\t年龄：" + age);
        return "success";
    }

    /**
     * RequestBody注解的使用
     *
     * @return
     */
    @RequestMapping(value = "/testRequestBody")
    public String testRequestBody(@RequestBody(required = false) String body) {
        System.out.println("testRequestBody。。。");
        System.out.println("body:" + body);
        return "success";
    }

    /**
     * PathVaribale注解的使用
     *
     * @return
     */
    @RequestMapping(value = "/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(name = "id") Integer nowId) {
        System.out.println("testPathVariable。。。");
        System.out.println("id:" + nowId);
        return "success";
    }

    /**
     * RequestHeader注解的使用
     *
     * @return
     */
    @RequestMapping(value = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(name = "Connection") String header) {
        System.out.println("testRequestHeader。。。");
        System.out.println(header);
        return "success";
    }

    /**
     * CookieValue 注解的使用
     *
     * @return
     */
    @RequestMapping(value = "/testCookieValue")
    public String testCookieValue(@CookieValue(name = "JSESSIONID") String cookieValue) {
        System.out.println("testCookieValue。。。");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModelAttribute 注解的使用
     *
     * @return
     */
    @RequestMapping(value = "/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("user") User user) {
        System.out.println("testModelAttribute。。。");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void showUser(String uname, Map<String,User> map) {
        //模拟从数据库查询数据
        User user = new User();
        user.setUname(uname);
        user.setAge(19);
        user.setBirthday("new Date()");
        map.put("user",user);
    }

   /* @ModelAttribute
    public User showUser(String uname) {
        //模拟从数据库查询数据
        User user = new User();
        user.setUname(uname);
        user.setAge(19);
        user.setBirthday(new Date());
        return user;
    }
*/
}
