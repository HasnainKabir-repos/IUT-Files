public class Employee {

    protected int baseSalary;
    protected int daysWorked;

    public Employee(int baseSalary,int daysWorked){
        this.baseSalary = baseSalary;
        this.daysWorked = daysWorked;
    }

    public Employee(){

    }

    public Employee(int baseSalary){
        this.baseSalary = baseSalary;
    }

    public double yearlySalary(){
        return 12* (daysWorked * baseSalary/22);
    }

    public double yearlyLeaves(){
        return 15;
    }
}
