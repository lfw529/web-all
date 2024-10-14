package com.lfw.test;

import com.lfw.bean2.BankDao;
import com.lfw.bean2.User;
import com.lfw.bean2.Vip;
import com.lfw.bean3.Order;
import com.lfw.config.Spring6Configuration;
import com.lfw.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    @Test
    public void testBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }

    @Test
    public void testBean2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Vip vipBean = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vipBean);
    }

    @Test
    public void testBean3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BankDao bankDao = applicationContext.getBean("bankDao", BankDao.class);
        System.out.println(bankDao);
    }

    @Test
    public void testBean4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BankDao bankDao = applicationContext.getBean("bankDao", BankDao.class);
        System.out.println(bankDao);
        Order order = applicationContext.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void testBean5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        BankDao bankDao = applicationContext.getBean("bankDao", BankDao.class);
        System.out.println(bankDao);
        Order order = applicationContext.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void testChoose() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose.xml");
    }

    @Test
    public void testChoose2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose2.xml");
    }

    @Test
    public void testValue() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection.xml");
        Object user = applicationContext.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testValue2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection2.xml");
        Object user = applicationContext.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testValue3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection3.xml");
        Object user = applicationContext.getBean("user");
        System.out.println(user);
    }

    @Test
    public void testAutowired() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection4.xml");
        com.lfw.service.UserService userService = applicationContext.getBean("userService", com.lfw.service.UserService.class);
        userService.save();
    }

    @Test
    public void testAutowired2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection5.xml");
        com.lfw.service2.UserService userService = applicationContext.getBean("userService", com.lfw.service2.UserService.class);
        userService.save();
    }

    @Test
    public void testAutowired3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection6.xml");
        com.lfw.service3.UserService userService = applicationContext.getBean("userService", com.lfw.service3.UserService.class);
        userService.save();
    }

    @Test
    public void testAutowired4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection7.xml");
        com.lfw.service4.UserService userService = applicationContext.getBean("userService", com.lfw.service4.UserService.class);
        userService.save();
    }

    @Test
    public void testAutowired5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection8.xml");
        com.lfw.service5.UserService userService = applicationContext.getBean("userService", com.lfw.service5.UserService.class);
        userService.save();
    }

    @Test
    public void testAutowired6() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection9.xml");
        com.lfw.service6.UserService userService = applicationContext.getBean("userService", com.lfw.service6.UserService.class);
        userService.save();
    }

    @Test
    public void testAutowired7() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection10.xml");
        com.lfw.service7.UserService userService = applicationContext.getBean("userService", com.lfw.service7.UserService.class);
        userService.save();
    }

    @Test
    public void testAutowired8() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection11.xml");
        com.lfw.service8.UserService userService = applicationContext.getBean("userService", com.lfw.service8.UserService.class);
        userService.save();
    }

    @Test
    public void testAutowired9() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection12.xml");
        com.lfw.service9.UserService userService = applicationContext.getBean("userService", com.lfw.service9.UserService.class);
        userService.save();
    }

    @Test
    public void testAutowired10() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection13.xml");
        com.lfw.service10.UserService userService = applicationContext.getBean("userService", com.lfw.service10.UserService.class);
        userService.save();
    }

    @Test
    public void testAutowired11() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection14.xml");
        com.lfw.service11.UserService userService = applicationContext.getBean("userService", com.lfw.service11.UserService.class);
        userService.save();
    }

    @Test
    public void testAutowired12() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-injection15.xml");
        com.lfw.service12.UserService userService = applicationContext.getBean("userService", com.lfw.service12.UserService.class);
        userService.save();
    }

    @Test
    public void testNoXml() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.save();
    }
}
