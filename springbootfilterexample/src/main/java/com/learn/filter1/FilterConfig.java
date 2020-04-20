package com.learn.filter1;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    //使用代码注册bean
    @Bean
    public FilterRegistrationBean customFilter(){
        FilterRegistrationBean<MyCustomFilter1> filterBean = new FilterRegistrationBean<MyCustomFilter1>();

        filterBean.setFilter(new MyCustomFilter1());
        filterBean.setName("FilterController");
        filterBean.addUrlPatterns("/cc/*","/bb/*");
        return filterBean;

    }
}
