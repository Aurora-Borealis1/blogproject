package com.gongyuan.controller;


import com.gongyuan.common.Result;
import com.gongyuan.common.ServiceException;
import com.gongyuan.enumration.ExceptionMessageEnum;
import com.gongyuan.model.dto.User;
import com.gongyuan.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wushangyi
 * @date 2020/11/8 10:45
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    UserService userService;


    /**
     * 用户注册
     *
     * @param user 用户
     * @return 返回信息
     */
    @RequestMapping("/userRegister")
    //事务注解
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public Result userRegister(@Validated @RequestBody User user)  {
        int result = userService.insertUser(user);
        if(result==0)throw new ServiceException(ExceptionMessageEnum.USER_EXCEPTION);
        return Result.getSuccessfulResult("用户注册成功");
    }

    /**
     * 用户登陆
     *
     * @param name,password 用户名，密码
     * @return 返回信息
     */
    @RequestMapping("/userlogin")
    public Result userlogin(@RequestParam("name") String name, @RequestParam("password") String password) {
        User user = userService.queryUserByname(name);
        return Result.getSuccessfulResult("登陆成功");
    }

    /**
     * 修改用户信息
     *
     * @param user 用户
     * @return 返回信息
     */
    @RequestMapping("/updateUser")
    public Result updateUser(@Validated @RequestBody User user) {
        userService.updateUser(user);
        return Result.getSuccessfulResult("修改成功");
    }

    /**
     * 修改用户密码
     *
     * @param name,tel 用户名，联系方式
     * @return 返回信息
     */
    @RequestMapping("/updateUserPsw")
    public Result updateUserPsw(@RequestParam("name") String name, @RequestParam("tel") String tel) {
        userService.updateUserPsw(name, tel);
        return Result.getSuccessfulResult("密码修改成功，请重新登陆！");
    }
}
