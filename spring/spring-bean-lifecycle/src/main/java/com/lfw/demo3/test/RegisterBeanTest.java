package com.lfw.demo3.test;

import com.lfw.demo3.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class RegisterBeanTest {

    @Test
    public void testBeanRegister() {
        // 自己 new 的对象
        User user = new User();
        System.out.println(user);

        // 创建默认可列表 BeanFactory 对象
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        // 注册 Bean
        factory.registerSingleton("userBean", user);
        // 从 spring 容器中获取 bean
        User userBean = (User) factory.getBean("userBean", User.class);
        System.out.println(userBean);
    }
}
