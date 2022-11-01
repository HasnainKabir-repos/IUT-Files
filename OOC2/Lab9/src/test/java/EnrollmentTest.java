import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentTest {


    @Test
    public void Test1() throws InvalidStudentIdException {
        Student student = new Student("200042102", "Kabir",3.76f );
        StudentEnrollment std = new StudentEnrollment();
        std.Add(student);

        List<Student> students = new ArrayList<>();
        students.add(student);

        assertEquals(students, std.getAll());
    }

    @Test
    public void Test3() throws InvalidStudentIdException {
        Student student = new Student("200042102", "Kabir",3.76f );
        StudentEnrollment std = new StudentEnrollment();
        std.remove(student);

        List<Student> students = new ArrayList<>();

        assertEquals(students, std.getAll());
    }

    @Test
    public void Test4() throws InvalidStudentIdException {
        Student student = new Student("200042116", "Mamun",3.81f );
        StudentEnrollment std = new StudentEnrollment();
        std.Add(student);

        List<Student> students = new ArrayList<>();
        students.add(student);

        std.remove("200042116");
        students.remove(student);

        assertEquals(students, std.getAll());
    }

    @Test
    public void Test2() throws InvalidStudentIdException {
        Student student = new Student("2000421023", "Kabir",3.76f );
        StudentEnrollment std = new StudentEnrollment();
        std.Add(student);

        List<Student> students = new ArrayList<>();
        students.add(student);

        assertFalse(std.getAll() == students);
    }
}
