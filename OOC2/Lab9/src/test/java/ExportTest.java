import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ExportTest {
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

        Exporter exporter = new Exporter();
        exporter.export(students);
    }

    @Test
    public void Test1() throws InvalidStudentIdException {
        createStudentList();


    }
}
