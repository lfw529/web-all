package com.lfw.boot.ssm.controller;

import com.lfw.boot.ssm.bean.TUser;
import com.lfw.boot.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    /**
     * 返回User的json数据
     *
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public TUser getUser(@PathVariable("id") Long id) {
        TUser user = userMapper.getUserById(id);
        return user;
    }
}
