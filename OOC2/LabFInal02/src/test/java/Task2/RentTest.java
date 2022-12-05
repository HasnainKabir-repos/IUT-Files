package Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RentTest {

    @Test
    public void Test1(){
        RegularBook book = new RegularBook();
        RentService service = new RentService();
        double rent  = service.RentCalculator(book.getType(), 1000, 4);

        assertEquals(rent, 1000);
    }


    @Test
    public void Test2(){
        RegularBook book = new RegularBook();
        RentService service = new RentService();
        double rent  = service.RentCalculator(book.getType(), 1000, 8);

        assertEquals(rent, 3200);
    }


    @Test
    public void Test3(){
        KidsBook book = new KidsBook();
        RentService service = new RentService();
        double rent  = service.RentCalculator(book.getType(), 1000, 9);

        assertEquals(rent, 7200);
    }

    @Test
    public void Test4(){
        NewBook book = new NewBook();
        RentService service = new RentService();
        double rent  = service.RentCalculator(book.getType(), 1000, 9);

        assertEquals(rent, 10400);
    }

    @Test
    public void Test5(){
        KidsBook book = new KidsBook();
        RentService service = new RentService();
        double rent  = service.RentCalculator(book.getType(), 1000, 4);

        assertEquals(rent, 1000);
    }

    @Test
    public void Test6(){
        NewBook book = new NewBook();
        RentService service = new RentService();
        double rent  = service.RentCalculator(book.getType(), 1000, 4);

        assertEquals(rent, 1000);
    }

}
