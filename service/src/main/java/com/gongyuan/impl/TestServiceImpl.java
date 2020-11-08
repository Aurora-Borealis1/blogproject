package com.gongyuan.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gongyuan.service.TestService;

/**
 * @author wushangyi
 * @date 2020/11/8 14:55
 */
@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
   String run(){
       return "helloWorld";
   }

    @Override
    public String sayHello() {
        return "helloWorld";
    }
}
