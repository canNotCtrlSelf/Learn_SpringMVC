package com.cncs.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        ex.printStackTrace();
        SysException sysException = null;
        //如果抛出的是系统自定义异常，则强转
        if (ex instanceof SysException) {
            //强转
            sysException = (SysException) ex;
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", sysException.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
