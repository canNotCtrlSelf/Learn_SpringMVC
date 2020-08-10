package com.cncs.test;

import com.cncs.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void run1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = ac.getBean(AccountService.class, "accountService");
        accountService.findAll();
    }
}
