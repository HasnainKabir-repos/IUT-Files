import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void Test1(){
        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(20000, 12);

        assertEquals(672000, fulltimeEmployee.yearlySalary());
        assertEquals(16, fulltimeEmployee.yearlyLeaves());
    }

    @Test
    public void Test2(){
        ContractualEmployee contractualEmployee = new ContractualEmployee(20000);

        assertEquals(240000, contractualEmployee.yearlySalary());

    }
    @Test
    public void Test3(){
        ParttimeEmployee parttimeEmployee = new ParttimeEmployee();

        assertEquals(0, parttimeEmployee.yearlySalary());

    }

    @Test
    public void Test4(){
        ParttimeEmployee parttimeEmployee = new ParttimeEmployee();

        assertTrue(parttimeEmployee instanceof Employee);
        assertFalse(parttimeEmployee instanceof NumberInterface<?>);

    }
}
