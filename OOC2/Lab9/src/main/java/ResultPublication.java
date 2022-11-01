import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ResultPublication {
    public List<Student> publish(List<Student> students, Comparator<Student> comp){

        Collections.sort(students, comp);

        for(Student c: students){
            System.out.println(c.toString()+"\n");
        }

        return students;
    }
}


