package com.api;

public class MedicalMonitor implements Application {

    @Override
    public void configure() {
        System.out.println("configure the medical monitor");
    }

    @Override
    public void tearDown() {
        System.out.println("do some clean-up specific to medical monitors");
    }
}
