import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FacultyTest {

    @Test
    public void MethodTest(){
        Course ooc = new Course(4201, "OOC", 3);
        Course ooc2 = new Course(4301, "OOC2", 3 );

        Faculty faculty1 = new Faculty("Muazul Islam", "Lecturer", 200, Arrays.asList(ooc, ooc2));


        Method[] methods = faculty1.getClass().getDeclaredMethods();

        for(Method method: methods){
            System.out.println(method.getName());
            assertTrue(method.isAnnotationPresent(DevelopmentHistoryWithReview.class));

        }
    }

    @Test
    public void ConstructorTest(){
        Course math = new Course(4341, "Linear", 3);
        Faculty faculty2 = new Faculty("Mamunur Rahman", "Ass. Prof", 10000);

        Constructor[] constructors = faculty2.getClass().getConstructors();

        for(Constructor constructor: constructors){
            assertTrue(constructor.isAnnotationPresent(DevelopmentHistoryWithReview.class));
        }

    }

    @Test
    public void ClassTest(){
        Course chem = new Course(1011, "Chemistry", 2);
        Course math = new Course(4341, "Linear", 3);

        Faculty teacher1 = new Faculty("Tahlil", "Lecturer", 2500, Arrays.asList(chem, math));

        Faculty teacher2 = new Faculty("Mamunur Rahman", "Ass. Prof", 10000);

        Class<?> clss = teacher1.getClass();

        assertTrue(clss.isAnnotationPresent(DevelopmentHistory.class));

        Class<?> clss2  = teacher2.getClass();


        assertTrue(clss2.isAnnotationPresent(DevelopmentHistory.class));

    }



}
