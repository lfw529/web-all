package com.lfw.service8;

import com.lfw.dao.UserDao;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;

@Service
public class UserService {

    @Resource(name = "xyz")
    private UserDao userDao;

    public void save() {
        userDao.insert();
    }
}
