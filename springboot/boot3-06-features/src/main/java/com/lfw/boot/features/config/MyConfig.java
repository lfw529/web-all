package com.lfw.boot.features.config;

import com.lfw.boot.features.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * java -jar demo.jar --server.port=9999
 */
//@PropertySource("classpath:aaaa.properties")
@Profile("test")  //只有指定环境被激活整个类的所有配置才能生效
@Configuration
public class MyConfig {

    @Profile("dev")
    @Bean
    public Cat cat() {
        return new Cat();
    }
}
