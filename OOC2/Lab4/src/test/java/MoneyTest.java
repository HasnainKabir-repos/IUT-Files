import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    public void TestMultiplication(){
        Dollar dollar = new Dollar(5);
        dollar.times(2);
        Dollar product = dollar.times(2);
        assertEquals(10,product.amount);
        product = dollar.times(3);
        assertEquals(15,product.amount);
    }

    @Test
    public void TestEquality(){
        //DOLLAR
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(10)));


    }

    @Test
    public void FrancTestMultiply(){
        Franc franc = new Franc(5);
        franc.times(2);
        Franc product = franc.times(2);
        assertEquals(10,product.amount);
    }

    @Test
    public void FrancTestEquality(){
        //FRANC
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(10)));
    }
}
