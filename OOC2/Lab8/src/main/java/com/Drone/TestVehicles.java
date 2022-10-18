package com.Drone;

public class TestVehicles {

    public static void main(String[] args){
        Car car = new Car();

        car.start();
        car.turnRadioOn();
        car.turnRadioOff();
        car.stop();

        Drone drone = new Drone();

        drone.start();
        drone.turnCameraOn();
        drone.turnCameraOff();
        drone.stop();
    }
}
