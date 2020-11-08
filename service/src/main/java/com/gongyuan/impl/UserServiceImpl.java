package com.gongyuan.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gongyuan.dao.UserMapper;
import com.gongyuan.model.User;
import com.gongyuan.service.UserService;

import java.util.Date;

/**
 * @author wushangyi
 * @date 2020/11/8 10:58
 */
@Service
public class UserServiceImpl implements UserService {
//    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUserByname(String name) {
        User user=userMapper.queryUserByname(name);
        return user;
    }

    @Override
    public int insertUser(User user) {
        //校验用户名是否重复
        User newUser=queryUserByname(user.getName());
        if (newUser != null) {
            return 0;
        }
        newUser.setCreateDate(new Date());
        newUser.setUpdateeDate(new Date());
        userMapper.insertUser(newUser);
        return 1;
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
