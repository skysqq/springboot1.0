package com.learn.filter2;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*@Order(1)
@WebFilter(filterName = "myfilter",urlPatterns = {"/aa/*","/bb/*"},description = "自定义过滤器")*/
public class MyCustomFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("before");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("通过2");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
