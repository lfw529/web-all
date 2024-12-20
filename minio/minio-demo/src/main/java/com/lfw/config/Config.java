package com.lfw.config;

import io.minio.MinioClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    //单例的，那么MinioClient对象有没有线程安全问题呢？(同一个客户端，多个线程请求使用)答案是：没有线程安全问题
    @Bean
    public MinioClient minioClient() {
        //链式编程，构建 MinioClient对象
        return MinioClient.builder()
                .endpoint("http://192.168.10.101:9000")
                .credentials("admin", "password")
                .build();
    }
}
