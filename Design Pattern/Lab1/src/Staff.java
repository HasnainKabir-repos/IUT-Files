public class Staff extends Employee{
    String title;

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString(){
        System.out.println("Name: "+ name + " Class: Staff");
        return null;
    }
}
