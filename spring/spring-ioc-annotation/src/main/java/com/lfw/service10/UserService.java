package com.lfw.service10;

import com.lfw.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Resource
    private UserDao userDao2;

    public void save() {
        userDao2.insert();
    }
}