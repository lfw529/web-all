package com.lfw.test;

import com.lfw.bean.User;
import com.lfw.bean.Vip;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInstantiationTest {
    @Test
    public void testConstructor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }

    @Test
    public void testSimpleFactory() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Vip vip = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vip);
    }
}
