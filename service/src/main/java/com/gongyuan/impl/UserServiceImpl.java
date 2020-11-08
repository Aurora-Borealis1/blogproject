package com.gongyuan.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gongyuan.dao.UserMapper;
import com.gongyuan.model.User;
import com.gongyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wushangyi
 * @date 2020/11/8 10:58
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        //校验用户名是否重复
        return 0;
    }

    @Override
    public void updateUser(String name, String password) {

    }

    @Override
    public void updateUserPsw(String name, String tel) {

    }
}
