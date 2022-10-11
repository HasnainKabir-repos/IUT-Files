package com.TripRefactored;

import com.Vehicle.VehicleType;

public class TripFactory {
    public IVehicle chooseVehicle(VehicleType vehicleType, int distanceKM, int timeMinutes, int numberOfPassengers ){
        IVehicle vehicle;
        if(vehicleType.equals(VehicleType.SEDAN)){
            vehicle = new SEDAN(distanceKM, timeMinutes, numberOfPassengers);
        }else if(vehicleType.equals(VehicleType.MOTOR_BIKE)){
            vehicle = new MOTOR_BIKE(distanceKM, timeMinutes, numberOfPassengers);
        }else{
            vehicle = new SEVEN_SEATER(distanceKM, timeMinutes, numberOfPassengers);
        }

        return vehicle;
    }
}
