package com.gongyuan;

import com.gongyuan.dao.UserMapper;
import com.gongyuan.model.dto.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Tww
 * @date 2020/11/86:35 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceTest {
//    @Autowired
//    RedisUtil redisUtil;

    @Autowired
    UserMapper userMapper;

    @Test
    public void testRedis() {
//        redisUtil.set("firstName", "wu");
    }

    @Test
    public void testMybatis() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}
