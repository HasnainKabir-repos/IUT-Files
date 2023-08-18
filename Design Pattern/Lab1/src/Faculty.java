public class Faculty extends Employee{
    String office_hours;
    String rank;

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString(){
        System.out.println("Name: "+ name + " Class: Faculty");
        return null;
    }
}
