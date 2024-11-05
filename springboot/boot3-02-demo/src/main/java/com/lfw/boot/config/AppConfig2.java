package com.lfw.boot.config;

import com.lfw.boot.bean.Cat;
import com.lfw.boot.bean.Dog;
import com.lfw.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class AppConfig2 {

    @Bean
    public Cat cat01() {
        return new Cat();
    }

    @Bean
    public Dog dog01() {
        return new Dog();
    }

    @ConditionalOnBean(value = Dog.class)
    @Bean
    public User zhangsan() {
        return new User();
    }

    @ConditionalOnMissingBean(value = Dog.class)
    @Bean
    public User lisi() {
        return new User();
    }
}
