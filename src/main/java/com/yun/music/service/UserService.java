package com.yun.music.service;

import com.yun.music.common.JsonBean;
import com.yun.music.entity.User;

public interface UserService {

    // 登录
    JsonBean login(String name, String password);

    // 注册
    JsonBean addUser(User user);
}
