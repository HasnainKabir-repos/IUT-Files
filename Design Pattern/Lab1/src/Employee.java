
public class Employee extends Person{
    String office;
    int salary;
    MyDate hired;

    public int getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        System.out.println("Name: "+ name + " Class: Employee");
        return null;
    }
}
