package com.selenium.bean_lifecycle.problem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_problem.xml");
        Hi hi = context.getBean("hi",Hi.class);
        context.close();
    }
}
