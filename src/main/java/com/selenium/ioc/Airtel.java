package com.selenium.ioc;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Airtel Sim calling");
    }

    @Override
    public void data() {
        System.out.println("Airtel Sim data");
    }

}
