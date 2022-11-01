import java.util.ArrayList;
import java.util.List;

public class StudentEnrollment {
    List<Student> students = new ArrayList<>();

    public void remove(String studentId){
        for(Student s: students){
            if(s.getStudentId().equals(studentId)){
                students.remove(s);
                return;
            }
        }
    }

    public void remove(Student student){
        students.remove(student);
    }

    public void Add(Student student){
        students.add(student);
    }

    public List<Student> getAll(){
        return students;
    }

    public void print(){
        for(Student s: students){
            System.out.println(s.getStudentId()+"\n");
        }
    }
}
