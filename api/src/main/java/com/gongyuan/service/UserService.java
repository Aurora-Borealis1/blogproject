package com.gongyuan.service;

import com.gongyuan.model.User;

/**
 * @author wushangyi
 * @date 2020/11/8 10:55
 */
public interface UserService {
    int insertUser(User user);

    void updateUser(String name,String password);

    void updateUserPsw(String name,String tel);
}
