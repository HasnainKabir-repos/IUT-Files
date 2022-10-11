package com.TripRefactored;

import com.Vehicle.VehicleType;

public class Trip {
    private IVehicle type;

    public Trip(VehicleType vehicleType,
                int distanceKM,
                int timeMinutes,
                int numberOfPassengers) {
        TripFactory tf = new TripFactory();
        this.type = tf.chooseVehicle(vehicleType, distanceKM, timeMinutes, numberOfPassengers);
    }

    public int perHeadFare()
    {
        int fare = -1;
        fare = type.perHeadFare();

        return fare - (fare % 5);
    }

    public boolean canTakeTrip()
    {
        return type.canTakeTrip();
    }
}

