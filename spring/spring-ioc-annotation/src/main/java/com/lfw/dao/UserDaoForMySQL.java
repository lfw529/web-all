package com.lfw.dao;

import org.springframework.stereotype.Repository;

@Repository  // 纳入 bean 管理
public class UserDaoForMySQL implements UserDao {
    @Override
    public void insert() {
        System.out.println("正在向mysql数据库插入User数据");
    }
}
