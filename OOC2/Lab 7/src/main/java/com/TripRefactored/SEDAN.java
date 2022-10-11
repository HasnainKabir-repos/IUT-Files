package com.TripRefactored;

public class SEDAN implements IVehicle{

    private  int distanceKM;
    private  int timeMinutes;
    private  int numberOfPassengers;

    public SEDAN(int distanceKM, int timeMinutes, int numberOfPassengers){
        this.distanceKM =distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    public int perHeadFare(){
        return (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;
    }

    public boolean canTakeTrip(){
        return numberOfPassengers > 1 && numberOfPassengers <= 4 && distanceKM <= 25 ;
    }

}
