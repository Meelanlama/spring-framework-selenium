package com.selenium.loose_coupling;

public class DataService implements Service{
    @Override
    public void service() {
        System.out.println("Data Activated");
    }
}
