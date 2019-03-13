package com.freefall.springexercise.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.freefall.springexercise.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
