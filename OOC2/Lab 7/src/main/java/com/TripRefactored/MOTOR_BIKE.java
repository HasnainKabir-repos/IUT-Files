package com.TripRefactored;

public class MOTOR_BIKE implements IVehicle{

    private  int distanceKM;
    private  int timeMinutes;
    private  int numberOfPassengers;

    public MOTOR_BIKE(int distanceKM, int timeMinutes, int numberOfPassengers){
        this.distanceKM =distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    public int perHeadFare(){
        return Math.max(25, distanceKM * 20) / numberOfPassengers;
    }

    public boolean canTakeTrip(){
        return numberOfPassengers <= 1 && distanceKM <= 10;
    }

}