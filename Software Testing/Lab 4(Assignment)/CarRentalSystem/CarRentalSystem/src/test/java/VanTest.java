import code.DateTime;
import code.Van;
import code.VehicleType;
import org.junit.Test;

import static org.junit.Assert.*;

public class VanTest {
    @Test
    public void testConstructor() {
        Van van = new Van("V_123", 2020, "Toyota", "Sienna", 0, new VehicleType(15, new DateTime(1, 1, 2023)));
        assertNotNull(van);
        assertEquals("V_123", van.getVehicleId());
    }

    @Test
    public void testGetLateFee() {
        Van van = new Van("V_123", 2020, "Toyota", "Sienna", 0, new VehicleType(15, new DateTime(1, 1, 2023)));
        DateTime rentDate = new DateTime(1, 1, 2023);
        DateTime onTime = new DateTime(rentDate, 3);
        DateTime late = new DateTime(rentDate, 5);

        assertEquals(0, van.getLateFee(onTime, rentDate), 0.01);
        assertTrue(van.getLateFee(late, rentDate) > 0);
    }

    @Test
    public void testReturnVehicle() {
        Van van = new Van("V_123", 2020, "Toyota", "Sienna", 1, new VehicleType(15, new DateTime(1, 1, 2023)));
        van.rent("C_456", new DateTime(1, 1, 2023), 5);
        DateTime onTime = new DateTime(6, 1, 2023);
        DateTime early = new DateTime(4, 1, 2023);

        assertTrue(van.returnVehicle(onTime));
        assertFalse(van.returnVehicle(early));
        assertEquals(0, van.vehicleStatus);
    }

    @Test
    public void testCompleteMaintenance() {
        DateTime lastMaintenance = new DateTime(1, 1, 2023);
        Van van = new Van("V_123", 2020, "Toyota", "Sienna", 2, new VehicleType(15, lastMaintenance));
        DateTime validDate = new DateTime(lastMaintenance, 12);
        DateTime invalidDate = new DateTime(lastMaintenance, 11);

        assertTrue(van.completeMaintenance(validDate));
        assertFalse(van.completeMaintenance(invalidDate));
    }

    @Test
    public void testToString() {
        DateTime lastMaintenance = new DateTime(1, 1, 2023);
        Van van = new Van("V_123", 2020, "Toyota", "Sienna", 0, new VehicleType(15, lastMaintenance));
        String expected = "V_123:2020:Toyota:Sienna:15:Available:" + lastMaintenance.toString();
        assertEquals(expected, van.toString());
    }

    @Test
    public void testGetDetails() {
        DateTime lastMaintenance = new DateTime(1, 1, 2023);
        Van van = new Van("V_123", 2020, "Toyota", "Sienna", 0, new VehicleType(15, lastMaintenance));
        String expected = "Vehicle ID:\tV_123\n Year:\t 2020\n Make:\tToyota\n Model:\tSienna\n Number of Seats:\t15\n Status:\tAvailable\nLast maintenance date:\t01/01/2023\nRENTAL RECORD:\tempty";
        assertEquals(expected, van.getDetails());
    }

    @Test
    public void testGetDetailsWithRentalRecord() {
        DateTime lastMaintenance = new DateTime(1, 1, 2023);
        Van van = new Van("V_123", 2020, "Toyota", "Sienna", 1, new VehicleType(15, lastMaintenance));
        van.rent("C_456", new DateTime(2, 1, 2023), 5);
        van.returnVehicle(new DateTime(7, 1, 2023));
        String expected = "Vehicle ID:\tV_123\n Year:\t 2020\n Make:\tToyota\n Model:\tSienna\n Number of Seats:\t15\n Status:\tAvailable\nLast maintenance date:\t01/01/2023\nRENTAL RECORD:\n" +
                "Record ID:             V_123_C_456_02012023\nRent Date:             02/01/2023\nEstimated Return Date: 07/01/2023\nActual Return Date:    07/01/2023\nRental Fee:            1175.00\nLate Fee:              0.00" +
                "----------\n";
        assertEquals(expected, van.getDetails());
    }

    @Test
    public void testGetLateFeeNoLateFee() {
        Van van = new Van("V_123", 2020, "Toyota", "Sienna", 0, new VehicleType(15, new DateTime(1, 1, 2023)));
        DateTime rentDate = new DateTime(1, 1, 2023);
        DateTime onTime = new DateTime(rentDate, 3);
        assertEquals(0, van.getLateFee(onTime, rentDate), 0.01);
    }

    @Test
    public void testReturnVehicleEarly() {
        Van van = new Van("V_123", 2020, "Toyota", "Sienna", 1, new VehicleType(15, new DateTime(1, 1, 2023)));
        van.rent("C_456", new DateTime(1, 1, 2023), 5);
        DateTime early = new DateTime(4, 1, 2023);
        assertFalse(van.returnVehicle(early));
    }
}
