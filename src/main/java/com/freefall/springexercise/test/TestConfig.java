package com.freefall.springexercise.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.freefall.springexercise.test")
public class TestConfig {
    /*
     * @Configuration 声明当前类是一个配置类
     * @ComponentScan("com.freefall.springexercise.test") 自动扫描包名下所有使用@Service @Component @Repository @Controller 的类，并注册为Bean
     */
}
