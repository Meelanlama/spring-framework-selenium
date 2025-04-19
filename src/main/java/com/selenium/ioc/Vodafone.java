package com.selenium.ioc;

public class Vodafone implements Sim{
    @Override
    public void calling() {
        System.out.println("Vodafone Sim calling");
    }

    @Override
    public void data() {
        System.out.println("Vodafone Sim data");
    }
}
