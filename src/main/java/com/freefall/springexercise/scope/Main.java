package com.freefall.springexercise.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        
        DemoSingletonService ds1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService ds2 = context.getBean(DemoSingletonService.class);
        
        DemoPrototypeService dp1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService dp2 = context.getBean(DemoPrototypeService.class);
        
        System.out.println("ds1和ds2是否相等："+ds1.equals(ds2));
        System.out.println("dp1和dp2是否相等："+dp1.equals(dp2));
        
        context.close();
    }
}
