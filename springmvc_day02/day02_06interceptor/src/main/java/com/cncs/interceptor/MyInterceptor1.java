package com.cncs.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor1 implements HandlerInterceptor {

    /**
     * 预处理
     *
     * @param request
     * @param response
     * @param handler
     * @return true 放行
     * false 拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("111拦截器方法执行了。。。。前");
//        request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
//        System.out.println(request.getContextPath());
//        response.sendRedirect(request.getContextPath()+"/WEB-INF/pages/error.jsp");
        return true;
    }


    /**
     * 方法后处理
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("111拦截器方法执行了。。。。后");
//        request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request, response);

    }

    /**
     * 最后执行
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("111拦截器方法执行了。。。。最后");
    }
}
