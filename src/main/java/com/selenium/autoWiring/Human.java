package com.selenium.autoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Human {

    //@Autowired
    @Qualifier("humanHeart")
    private Heart heart;

    public Human(){
    }

    public Human(Heart heart) {
        this.heart = heart;
        System.out.println("Human constructor is called which has heart reference");
    }

//    @Autowired
//    @Qualifier("humanHeart")
//    public void setHeart(Heart heart) {
//        this.heart = heart;
//        System.out.println("Setter method is called.");
//    }

    public void startPumping(){
        if(heart != null){
            heart.pump();
            System.out.println("Name of the animal is: " + heart.getNameOfAnimal() + " and number of heart is: " + heart.getNoOfHearts());
        } else {
            System.out.println("Heart is null!");
        }

    }
}
