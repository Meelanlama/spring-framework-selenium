package com.selenium.Spring_Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.selenium.Spring_Annotation")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

    /*
    @Bean
    public College collegeBean() // methodName is bean id
    {
        College college = new College();
        college.setPrincipal(principalBean());
        college.setTeacher(mathTeacherBean());
        return college;
    }

    @Bean
    public Principal principalBean(){
        return new Principal();
    }

    @Bean
    public Teacher mathTeacherBean(){
        return new MathTeacher();
    }
     */


}
