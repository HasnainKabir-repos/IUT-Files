import code.Car;
import code.DateTime;
import code.Vehicle;
import code.VehicleType;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void testGetVehicleId() {
        Vehicle vehicle = new Vehicle("V_123", 2020, "Toyota", "Sienna", 0, new VehicleType(15, new DateTime(1, 1, 2023)));
        assertEquals("V_123", vehicle.getVehicleId());
    }

    @Test
    public void testRent() {
        Vehicle vehicle = new Vehicle("V_123", 2020, "Toyota", "Sienna", 0, new VehicleType(15, new DateTime(1, 1, 2023)));
        DateTime rentDate = new DateTime(1, 1, 2023);
        String customerId = "C_456";

        assertTrue(vehicle.rent(customerId, rentDate, 5));
        assertFalse(vehicle.rent(customerId, rentDate, 0));
        assertFalse(vehicle.rent(customerId, rentDate, 15));
        assertFalse(vehicle.rent(customerId, rentDate, 5));
    }

    @Test
    public void testPerformMaintenance() {
        Vehicle vehicle = new Vehicle("V_123", 2020, "Toyota", "Sienna", 0, new VehicleType(15, new DateTime(1, 1, 2023)));

        assertTrue(vehicle.performMaintenance());
        vehicle.vehicleStatus = 1;
        assertFalse(vehicle.performMaintenance());
        vehicle.vehicleStatus = 2;
        assertFalse(vehicle.performMaintenance());
    }

    @Test
    public void testToString() {
        Vehicle car = new Vehicle("C_123", 2020, "Toyota", "Corolla", 0, new VehicleType(5));
        Vehicle van = new Vehicle("V_456", 2018, "Honda", "Odyssey", 1, new VehicleType(7, new DateTime(1, 1, 2023)));

        assertEquals("C_123:2020:Toyota:Corolla:5:Available", car.toString());
        assertEquals("V_456:2018:Honda:Odyssey:15:Rented", van.toString());
    }

    @Test
    public void testGetDetails() {
        Vehicle car = new Vehicle("C_123", 2020, "Toyota", "Corolla", 0, new VehicleType(5));
        Vehicle van = new Vehicle("V_456", 2018, "Honda", "Odyssey", 1, new VehicleType(7, new DateTime(1, 1, 2023)));

        String expectedCarDetails = "Vehicle ID:\tC_123\n Year:\t 2020\n Make:\tToyota\n Model:\tCorolla\n Number of Seats:\t5\n Status:\tAvailable";
        String expectedVanDetails = "Vehicle ID:\tV_456\n Year:\t 2018\n Make:\tHonda\n Model:\tOdyssey\n Number of Seats:\t7\n Status:\tRented";

        assertEquals(expectedCarDetails, car.getDetails());
        assertEquals(expectedVanDetails, van.getDetails());
    }

    @Test
    public void testGetLastElementIndex() {
        Vehicle vehicle = new Vehicle("V_123", 2020, "Toyota", "Sienna", 0, new VehicleType(15, new DateTime(1, 1, 2023)));
        DateTime rentDate = new DateTime(1, 1, 2023);
        String customerId = "C_456";

        assertEquals(-1, vehicle.getLastElementIndex());
        vehicle.rent(customerId, rentDate, 5);
        assertEquals(0, vehicle.getLastElementIndex());
    }

    @Test
    public void testRentInvalidDays() {
        Vehicle vehicle = new Vehicle("V_123", 2020, "Toyota", "Sienna", 0, new VehicleType(15, new DateTime(1, 1, 2023)));
        DateTime rentDate = new DateTime(1, 1, 2023);
        String customerId = "C_456";

        assertFalse(vehicle.rent(customerId, rentDate, 0));
        assertFalse(vehicle.rent(customerId, rentDate, 15));
    }

    @Test
    public void testPerformMaintenanceWhenRented() {
        Vehicle vehicle = new Vehicle("V_123", 2020, "Toyota", "Sienna", 1, new VehicleType(15, new DateTime(1, 1, 2023)));

        assertFalse(vehicle.performMaintenance());
    }

    @Test
    public void testRentVanUnderMaintenance() {
        DateTime lastMaintenance = new DateTime(1, 1, 2023);
        VehicleType vanType = new VehicleType(15, lastMaintenance);
        Vehicle van = new Vehicle("V_123", 2020, "Toyota", "Sienna", 0, vanType);
        DateTime rentDate = new DateTime(lastMaintenance, 13);
        String customerId = "C_456";

        assertFalse(van.rent(customerId, rentDate, 5));
    }
}