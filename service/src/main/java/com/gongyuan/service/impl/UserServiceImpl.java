package com.gongyuan.service.impl;

import com.gongyuan.dao.UserMapper;
import com.gongyuan.model.dto.User;
import com.gongyuan.service.UserService;

/**
 * @author wushangyi
 * @date 2020/11/8 10:58
 */
//@Service
public class UserServiceImpl implements UserService {
//    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUserByname(String name) {
        return userMapper.selectById(name);
    }

    @Override
//    @Async(value = "threadPoolTaskExecutor")
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int updateUserPsw(String name, String tel) {
        return 0;
    }
}
