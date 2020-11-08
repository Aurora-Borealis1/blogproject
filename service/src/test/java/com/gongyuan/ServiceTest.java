package com.gongyuan;

import com.gongyuan.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Tww
 * @date 2020/11/86:35 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceTest {
    @Autowired
    RedisUtil redisUtil;

    @Test
    public void testRedis(){
        redisUtil.set("firstName","wu");
    }
}
