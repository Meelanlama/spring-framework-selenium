package com.selenium.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("database.xml");

        JDBC_Connection jdbc = context.getBean("jdbc", JDBC_Connection.class);
        jdbc.display();
        jdbc.connect();
    }
}
