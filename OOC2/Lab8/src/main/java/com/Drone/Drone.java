package com.Drone;

public class Drone implements CameraSwitch{

    public void start(){
        System.out.println("Drone Started");
    }

    public void stop(){
        System.out.println("Drone Stopped");
    }

    public void turnCameraOn() {
        System.out.println("Camera turned on");
    }

    public void turnCameraOff(){
        System.out.println("Camera turned off");
    }
}
