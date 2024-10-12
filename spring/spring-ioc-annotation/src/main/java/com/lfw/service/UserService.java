package com.lfw.service;

import com.lfw.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // 纳入 bean 惯例
public class UserService {
    @Autowired  // 在属性上注入
    private UserDao userDao;

    // 没有提供构造方法 和 setter 方法。

    public void save() {
        userDao.insert();
    }
}
