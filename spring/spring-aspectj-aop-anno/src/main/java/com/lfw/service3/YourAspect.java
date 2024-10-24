package com.lfw.service3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2) //设置优先级
public class YourAspect {

    @Around("execution(* com.lfw.service3.OrderService.*(..))")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("YourAspect环绕通知开始");
        // 执行目标方法。
        proceedingJoinPoint.proceed();
        System.out.println("YourAspect环绕通知结束");
    }

    @Before("execution(* com.lfw.service3.OrderService.*(..))")
    public void beforeAdvice() {
        System.out.println("YourAspect前置通知");
    }

    @AfterReturning("execution(* com.lfw.service3.OrderService.*(..))")
    public void afterReturningAdvice() {
        System.out.println("YourAspect后置通知");
    }

    @AfterThrowing("execution(* com.lfw.service3.OrderService.*(..))")
    public void afterThrowingAdvice() {
        System.out.println("YourAspect异常通知");
    }

    @After("execution(* com.lfw.service3.OrderService.*(..))")
    public void afterAdvice() {
        System.out.println("YourAspect最终通知");
    }
}
