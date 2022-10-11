package TripRefactored;
import com.TripRefactored.Trip;
import com.Vehicle.VehicleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TripTest {

    @Test
    public void SedanFareTest() {
        Trip trip = new Trip(VehicleType.SEDAN, 20, 40, 4);
        int fare = trip.perHeadFare();
        assertEquals(180, fare);
    }

    @Test
    public void SedanTripTest(){
        Trip trip = new Trip(VehicleType.SEDAN, 20, 40, 4);
        boolean canTake = trip.canTakeTrip();
        assertTrue(canTake);

        trip = new Trip(VehicleType.SEDAN, 20, 40, 5);
        assertFalse(trip.canTakeTrip());

        trip = new Trip(VehicleType.SEDAN, 26, 40, 4);
        assertFalse(trip.canTakeTrip());
    }

    @Test
    public void MotorBikeFareTest(){
        Trip trip = new Trip(VehicleType.MOTOR_BIKE, 20, 40, 4);
        int fare = trip.perHeadFare();

        assertEquals(100, fare);
    }

    @Test
    public void MotorBikeTripTest(){
        Trip trip = new Trip(VehicleType.MOTOR_BIKE, 8, 20, 1);
        boolean canTake = trip.canTakeTrip();
        assertTrue(canTake);

        trip = new Trip(VehicleType.MOTOR_BIKE, 11, 20, 1);
        assertFalse(trip.canTakeTrip());

        trip = new Trip(VehicleType.MOTOR_BIKE, 8, 10, 2);
        assertFalse(trip.canTakeTrip());
    }



    @Test
    public void SevenSeaterFareTest(){
        Trip trip = new Trip(VehicleType.SEVEN_SEATER, 30, 40, 7);
        int fare = trip.perHeadFare();

        assertEquals(125, fare);
    }

    @Test
    public void SevenSeaterTripTest(){
        Trip trip = new Trip(VehicleType.SEVEN_SEATER, 30, 40, 7);
        boolean canTake = trip.canTakeTrip();
        assertTrue(canTake);

        trip = new Trip(VehicleType.SEVEN_SEATER, 9, 15, 7);
        assertFalse(trip.canTakeTrip());

        trip = new Trip(VehicleType.SEVEN_SEATER, 35, 45, 8);
        assertFalse(trip.canTakeTrip());


    }
}
