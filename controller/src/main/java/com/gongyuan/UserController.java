package com.gongyuan;

import com.gongyuan.model.User;
import com.gongyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
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
    @Autowired
    UserService userService;

    /**
     * 用户注册
     */
    @RequestMapping("/userRegister")
    public String userRegister(@RequestBody User user) {
        int result;
        //真实姓名及密码不能为空
        if (StringUtils.isEmpty(user)) {
            return null;
        }
        if (null == user.getTureName() || "".equals(user.getTureName()) || null == user.getPassword() || "".equals(user.getPassword())) {
            return "真实姓名及密码不能为空！";
        }
        result = userService.insertUser(user);
        return "注册成功！";
    }

    /**
     * 用户登陆
     */
    @RequestMapping("/userlogin")
    public void userlogin(@RequestParam("trueName") String trueName, @RequestParam("password") String password) {
    }

    /**
     * 修改用户信息
     */
    @RequestMapping("/userRegister")
    public void updateUser(@RequestParam("trueName") String trueName, @RequestParam("password") String password) {
    }

    /**
     * 修改用户密码
     */
    @RequestMapping("/userRegister")
    public void updateUserPsw(@RequestParam("trueName") String trueName, @RequestParam("tel") String tel) {
    }
}
