package com.selenium.Spring_Annotation;

import org.springframework.stereotype.Component;

@Component
public class Principal {

    public void principalInfo(){
        System.out.println("This is a principal info");
        System.out.println("My name is Milan");
    }
}
