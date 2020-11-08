package com.gongyuan.service;

import com.gongyuan.model.User;

/**
 * @author wushangyi
 * @date 2020/11/8 10:55
 */
public interface UserService {
    int insertUser(User user);

    void updateUser(String trueName,String password);

    void updateUserPsw(String trueName,String tel);
}
