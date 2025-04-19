package com.selenium.Spring_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myApp {
    public static void main(String[] args) {

        //container
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college = context.getBean("collegeBean", College.class);
        college.test();

        context.close();
    }
}
