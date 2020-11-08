package com.gongyuan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gongyuan.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wushangyi
 * @date 2020/11/8 14:57
 */
@RestController
public class TestController {
    @Reference(version = "1.0.0")
    TestService testService;

    @RequestMapping("/test")
    public String test(){
        return testService.sayHello();
    }
}
