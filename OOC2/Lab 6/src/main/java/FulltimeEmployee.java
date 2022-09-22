public class FulltimeEmployee extends Employee{
    public FulltimeEmployee(int baseSalary, int daysWorked){
        super(baseSalary, daysWorked);
    }

    @Override
    public double yearlySalary(){
        return 12* (baseSalary + baseSalary * 0.6 + baseSalary * 1.2);
    }

    @Override
    public double yearlyLeaves(){
        return 10 + daysWorked* 0.5;
    }


}
