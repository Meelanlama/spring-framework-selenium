package com.selenium.value_required_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("value_required.xml");

        Student student = context.getBean("student", Student.class);
//        System.out.println(student);
        student.displayStudentInfo();
    }
}
