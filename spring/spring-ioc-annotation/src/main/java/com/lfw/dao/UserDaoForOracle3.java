package com.lfw.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoForOracle3 implements UserDao {
    @Override
    public void insert() {
        System.out.println("正在向Oracle数据库插入User数据");
    }
}
