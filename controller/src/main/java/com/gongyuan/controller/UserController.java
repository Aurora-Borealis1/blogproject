//package com.gongyuan.controller;
//
//
//import com.gongyuan.model.User;
//import com.gongyuan.service.UserService;
//import jdk.nashorn.internal.ir.annotations.Reference;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author wushangyi
// * @date 2020/11/8 10:45
// */
//@RestController
//public class UserController {
//    @Reference
//    UserService userService;
//
//    /**
//     * 用户注册
//     */
//    @RequestMapping("/userRegister")
//    public String userRegister(@RequestBody User user) {
//        int result;
//        //用户名及密码不能为空
//        if (StringUtils.isEmpty(user)) {
//            return null;
//        }
//        if (null == user.getName() || "".equals(user.getName()) || null == user.getPassword() || "".equals(user.getPassword())) {
//            return "用户名及密码不能为空！";
//        }
//        result = userService.insertUser(user);
//        return "注册成功！";
//    }
//
//    /**
//     * 用户登陆
//     */
//    @RequestMapping("/userlogin")
//    public void userlogin(@RequestParam("name") String name, @RequestParam("password") String password) {
//    }
//
//    /**
//     * 修改用户信息
//     */
//    @RequestMapping("/userRegister")
//    public void updateUser(@RequestParam("name") String name, @RequestParam("password") String password) {
//    }
//
//    /**
//     * 修改用户密码
//     */
//    @RequestMapping("/userRegister")
//    public void updateUserPsw(@RequestParam("name") String name, @RequestParam("tel") String tel) {
//    }
//}
