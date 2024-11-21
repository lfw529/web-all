package com.lfw.boot.core.service;


import com.lfw.boot.core.entity.UserEntity;
import com.lfw.boot.core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements ApplicationListener<LoginSuccessEvent> {
    public void addAccountScore(String username) {
        System.out.println(username + " 加了1分");
    }

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println("=====  AccountService  收到事件 =====");

        UserEntity user = (UserEntity) event.getSource();
        addAccountScore(user.getUsername());
    }
}
