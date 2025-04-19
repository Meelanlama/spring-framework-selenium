package com.selenium.bean_lifecycle.problem;

public class Hello {
    public void init(){
        System.out.println("Inside hello init");
    }
    public void destroy(){
        System.out.println("Inside hello destroy");
    }
}
