package com.freefall.springexercise.el;

import javax.annotation.Resource;

import org.apache.commons.io.IOUtils;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.freefall.springexercise.el")
@PropertySource("classpath:com/freefall/springexercise/el/test.properties")
public class ElConfig {
    @Value("I Love You!")
    private String normal;
    
    @Value("#{systemProperties['oa.name']}")
    private String osName;
    
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;
    
    @Value("#{demoService.anthor}")
    private String fromAnthor;
    
    @Value("classpath:com/freefall/springexercise/el/test.txt")
    private Resource testFile;
    
    @Value("http://www.baidu.com")
    private Resource testUrl;
    
    @Value("${book.name}")
    private String bookName;
    
    @Autowired
    private Environment environment;
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnthor);
//            System.out.println(IOUtils.toString(testFile.getInputStream()));
//            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
//            System.out.println(environment.getProperty("book.anthor"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
