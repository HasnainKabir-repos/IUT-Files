package Task4;
import Task3.Calculator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractCalculatorTest {

    @Test
    public void Test1(){
        Class<Calculator> calculator = Calculator.class;
        assertFalse(Modifier.isAbstract(calculator.getModifiers()));
    }

}
