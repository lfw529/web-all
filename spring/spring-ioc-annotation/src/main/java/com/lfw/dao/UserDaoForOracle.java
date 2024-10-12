package com.lfw.dao;

import org.springframework.stereotype.Repository;

@Repository  // 纳入bean管理 --> 这里没有给bean起名，默认名字是：userDaoForOracle
public class UserDaoForOracle implements UserDao {
    @Override
    public void insert() {
        System.out.println("正在向Oracle数据库插入User数据");
    }
}
