package com.lfw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.lfw.dao", "com.lfw.service"})
public class Spring6Configuration {
}
