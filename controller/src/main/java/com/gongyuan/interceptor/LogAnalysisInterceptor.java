package com.gongyuan.interceptor;

import com.alibaba.dubbo.common.utils.IOUtils;
import com.alibaba.fastjson.JSON;
import com.gongyuan.anno.LogAnalysis;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/**
 * @author Tww
 * @date 2020/11/8 10:05 下午
 */
@Slf4j
public class LogAnalysisInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler instanceof HandlerMethod){
            // 将handler强转化为handlermethod
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            // 从方法处理器中获取要调用的方法
            Method method = handlerMethod.getMethod();
            // 获取方法上的LoginInterceptor注解
            if(method.isAnnotationPresent(LogAnalysis.class) || method.getDeclaringClass().isAnnotationPresent(LogAnalysis.class)){
                BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
                String requestUrl = request.getRequestURL().toString();
                String methodName = method.getName();
                String req = IOUtils.read(reader);
                log.info("请求地址：{},请求方法：{}请求报文：{}",requestUrl,methodName,req);
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if(handler instanceof HandlerMethod){
            // 将handler强转化为handlermethod
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            // 从方法处理器中获取要调用的方法
            Method method = handlerMethod.getMethod();
            // 获取方法上的LoginInterceptor注解
            if(method.isAnnotationPresent(LogAnalysis.class) || method.getDeclaringClass().isAnnotationPresent(LogAnalysis.class)){
                String requestUrl = request.getRequestURL().toString();
                String methodName = method.getName();
                String res = JSON.toJSONString(request.getAttribute("response"));
                log.info("请求地址：{},请求方法：{}返回报文：{}",requestUrl,methodName,res);
            }
        }



    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
