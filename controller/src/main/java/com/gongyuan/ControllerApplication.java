package com.gongyuan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Tww
 * @date 2020/11/8 12:59 下午
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@Slf4j
public class ControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class,args);
        log.info("Controller启动成功");
    }
}
