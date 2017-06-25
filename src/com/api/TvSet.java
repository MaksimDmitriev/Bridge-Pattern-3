package com.api;

public class TvSet implements Application {

    @Override
    public void configure() {
        System.out.println("configure the TV set");
    }

    @Override
    public void tearDown() {
        System.out.println("do some clean-up specific to TV sets");
    }
}
