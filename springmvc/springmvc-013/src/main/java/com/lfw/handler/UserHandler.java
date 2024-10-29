package com.lfw.handler;

import com.lfw.bean.User;
import com.lfw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserHandler {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User detail(@PathVariable("id") Long id) {
        return userService.getById(id);
    }
}
