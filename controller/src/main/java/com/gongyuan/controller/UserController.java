package com.gongyuan.controller;


import com.gongyuan.model.Result;
import com.gongyuan.model.ServiceException;
import com.gongyuan.model.User;
import com.gongyuan.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wushangyi
 * @date 2020/11/8 10:45
 */
@RestController
public class UserController {
    @Reference
    UserService userService;

    /**
     * 用户注册
     */
    @RequestMapping("/userRegister")
    public Result userRegister(@RequestBody User user)  {
        //用户名及密码不能为空
        if (user==null) {
            return null;
        }
        if (null == user.getName() || "".equals(user.getName().trim()) || null == user.getPassword() || "".equals(user.getPassword().trim())) {
            throw new ServiceException("9999","参数异常");
        }
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
