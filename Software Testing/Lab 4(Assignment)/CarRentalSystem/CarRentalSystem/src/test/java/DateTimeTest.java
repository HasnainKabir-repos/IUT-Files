import code.DateTime;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DateTimeTest {
    @Test
    public void testGetTime() {
        DateTime dt = new DateTime();
        assertNotNull(dt.getTime());
    }

    @Test
    public void testGetNameOfDay() {
        DateTime dt = new DateTime(1, 1, 2023);
        assertEquals("Sunday", dt.getNameOfDay());
    }

    @Test
    public void testToString() {
        DateTime dt = new DateTime(1, 1, 2023);
        assertEquals("01/01/2023", dt.toString());
    }

    @Test
    public void testGetFormattedDate() {
        DateTime dt = new DateTime(1, 1, 2023);
        assertEquals("01/01/2023", dt.getFormattedDate());
    }

    @Test
    public void testGetEightDigitDate() {
        DateTime dt = new DateTime(1, 1, 2023);
        assertEquals("01012023", dt.getEightDigitDate());
    }

    @Test
    public void testDiffDays() {
        DateTime startDate = new DateTime(1, 1, 2023);
        DateTime endDate = new DateTime(5, 1, 2023);
        int diffDays = DateTime.diffDays(endDate, startDate);
        assertEquals(4, diffDays);
    }

}
