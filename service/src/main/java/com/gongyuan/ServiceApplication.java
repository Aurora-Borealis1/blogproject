package com.gongyuan;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Tww
 * @date 2020/11/812:59 下午
 */
@SpringBootApplication
@EnableDubbo
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class,args);
    }
}
