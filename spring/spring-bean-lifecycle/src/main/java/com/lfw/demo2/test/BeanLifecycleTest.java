package com.lfw.demo2.test;

import com.lfw.demo2.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleTest {
    @Test
    public void testLifecycle() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        User userBean = applicationContext.getBean("userBean2", User.class);
        System.out.println("8.使用 Bean");
        // 只有正常关闭 spring 容器才会执行销毁方法
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }

    @Test
    public void testLifecycle2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
        User userBean = applicationContext.getBean("userBean3", User.class);
        System.out.println("8.使用 Bean");
        // 只有正常关闭 spring 容器才会执行销毁方法
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
}
