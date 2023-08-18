public class PartTime extends Staff{
    int rate;
    int hours;

    @Override
    public int getSalary(){
        super.salary = rate*hours;
        return salary;
    }

    @Override
    public String toString(){
        System.out.println("Name: "+ name + " Class: Staff");
        return null;
    }
}
