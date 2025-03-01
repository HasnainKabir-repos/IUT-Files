import code.Car;
import code.DateTime;
import code.RentalRecord;
import code.VehicleType;
import org.junit.Test;

import static org.junit.Assert.*;


public class RentalRecordTest {


    @Test
    public void testToStringNoData() {
        RentalRecord record = new RentalRecord("R_123", new DateTime(1, 1, 2023), new DateTime(5, 1, 2023));
        String expectedString = "R_123:01/01/2023:05/01/2023:none:none:none";
        assertEquals(expectedString, record.toString());
    }

    @Test
    public void testToStringWithData() {
        RentalRecord record = new RentalRecord("R_123", new DateTime(1, 1, 2023), new DateTime(5, 1, 2023));
        DateTime actualReturn = new DateTime(7, 1, 2023);
        double rentalFee = 200.0;
        double lateFee = 50.0;
        record.setData(actualReturn, rentalFee, lateFee);
        String expectedString = "R_123:01/01/2023:05/01/2023:07/01/2023:200.0:50.0";
        assertEquals(expectedString, record.toString());
    }

    @Test
    public void testGetDetailsNoData() {
        RentalRecord record = new RentalRecord("R_123", new DateTime(1, 1, 2023), new DateTime(5, 1, 2023));
        String expectedDetails = "Record ID:             R_123\nRent Date:             01/01/2023\nEstimated Return Date: 05/01/2023";
        assertEquals(expectedDetails, record.getDetails());
    }

    @Test
    public void testGetDetailsWithData() {
        RentalRecord record = new RentalRecord("R_123", new DateTime(1, 1, 2023), new DateTime(5, 1, 2023));
        DateTime actualReturn = new DateTime(7, 1, 2023);
        double rentalFee = 200.0;
        double lateFee = 50.0;
        record.setData(actualReturn, rentalFee, lateFee);
        String expectedDetails = "Record ID:             R_123\nRent Date:             01/01/2023\nEstimated Return Date: 05/01/2023\nActual Return Date:    07/01/2023\nRental Fee:            200.00\nLate Fee:              50.00";
        assertEquals(expectedDetails, record.getDetails());
    }

    @Test
    public void testFormatting() {
        RentalRecord record = new RentalRecord("R_123", new DateTime(1, 1, 2023), new DateTime(5, 1, 2023));
        DateTime actualReturn = new DateTime(7, 1, 2023);
        double rentalFee = 200.123456;
        double lateFee = 50.789012;
        record.setData(actualReturn, rentalFee, lateFee);
        String expectedDetails = "Record ID:             R_123\nRent Date:             01/01/2023\nEstimated Return Date: 05/01/2023\nActual Return Date:    07/01/2023\nRental Fee:            200.12\nLate Fee:              50.79";
        assertEquals(expectedDetails, record.getDetails());
    }

}