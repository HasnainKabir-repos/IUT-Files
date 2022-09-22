public class ContractualEmployee extends Employee{
    public ContractualEmployee(int baseSalary){
        super(baseSalary);
    }

    @Override
    public double yearlySalary(){
        return baseSalary*12;
    }

}
