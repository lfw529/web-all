package com.lfw.service6;

import com.lfw.dao.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserService() {

    }

    public void save() {
        userDao.insert();
    }
}
