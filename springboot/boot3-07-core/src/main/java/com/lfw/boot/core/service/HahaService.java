package com.lfw.boot.core.service;

import com.lfw.boot.core.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class HahaService {
    @EventListener
    public void onEvent(LoginSuccessEvent event) {
        System.out.println("=== HahaService === 感知到事件" + event);
        //调用业务
    }
}
