package com.lfw.service2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 切面类
@Component
@Aspect
public class MyAspect {

    @Around("execution(* com.lfw.service2.OrderService.*(..))")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知开始");
        // 执行目标方法。
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束");
    }

    @Before("execution(* com.lfw.service2.OrderService.*(..))")
    public void beforeAdvice() {
        System.out.println("前置通知");
    }

    @AfterReturning("execution(* com.lfw.service2.OrderService.*(..))")
    public void afterReturningAdvice() {
        System.out.println("后置通知");
    }

    @AfterThrowing("execution(* com.lfw.service2.OrderService.*(..))")
    public void afterThrowingAdvice() {
        System.out.println("异常通知");
    }

    @After("execution(* com.lfw.service2.OrderService.*(..))")
    public void afterAdvice() {
        System.out.println("最终通知");
    }
}