package com.gongyuan.service;

import com.gongyuan.model.User;

/**
 * @author wushangyi
 * @date 2020/11/8 10:55
 */
public interface UserService {
    User queryUserByname(String name);

    int insertUser(User user);

    int updateUser(User user);

    int updateUserPsw(String name,String tel);
}
