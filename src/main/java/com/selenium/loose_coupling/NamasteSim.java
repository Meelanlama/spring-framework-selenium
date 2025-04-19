package com.selenium.loose_coupling;

public class NamasteSim {
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void activateService() {
        service.service();
    }
}
