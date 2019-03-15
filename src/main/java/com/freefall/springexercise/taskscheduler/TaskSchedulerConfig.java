package com.freefall.springexercise.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.freefall.springexercise.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
