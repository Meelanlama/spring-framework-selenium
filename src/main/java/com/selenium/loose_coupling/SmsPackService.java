package com.selenium.loose_coupling;

public class SmsPackService implements Service{
    @Override
    public void service() {
        System.out.println("SMS Pack Service Activated.");
    }
}
