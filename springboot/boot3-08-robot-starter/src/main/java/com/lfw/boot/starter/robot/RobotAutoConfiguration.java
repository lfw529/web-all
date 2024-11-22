package com.lfw.boot.starter.robot;

import com.lfw.boot.starter.robot.controller.RobotController;
import com.lfw.boot.starter.robot.properties.RobotProperties;
import com.lfw.boot.starter.robot.service.RobotService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 给容器中导入 Robot 功能要用的所有组件
@Import({RobotProperties.class, RobotService.class})
@Configuration
public class RobotAutoConfiguration {
//    @Bean  // 把组件导入到容器中
    public RobotController robotController() {
        return new RobotController();
    }
}
