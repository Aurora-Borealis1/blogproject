package com.gongyuan.dao;

import com.gongyuan.model.dto.User;

/**
 * @author wushangyi
 * @date 2020/11/8 11:38
 */
//@Repository
public interface UserMapper {



    User queryUserByname(String name);

    int insertUser(User user);

    void updateUser(String name,String password);

    void updateUserPsw(String name,String tel);
}
