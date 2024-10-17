package com.lfw.service;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

// 切面类
@Aspect
@Component
public class MyAspect {

    // 切点表达式
    @Before("execution(* com.lfw.service.OrderService.*(..))")

    // 这就是需要增强的代码（通知）
    public void advice() {
        System.out.println("我是一个通知");
    }
}