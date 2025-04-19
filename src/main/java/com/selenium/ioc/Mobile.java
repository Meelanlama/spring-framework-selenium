package com.selenium.ioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Config file loaded....");

        Sim sim = context.getBean("sim1",Sim.class);
        sim.calling();
        sim.data();

        System.out.println("second...");

        Sim sim1 = context.getBean("sim2",Sim.class);
        sim1.calling();
        sim1.data();
    }
}
