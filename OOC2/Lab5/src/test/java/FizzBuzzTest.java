import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {

    @Test
    public void FizzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void BuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(5);
        assertEquals("Buzz", result);
    }


    @Test
    public void FizzBuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void BoomTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getFizzBuzz(4);
        assertEquals("Boom", result);
    }
}
