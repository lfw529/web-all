package com.lfw.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot 3!";
    }

    @GetMapping("/incr")
    public String incr() {
        Long haha = redisTemplate.opsForValue().increment("haha");
        return "增加后的值：" + haha;
    }
}
