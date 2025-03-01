import code.Car;
import code.DateTime;
import code.VehicleType;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTypeTest {
    @Test
    public void testCarConstructor() {
        VehicleType carType = new VehicleType(5);
        assertNotNull(carType);
        assertEquals(5, carType.getCarSeats());
    }

    @Test
    public void testVanConstructor() {
        DateTime lastMaintenance = new DateTime(1, 1, 2023);
        VehicleType vanType = new VehicleType(15, lastMaintenance);
        assertNotNull(vanType);
        assertEquals(15, vanType.getSeats("van"));
        assertEquals(lastMaintenance, vanType.getLastMaintenance());
    }

    @Test
    public void testGetSeats() {
        VehicleType carType = new VehicleType(5);
        VehicleType vanType = new VehicleType(15, new DateTime(1, 1, 2023));
        assertEquals(5, carType.getSeats("car"));
        assertEquals(15, vanType.getSeats("van"));
    }

    @Test
    public void testGetCarSeats() {
        VehicleType carType = new VehicleType(5);
        assertEquals(5, carType.getCarSeats());
    }

    @Test
   public void testSetCarSeats() {
        VehicleType carType = new VehicleType(5);
        carType.setCarSeats(7);
        assertEquals(7, carType.getCarSeats());
    }

    @Test
    public void testGetLastMaintenance() {
        DateTime lastMaintenance = new DateTime(1, 1, 2023);
        VehicleType vanType = new VehicleType(15, lastMaintenance);
        assertEquals(lastMaintenance, vanType.getLastMaintenance());
    }

    @Test
    public void testSetLastMaintenance() {
        DateTime lastMaintenance = new DateTime(1, 1, 2023);
        VehicleType vanType = new VehicleType(15, lastMaintenance);
        DateTime newMaintenance = new DateTime(15, 1, 2023);
        vanType.setLastMaintenance(newMaintenance);
        assertEquals(newMaintenance, vanType.getLastMaintenance());
    }

    @Test
    public void testCanBeRentedForMinimumDays() {
        VehicleType carType = new VehicleType(5);
        VehicleType vanType = new VehicleType(15, new DateTime(1, 1, 2023));

        DateTime weekday = new DateTime(3, 4, 2023); // Monday
        DateTime weekend = new DateTime(1, 4, 2023); // Saturday

        assertEquals(2, carType.canBeRentedForMinimumDays(weekday, "car"));
        assertEquals(3, carType.canBeRentedForMinimumDays(weekend, "car"));
        assertEquals(1, vanType.canBeRentedForMinimumDays(weekday, "van"));
    }

    @Test
    public void testIsUnderMaintenanceForVan() {
        DateTime lastMaintenance = new DateTime(1, 1, 2023);
        VehicleType vanType = new VehicleType(15, lastMaintenance);

        DateTime rentDate2 = new DateTime(lastMaintenance, 13);

        assertTrue(vanType.IsUnderMaintenance(rentDate2, "van", 5));
    }
    @Test
    public void testIsUnderMaintenanceForCar() {
        DateTime lastMaintenance = new DateTime(1, 1, 2023);
        VehicleType carType = new VehicleType(5, lastMaintenance);

        DateTime rentDate2 = new DateTime(lastMaintenance, 13);

        assertTrue(carType.IsUnderMaintenance(rentDate2, "car", 5));
    }

}
