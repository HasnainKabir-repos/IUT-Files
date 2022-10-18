package com.Drone;

public class Car implements RadioSwitch{
    public void start(){
        System.out.println("Car Started");
    }

    public void stop(){
        System.out.println("Car Stopped");
    }

    public void turnRadioOn() {
        System.out.println("Radio turned on");
    }

    public void turnRadioOff(){
        System.out.println("Radio turned off");
    }
}
