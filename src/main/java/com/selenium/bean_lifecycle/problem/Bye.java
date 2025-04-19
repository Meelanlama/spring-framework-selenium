package com.selenium.bean_lifecycle.problem;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bye implements InitializingBean, DisposableBean {
//    public void init(){
//        System.out.println("Inside bye init");
//    }
//    public void destroy(){
//        System.out.println("Inside bye destroy");
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertiesSet method");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy method");
    }
}
