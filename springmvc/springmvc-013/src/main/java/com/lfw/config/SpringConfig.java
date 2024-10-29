package com.lfw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 标注该类是一个配置文件类
@Configuration
// 组件扫描
@ComponentScan({"com.lfw.service"})
// 属性配置文件位置
@PropertySource("classpath:jdbc.properties")
// 导入其他配置到Spring配置
@Import({DataSourceConfig.class, MyBatisConfig.class})
// 开启事务管理机制
@EnableTransactionManagement
public class SpringConfig {
}

