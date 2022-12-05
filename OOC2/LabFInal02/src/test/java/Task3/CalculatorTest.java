package Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void Test1(){
        Calculator calculator = new Calculator();

        double result = calculator.add(12.5, 13.2);
        assertEquals(result, 25.7);
    }

    @Test
    public void Test2(){
        Calculator calculator = new Calculator();

        double result = calculator.subtract(12.5, 10.5);
        assertEquals(result, 2);
    }

    @Test
    public void Test3(){
        Calculator calculator = new Calculator();

        double result = calculator.multiply(2.5, 3.0);
        assertEquals(result, 7.5);
    }

    @Test
    public void Test4(){
        Calculator calculator = new Calculator();

        double result = calculator.divide(10.0, 2.5);
        assertEquals(result, 4);
    }

}
