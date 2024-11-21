package com.lfw.boot.core.service;

import com.lfw.boot.core.entity.UserEntity;
import com.lfw.boot.core.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class SysService {

    @EventListener
    public void haha(LoginSuccessEvent event) {
        System.out.println("==== SysService ===感知到事件" + event);
        UserEntity source = (UserEntity) event.getSource();
        recordLog(source.getUsername());
    }

    public void recordLog(String username) {
        System.out.println(username + "登录信息已被记录");
    }
}
