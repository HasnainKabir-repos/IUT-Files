import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Exporter {
    public void export(List<Student> students){

        try{
            FileWriter file = new FileWriter("F:\\IUT-Files\\OOC2\\Lab9\\data.csv");
            PrintWriter write = new PrintWriter(file);
            for (Student student: students){

                String row = student.getStudentId()+","+student.getName()+","+student.getCgpa();
                write.println(row);
            }
            write.close();
        }
        catch(IOException exe){
            System.out.println("Cannot create file");
        }
    }
}
