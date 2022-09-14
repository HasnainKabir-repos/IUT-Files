import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrinterTest {
    @Test
    public void Test1(){
        List<Person> p = new ArrayList<>();
        p.add(new Student("Kabir", "Dhaka", 20, "200042102"));
        p.add(new Faculty("M", "X", 50, "Lecturer"));
        p.print();
    }
}
