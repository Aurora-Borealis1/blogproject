package com.gongyuan;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Tww
 * @date 2020/11/812:59 下午
 */
@EnableDubbo
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class,args);
    }
}
