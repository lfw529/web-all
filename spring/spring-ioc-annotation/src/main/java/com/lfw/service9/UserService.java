package com.lfw.service9;

import com.lfw.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Resource
    // 在 UserService 中不指定 userDao
    private UserDao userDao;

    public void save() {
        userDao.insert();
    }
}
