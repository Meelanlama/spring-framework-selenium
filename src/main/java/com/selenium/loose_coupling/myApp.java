package com.selenium.loose_coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("service.xml");
        System.out.println("Xml loaded..");

        NamasteSim namasteSim = context.getBean("namaste", NamasteSim.class);
        namasteSim.activateService();


        //Hard coding of above DI
//    NamasteSim namasteSim = new NamasteSim();
//    Service service = new SmsPackService();
//
//    namasteSim.setService(service);
//    namasteSim.activateService();

    }
}
