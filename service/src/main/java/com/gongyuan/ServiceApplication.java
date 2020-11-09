package com.gongyuan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Tww
 * @date 2020/11/812:59 下午
 */
@SpringBootApplication
@EnableCaching
@EnableScheduling
@EnableAsync
@Slf4j
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class,args);
        log.info("Service启动成功");
    }
}
