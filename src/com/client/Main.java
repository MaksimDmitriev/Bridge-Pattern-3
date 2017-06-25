package com.client;

import com.api.Display;
import com.api.Lcd;
import com.api.MedicalMonitor;
import com.api.Monochrome;

// Displays can be:
// 1. Monochrome and color
// 2. LCD and LED
// 3. For TV sets, computers, and medical devices

// The Bridge pattern is applied when TWO orthogonal dimensions exist in the domain. Here I have three, and suppose there
// can be more. That's why I applied the Builder pattern instead of Bridge. TODO: discuss with Dima.
class Main {

    public static void main(String[] args) {
        Display display = new Display.Builder()
                .setPicture(new Monochrome())
                .setTechnology(new Lcd())
                .setApplication(new MedicalMonitor())
                .build();

        display.turnOn();
        System.out.println();
        display.turnOff();

    }
}
