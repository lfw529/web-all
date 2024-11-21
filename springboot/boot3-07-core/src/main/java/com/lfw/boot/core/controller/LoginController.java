package com.lfw.boot.core.controller;

import com.lfw.boot.core.entity.UserEntity;
import com.lfw.boot.core.event.EventPublisher;
import com.lfw.boot.core.event.LoginSuccessEvent;
import com.lfw.boot.core.service.AccountService;
import com.lfw.boot.core.service.CouponService;
import com.lfw.boot.core.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    AccountService accountService;

    @Autowired
    CouponService couponService;

    @Autowired
    SysService sysService;
    @Autowired
    private EventPublisher eventPublisher;

    /**
     * 增加业务
     *
     * @param username
     * @param passwd
     * @return
     */
    @GetMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("passwd") String passwd) {
        //业务处理登录
        System.out.println("业务处理登录完成....");

        //TODO 发送事件
        //1.创建事件信息
        LoginSuccessEvent event = new LoginSuccessEvent(new UserEntity(username, passwd));
        //2.发送事件
        eventPublisher.sendEvent(event);


//        //1、账户服务自动签到加积分
//        accountService.addAccountScore(username);
//        //2、优惠服务随机发放优惠券
//        couponService.sendCoupon(username);
//        //3、系统服务登记用户登录的信息
//        sysService.recordLog(username);

        //设计模式：对新增开放，对修改关闭
        //xxx
        //xxx
        //xxx
        return username + "登录成功";
    }
}