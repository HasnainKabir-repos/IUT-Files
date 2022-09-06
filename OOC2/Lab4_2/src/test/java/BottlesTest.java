import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BottlesTest {
    @Test
    public void TestOfOneBottle(){
        Bottles bottles = new Bottles();
        String verse = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n";

        assertEquals(verse, bottles.verse(1));
    }

    @Test
    public void TestOfTwoBottles(){
        Bottles bottles = new Bottles();
        String verse = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n";

        assertEquals(verse, bottles.verse(2));
    }

    @Test
    public void TestOfBottles(){
        int number = 10;
        Bottles bottles = new Bottles();

        String verse = number+" bottles of beer on the wall, "+number+" bottles of beer.\n" +
                "Take one down and pass it around, "+(number-1)+" bottles of beer on the wall.\n";

        assertEquals(verse, bottles.verse(number));
    }
}
