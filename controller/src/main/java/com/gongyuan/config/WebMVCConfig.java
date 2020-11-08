package com.gongyuan.config;

import com.gongyuan.argumentresolver.UserArgumentResolver;
import com.gongyuan.filter.MyFilter;
import com.gongyuan.interceptor.LoginInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/**
 * @author Tww
 * @date 2020/11/89:36 下午
 */
@Configuration
@Slf4j
public class WebMVCConfig extends WebMvcConfigurationSupport {


    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        LoginInterceptor loginInterceptor = new LoginInterceptor();
        registry.addInterceptor(loginInterceptor);
        log.info("登陆拦截器注册成功======");
    }

    /**
     * 添加参数处理器
     * @param argumentResolvers
     */
    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        UserArgumentResolver userArgumentResolver = new UserArgumentResolver();
        argumentResolvers.add(userArgumentResolver);
        log.info("用户参数处理器添加成功=======");

    }

    /**
     * 添加过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean setLogServiceFilter(){
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>();
        MyFilter myFilter = new MyFilter();
        registrationBean.setFilter(myFilter);
        registrationBean.setName("myFilter");
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }

}
