package com.lfw.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {

    @Pointcut("execution(* com.lfw.service..save*(..))")
    public void savePointcut() {
    }

    @Pointcut("execution(* com.lfw.service..delete*(..))")
    public void deletePointcut() {
    }

    @Pointcut("execution(* com.lfw.service..modify*(..))")
    public void modifyPointcut() {
    }

    @Before("savePointcut() || deletePointcut() || modifyPointcut()")
    public void beforeAdvice(JoinPoint joinpoint) {
        System.out.println("XXX操作员正在操作" + joinpoint.getSignature().getName() + "方法");
    }
}