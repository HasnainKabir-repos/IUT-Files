import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class IntegerTest {
    @Test
    public void Test1(){
        List<Integer> l = Arrays.asList(2, 3, 5, 6);

        OddNumber odd = new OddNumber();
        Algorithm algorithm = new Algorithm();
        int oddCount = algorithm.countIf(l, odd);

        assertEquals(2, oddCount);
    }

    @Test
    public void Test2(){
        List<Integer> l = Arrays.asList(2, 3, 16, 6);

        EvenNumber even = new EvenNumber();
        Algorithm algorithm = new Algorithm();
        int oddCount = algorithm.countIf(l, even);

        assertEquals(3, oddCount);
    }
}
