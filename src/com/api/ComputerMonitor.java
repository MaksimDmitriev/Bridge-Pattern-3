package com.api;

public class ComputerMonitor implements Application {

    @Override
    public void configure() {
        System.out.println("configure the computer monitor");
    }

    @Override
    public void tearDown() {
        System.out.println("do some clean-up specific to computer monitors");
    }
}
