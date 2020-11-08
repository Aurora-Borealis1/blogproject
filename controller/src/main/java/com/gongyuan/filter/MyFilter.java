package com.gongyuan.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Tww
 * @date 2020/11/89:47 下午
 */

//@WebFilter(urlPatterns = "/*",filterName = "myFilter")
@Slf4j
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("初始化myFilter=========");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ServletRequest requestWrapper = new ServletRequestWrapper((HttpServletRequest)servletRequest);
        filterChain.doFilter(requestWrapper,servletResponse);

    }

    @Override
    public void destroy() {
        log.info("销毁myFilter=========");
    }
}
