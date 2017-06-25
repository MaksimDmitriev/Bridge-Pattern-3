package com.api;

public class Display {

    private Picture picture;
    private Technology technology;
    private Application application;

    private Display() {

    }

    public void turnOn() {
        technology.turnOn();
        application.configure();
        picture.draw();
    }

    public void turnOff() {
        application.tearDown();
        technology.turnOff();
    }

    public static class Builder {

        private Picture picture;
        private Technology technology;
        private Application application;

        public Builder setPicture(Picture picture) {
            this.picture = picture;
            return this;
        }

        public Builder setTechnology(Technology technology) {
            this.technology = technology;
            return this;
        }

        public Builder setApplication(Application application) {
            this.application = application;
            return this;
        }

        public Display build() {
            Display display = new Display();
            display.picture = this.picture;
            display.technology = this.technology;
            display.application = this.application;
            return display;
        }
    }
}
