package com.api;

public class Lcd implements Technology {

    @Override
    public void turnOn() {
        System.out.println("turn on LCD");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off LCD");
    }
}
