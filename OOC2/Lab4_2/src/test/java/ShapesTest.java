import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShapesTest {

    @Test
    public void TestShape(){
        List<Shape> shapes = Arrays.asList(
                new Circle(),
                new Circle(),
                new Circle(),
                new Square(),
                new Square()
        );
        for(Shape shape: shapes){
            shape.draw();
            assertTrue(shape instanceof Shape);
        }
    }
}
