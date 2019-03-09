package com.yun.music.controller;

import com.yun.music.common.JsonBean;
import com.yun.music.entity.User;
import com.yun.music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login.do")
    public JsonBean login(String uname, String password){
        return userService.login(uname, password);
    }

    @PostMapping("adduser.do")
    public JsonBean addUser(User user){
        return userService.addUser(user);
    }
}
