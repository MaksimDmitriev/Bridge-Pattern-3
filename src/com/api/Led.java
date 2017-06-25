package com.api;

public class Led implements Technology {

    @Override
    public void turnOn() {
        System.out.println("turn on LED");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off LED");
    }
}
