package com.lfw.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.lfw.service")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Configuration {
}