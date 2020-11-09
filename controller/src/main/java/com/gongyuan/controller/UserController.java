package com.gongyuan.controller;


import com.gongyuan.common.Result;
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
//@LogAnalysis
public class UserController {
    @Reference
    UserService userService;


    /**
     * 用户注册
     * @param user 用户
     * @return 返回信息
     */
    @RequestMapping("/userRegister")
//    @LogAnalysis
    //事务注解
    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRES_NEW)
//    @Async(value = "threadPoolTaskExecutor")
    public Result userRegister(@Validated @RequestBody User user)  {
        //用户名及密码不能为空
        userService.insertUser(user);
        return Result.getSuccessfulResult("用户注册成功");

    }

    /**
     * 用户登陆
     */
    @RequestMapping("/userlogin")
    public String userlogin(@RequestParam("name") String name, @RequestParam("password") String password) {
        if(name==null || "".equals(name.trim()) ||password==null || "".equals(password.trim()) ) {
            return "请输入用户名或密码";
        }
        User user = userService.queryUserByname(name);
        return "登陆成功！";
    }

    /**
     * 修改用户信息
     */
    @RequestMapping("/updateUser")
    public String updateUser(@RequestBody User user) {
        if(user.getId()<=0){
            return null;
        }
        userService.updateUser(user);
        return "修改成功！";
    }

    /**
     * 修改用户密码
     */
    @RequestMapping("/updateUserPsw")
    public String updateUserPsw(@RequestParam("name") String name, @RequestParam("tel") String tel) {
        if(name==null ||"".equals(name.trim())){
            return null;
        }
        userService.updateUserPsw(name,tel);
        return "密码修改成功，请重新登陆！";
    }
}
