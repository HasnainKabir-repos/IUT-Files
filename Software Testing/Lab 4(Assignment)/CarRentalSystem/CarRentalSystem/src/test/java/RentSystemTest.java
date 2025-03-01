import code.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
public class RentSystemTest {
    @Test
    public void testAddCar() {
        RentSystem system = new RentSystem();
        String input = "car\n2020\nToyota\nCamry\nC_123\n4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        system.add(new Scanner(System.in));
        assertNotNull(system.cars[0]);
        assertEquals("C_123", system.cars[0].getVehicleId());
    }

    @Test
    public void testAddVan() {
        RentSystem system = new RentSystem();
        String input = "van\n2019\nHonda\nOdyssey\nV_456\n01/01/2023\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        system.add(new Scanner(System.in));
        assertNotNull(system.vans[0]);
        assertEquals("V_456", system.vans[0].getVehicleId());
    }

    @Test
    public void testRentCar() {
        RentSystem system = new RentSystem();
        system.cars[0] = new Car("C_123", 2020, "Toyota", "Camry", 0, new VehicleType(5));
        String input = "C_123\nC_456\n01/01/2023\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        system.rent(new Scanner(System.in));
        assertEquals(1, system.cars[0].vehicleStatus);
    }

    @Test
    public void testRentVan() {
        RentSystem system = new RentSystem();
        system.vans[0] = new Van("V_456", 2019, "Honda", "Odyssey", 0, new VehicleType(15, new DateTime(1, 1, 2023)));
        String input = "V_456\nC_789\n02/01/2023\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        system.rent(new Scanner(System.in));
        assertEquals(1, system.vans[0].vehicleStatus);
    }

    @Test
    public void testReturnCar() {
        RentSystem system = new RentSystem();
        system.cars[0] = new Car("C_123", 2020, "Toyota", "Camry", 1, new VehicleType(5));
        system.cars[0].rent("C_456", new DateTime(1, 1, 2023), 3);
        String input = "C_123\n04/01/2023\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        system.returnCar(new Scanner(System.in));
        assertEquals(0, system.cars[0].vehicleStatus);
    }

    @Test
    public  void testReturnVan() {
        RentSystem system = new RentSystem();
        system.vans[0] = new Van("V_456", 2019, "Honda", "Odyssey", 1, new VehicleType(15, new DateTime(1, 1, 2023)));
        system.vans[0].rent("C_789", new DateTime(2, 1, 2023), 5);
        String input = "V_456\n07/01/2023\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        system.returnCar(new Scanner(System.in));
        assertEquals(0, system.vans[0].vehicleStatus);
    }

    @Test
    public void testVehicleMaintenance() {
        RentSystem system = new RentSystem();
        system.cars[0] = new Car("C_123", 2020, "Toyota", "Camry", 0, new VehicleType(5));
        String input = "C_123\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        system.vehicleMaintenance(new Scanner(System.in));
        assertEquals(0, system.cars[0].vehicleStatus);
    }

    @Test
    public void testCompleteMaintenance() {
        RentSystem system = new RentSystem();
        system.vans[0] = new Van("V_456", 2019, "Honda", "Odyssey", 2, new VehicleType(15, new DateTime(1, 1, 2023)));
        String input = "V_456\n13/01/2023\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        system.completeMaintenance(new Scanner(System.in));
        assertEquals(2, system.vans[0].vehicleStatus);
    }

    @Test
    public void testGetDetails() {
        RentSystem system = new RentSystem();
        system.cars[0] = new Car("C_123", 2020, "Toyota", "Camry", 0, new VehicleType(5));
        system.vans[0] = new Van("V_456", 2019, "Honda", "Odyssey", 0, new VehicleType(15, new DateTime(1, 1, 2023)));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        system.getDetails();
        String expectedOutput = "***********Cars**********\n" + system.cars[0].getDetails() +
                "\n***********Vans**********\n" + system.vans[0].getDetails();
        assertEquals(expectedOutput, outContent.toString());
    }

}
