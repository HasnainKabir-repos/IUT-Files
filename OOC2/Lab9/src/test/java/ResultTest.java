import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResultTest {

    List<Student> students;

    void createStudentList() throws InvalidStudentIdException {
        students = new ArrayList<>();
        Student student1 = new Student("200042102", "Kabir", 3.76f);
        Student student2 = new Student("200042116", "Mamun", 3.81f);
        Student student3 = new Student("200042170", "Mukit", 3.8f);
        Student student4 = new Student("200042158", "Tahlil", 3.9f);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

    }

    @Test
    public void Test1() throws InvalidStudentIdException {
        StudentEnrollment std = new StudentEnrollment();

        Student student1 = new Student("200042102", "Kabir", 3.76f);
        Student student2 = new Student("200042116", "Mamun", 3.81f);
        Student student3 = new Student("200042170", "Mukit", 3.8f);
        Student student4 = new Student("200042158", "Tahlil", 3.9f);

        std.Add(student1);
        std.Add(student2);
        std.Add(student3);
        std.Add(student4);

        createStudentList();

        ResultPublication result = new ResultPublication();
        assertEquals(result.publish(students, Student.orderById), result.publish(std.getAll(), Student.orderById));

    }

    @Test
    public void Test2() throws InvalidStudentIdException {
        StudentEnrollment std = new StudentEnrollment();

        Student student1 = new Student("200042102", "Kabir", 3.76f);
        Student student2 = new Student("200042116", "Mamun", 3.81f);
        Student student3 = new Student("200042170", "Mukit", 3.8f);
        Student student4 = new Student("200042158", "Tahlil", 3.9f);

        std.Add(student1);
        std.Add(student2);
        std.Add(student3);
        std.Add(student4);

        createStudentList();

        ResultPublication result = new ResultPublication();
        assertEquals(result.publish(students, Student.orderByName), result.publish(std.getAll(), Student.orderByName));

    }

    @Test
    public void Test3() throws InvalidStudentIdException {
        StudentEnrollment std = new StudentEnrollment();

        Student student1 = new Student("200042102", "Kabir", 3.76f);
        Student student2 = new Student("200042116", "Mamun", 3.81f);
        Student student3 = new Student("200042170", "Mukit", 3.8f);
        Student student4 = new Student("200042158", "Tahlil", 3.9f);

        std.Add(student1);
        std.Add(student2);
        std.Add(student3);
        std.Add(student4);

        createStudentList();

        ResultPublication result = new ResultPublication();
        assertEquals(result.publish(students, Student.orderByIdAndCgpa), result.publish(std.getAll(), Student.orderByIdAndCgpa));

    }

    @Test
    public void Test4() throws InvalidStudentIdException {
        StudentEnrollment std = new StudentEnrollment();

        Student student1 = new Student("200042102", "Kabir", 3.76f);
        Student student2 = new Student("200042116", "Mamun", 3.81f);
        Student student3 = new Student("200042170", "Mukit", 3.8f);
        Student student4 = new Student("200042158", "Tahlil", 3.9f);

        std.Add(student1);
        std.Add(student2);
        std.Add(student3);
        std.Add(student4);

        createStudentList();

        ResultPublication result = new ResultPublication();
        assertEquals(result.publish(students, Student.orderByCgpa), result.publish(std.getAll(), Student.orderByCgpa));

    }
}
