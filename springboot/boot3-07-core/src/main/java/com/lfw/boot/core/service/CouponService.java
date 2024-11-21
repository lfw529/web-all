package com.lfw.boot.core.service;

import com.lfw.boot.core.entity.UserEntity;
import com.lfw.boot.core.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    public CouponService() {
        System.out.println("构造器调用");
    }

    @Async
    @Order(1)
    @EventListener
    public void onEvent(LoginSuccessEvent loginSuccessEvent) {
        System.out.println("===== CouponService ====感知到事件" + loginSuccessEvent);
        UserEntity source = (UserEntity) loginSuccessEvent.getSource();
        sendCoupon(source.getUsername());
    }


    public void sendCoupon(String username) {
        System.out.println(username + " 随机得到了一张优惠券");
    }
}
