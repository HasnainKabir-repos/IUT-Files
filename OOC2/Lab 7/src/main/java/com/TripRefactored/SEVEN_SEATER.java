package com.TripRefactored;

public class SEVEN_SEATER implements IVehicle{

    private  int distanceKM;
    private  int timeMinutes;
    private  int numberOfPassengers;

    public SEVEN_SEATER(int distanceKM, int timeMinutes, int numberOfPassengers){
        this.distanceKM =distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
    public int perHeadFare(){
        return distanceKM * 30 / numberOfPassengers;
    }

    public boolean canTakeTrip(){
        return numberOfPassengers > 1 && numberOfPassengers <= 7 && distanceKM >= 10;
    }

}
