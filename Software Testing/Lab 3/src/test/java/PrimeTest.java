import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.example.Math;
import static org.junit.Assert.assertThrows;
public class PrimeTest {
    @Test
    public void checkPrimeFor2(){
        Math math = new Math();

        assertTrue(math.isPrime(2));
    }

    @Test
    public void checkPrimeFor20(){
        Math math = new Math();

        assertFalse(math.isPrime(20));
    }

    @Test
    public void checkPrimeFor47(){
        Math math = new Math();
        assertTrue(math.isPrime(47));
    }

    @Test
    public void checkPrimefor933(){
        Math math = new Math();

        assertFalse(math.isPrime(933));
    }

    @Test
    public void checkPrimeForLong(){
        Math math = new Math();
        assertFalse(math.isPrime(1000000000000L ));
    }

    @Test
    public void checkPrimeFor2Point5(){
        Math math = new Math();
        assertThrows(IllegalArgumentException.class,()-> math.isPrime(2.5 ));
    }

    @Test
    public void checkPrimeFor1(){
        Math math = new Math();
        assertThrows(IllegalArgumentException.class,()-> math.isPrime(1 ));
    }

    @Test
    public void checkPrimeForNegative(){
        Math math = new Math();
        assertThrows(IllegalArgumentException.class,()-> math.isPrime(-14));
    }

    @Test
    public void checkPrimeFor1000000000001(){
        Math math = new Math();
        assertThrows(IllegalArgumentException.class,()-> math.isPrime(1000000000001L ));    }

}
