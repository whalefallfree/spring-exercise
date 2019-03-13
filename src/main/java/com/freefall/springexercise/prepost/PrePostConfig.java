package com.freefall.springexercise.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.freefall.springexercise.prepost")
public class PrePostConfig {
    @Bean(initMethod="init",destroyMethod="destory")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }
    
    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
