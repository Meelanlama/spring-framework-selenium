package com.selenium.bean_lifecycle.problem;

public class Hi {
    public void init(){
        System.out.println("Inside hi init");
    }
    public void destroy(){
        System.out.println("Inside hi destroy");
    }
}
