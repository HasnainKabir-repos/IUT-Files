import code.Car;
import code.DateTime;
import code.VehicleType;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void testGetLateFee() {
        Car car = new Car("C_123", 2020, "Toyota", "Corolla", 0, new VehicleType(5));
        DateTime startDate = new DateTime(1, 1, 2023);
        DateTime onTime = new DateTime(startDate, 3);
        DateTime late = new DateTime(startDate, 5);
        DateTime early = new DateTime(startDate, 1);

        assertEquals(0.0, car.getLateFee(onTime, startDate), 0.01);
        assertTrue(car.getLateFee(late, startDate) > 0);
        assertEquals(0.0, car.getLateFee(early, startDate), 0.01);
    }

    @Test
    public void testReturnVehicle() {
        Car car = new Car("C_123", 2020, "Toyota", "Corolla", 0, new VehicleType(5));
        DateTime rentDate = new DateTime(1, 1, 2023);
        DateTime onTime = new DateTime(rentDate, 3);
        DateTime late = new DateTime(rentDate, 5);
        DateTime early = new DateTime(rentDate, 1);
        String customerId = "C_456";

        assertTrue(car.rent(customerId, rentDate, 3));
        assertTrue(car.returnVehicle(onTime));
        assertFalse(car.returnVehicle(late));
        assertFalse(car.returnVehicle(early));
        assertFalse(car.returnVehicle(onTime));
    }

    @Test
    public void testCompleteMaintenance() {
        Car car = new Car("C_123", 2020, "Toyota", "Corolla", 0, new VehicleType(5));

        assertFalse(car.completeMaintenance());
        car.vehicleStatus = 2;
        assertTrue(car.completeMaintenance());
        assertEquals(0, car.vehicleStatus);
    }

    @Test
    public void testGetDetails() {
        Car car = new Car("C_123", 2020, "Toyota", "Corolla", 0, new VehicleType(5));
        String expectedDetails = "Vehicle ID:\tC_123\n Year:\t 2020\n Make:\tToyota\n Model:\tCorolla\n Number of Seats:\t5\n Status:\tAvailable\nRENTAL RECORD:\tempty";
        assertEquals(expectedDetails, car.getDetails());

    }

    @Test
    public void testRentInvalidDays() {
        Car car = new Car("C_123", 2020, "Toyota", "Corolla", 0, new VehicleType(5));
        DateTime rentDate = new DateTime(1, 1, 2023);
        String customerId = "C_456";

        assertFalse(car.rent(customerId, rentDate, 0));
        assertFalse(car.rent(customerId, rentDate, 15));
    }

    @Test
    public void testRentWhenRented() {
        Car car = new Car("C_123", 2020, "Toyota", "Corolla", 0, new VehicleType(5));
        DateTime rentDate = new DateTime(1, 1, 2023);
        String customerId1 = "C_456";
        String customerId2 = "C_789";

        assertTrue(car.rent(customerId1, rentDate, 3));
        assertFalse(car.rent(customerId2, rentDate, 3));
    }

    @Test
    public void testRentWhenUnderMaintenance() {
        Car car = new Car("C_123", 2020, "Toyota", "Corolla", 2, new VehicleType(5));
        DateTime rentDate = new DateTime(1, 1, 2023);
        String customerId = "C_456";

        assertFalse(car.rent(customerId, rentDate, 3));
    }

    @Test
    public void testReturnWhenNotRented() {
        Car car = new Car("C_123", 2020, "Toyota", "Corolla", 0, new VehicleType(5));
        DateTime returnDate = new DateTime(1, 1, 2023);

        assertFalse(car.returnVehicle(returnDate));
    }


}
