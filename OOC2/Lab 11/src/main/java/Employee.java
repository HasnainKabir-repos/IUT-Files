import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Employee {
    private int ID ;
    private String name ;
    private int experience ;

    private double salary;
    private int age;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee (String name ) {
        this . name = name ;
    }

    public void setID (int newID ) {
        this . ID = (int ) ( Math . random () * newID ) ;
    }
    public void setExperience ( Date joining ) {
        Calendar calendar = Calendar . getInstance ( Locale. US ) ;
        calendar . setTime ( joining ) ;
        LocalDateTime now = LocalDateTime . now () ;
        int years = now . getYear () - calendar . get ( Calendar . YEAR ) ;
        this . experience = years ;
    }
    @Override
    public String toString () {
         return  ID + "," + name + ',' + experience ;
    }


 }