package com.lfw.service;

import com.lfw.bean.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /**
     * 根据name查找用户
     *
     * @param username
     * @return
     */
    public User getByName(String username) {
        if (username.equals("zhangsan")) {
            return new User("zhangsan", "13234");
        }
        return null;
    }
}
