package com.Vehicle;


public class Trip {
    private  VehicleType vehicleType;
    private  int distanceKM;
    private  int timeMinutes;
    private  int numberOfPassengers;

    public Trip(VehicleType vehicleType,
                int distanceKM,
                int timeMinutes,
                int numberOfPassengers) {
        this.vehicleType = vehicleType;
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int perHeadFare()
    {
        int fare = -1;
        switch (vehicleType) {
            case SEDAN:
                fare = (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;
                break;
            case MOTOR_BIKE:
                fare = Math.max(25, distanceKM * 20) / numberOfPassengers;
                break;
            default:
                if (distanceKM < 10)
                    fare = 300 / numberOfPassengers;
                else
                    fare = distanceKM * 30 / numberOfPassengers;
                break;
        }

        return fare - (fare % 5);
    }

    public boolean canTakeTrip()
    {
        if (numberOfPassengers < 1)
            return false;

        switch (vehicleType)
        {
            case SEDAN:
                return numberOfPassengers <= 4 && distanceKM <= 25;
            case SEVEN_SEATER:
                return numberOfPassengers <= 7 && distanceKM >= 10;
            default:
                return numberOfPassengers <= 1 && distanceKM <= 10;
        }
    }
}
