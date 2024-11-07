package com.lfw.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/h")
    public String hello(String a, String b) {
//        Logger logger = Logger.getLogger(HelloController.class.getName());
//        logger.info("haha，方法");

        for (int i = 0; i < 1000; i++) {
            log.trace("trace 日志....");
            log.debug("debug 日志.....");
            //SpringBoot底层默认的日志级别 info
            log.info("info 日志..... 参数a:{} b:{}", a, b);
            log.warn("warn 日志...");
            log.error("error 日志...");
        }
//        log.info("haha, 方法");
        return "hello";
    }
}
