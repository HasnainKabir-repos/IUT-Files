import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDB {
    List<Employee> employees = new ArrayList<>();
    public void save(Employee employee){
        FileWriter fw = null;

        try{
            fw = new FileWriter("F:\\IUT-Files\\OOC2\\Lab 11\\src\\main\\resources\\myFile.txt", true);
            fw.write(employee.toString() + "\n");
        }catch (IOException e ){
            e.printStackTrace();
        }finally {
            try{
                fw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void anotherSave(){
        try{
            Files.write(Paths.get("myFile.txt"), "the text".getBytes(),
                    StandardOpenOption.APPEND);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void read(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("F:\\IUT-Files\\OOC2\\Lab 11\\src\\main\\resources\\myFile.txt"));
            String line = reader.readLine();

            while(line != null){
                String id = line.split(",")[0];
                String name = line.split(",")[1];

                line = reader.readLine();

                Employee employee = new Employee(name);
                employee.setID(Integer.parseInt(id));
                Date date = new Date();
                employee.setExperience(date);

                addEmployee(employee);

            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getList(){
        return employees;
    }

    public void addEmployee(Employee employee){ //impure function
        employees.add(employee);
    }

    public List<Employee> ageFilter(int age){ //pure function
        List<Employee> filteredEmployees = employees.stream().filter(
                employee -> employee.getAge() == age).collect(Collectors.toList());
        return filteredEmployees;
    }

    public List<Employee> salaryFilter(double salary){ //pure function
        List<Employee> filteredEmployees = employees.stream().filter(
                employee -> employee.getSalary() >= salary).collect(Collectors.toList());

        return filteredEmployees;
    }

    public void incrementMapper(int increment){ //impure function
        employees.stream().map(s -> s.getSalary() * increment /100 + s.getSalary()).collect(Collectors.toList());
        System.out.println(employees);
    }

    public double totalSalaryofFilteredEmployees(int minimumSalary){ //pure function
        List<Employee> filteredEmployees = employees.stream().filter(
                employee -> employee.getSalary() >= minimumSalary).collect(Collectors.toList());

        return filteredEmployees.stream().mapToDouble(Employee::getSalary).sum();
    }

    public static void main(String[] args){
        EmployeeDB db = new EmployeeDB();
        Employee employee = new Employee("Chasha");
        employee.setID(23);
        Date date = new Date();
        employee.setExperience(date);
        db.save(employee);
        db.read();

    }
}
