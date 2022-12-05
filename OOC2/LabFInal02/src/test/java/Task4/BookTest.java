package Task4;

import Task2.Book;
import Task2.RegularBook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    public void Test1(){
        Book book = new RegularBook();
        assertTrue(book instanceof Object);
    }
}
