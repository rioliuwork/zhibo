package com.zhibo.org.zhibo.controller;

import com.zhibo.org.zhibo.entity.User;
import com.zhibo.org.zhibo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public Object getUserById(){
        User user = userMapper.getUserById(1);
        return user;
    }
}
