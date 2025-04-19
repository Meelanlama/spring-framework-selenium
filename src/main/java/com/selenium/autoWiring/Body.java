package com.selenium.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiree.xml");
        System.out.println("XML file loaded...");
        Human human = context.getBean("human", Human.class);
        human.startPumping();

        // Internally
//        Human human1 = new Human();
//        Heart heartObject = new Heart();
//
//        human1.setHeart(heartObject);
//        Heart heart = heartObject
//        human1.startPumping();
    }
}
