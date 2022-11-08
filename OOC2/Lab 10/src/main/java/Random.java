import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Random {

    ArrayList<Faculty> faculties;

    Faculty faculty1, faculty2, faculty3, faculty4, faculty5;

    Random(){
        faculty1 = new Faculty("Muazul Islam", "Lecturer", 200);
        faculty2 = new Faculty("Mamunur Rahman", "Ass. Prof", 10000);
        faculty3 = new Faculty("Tahlil", "Lecturer", 2500);
        faculty4 = new Faculty("Mamunur Rahman", "Ass. Prof", 10000);
        faculty5 = new Faculty("Biroho", "Prof", 1500);

        faculties = new ArrayList<>(Arrays.asList(faculty1, faculty2, faculty3, faculty4, faculty5));

    }

    public ArrayList<Faculty> removeLowSalaries(){
        ArrayList<Faculty> faculties2 = new ArrayList<>();
        faculties.forEach((faculty) -> {
            if(faculty.salary <2000) faculties.remove(faculty);
        });

        return faculties;
    }

    public void print(){
        System.out.println(faculties);
    }


}
