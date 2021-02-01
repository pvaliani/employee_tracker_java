import Management.Manager;
import org.junit.Before;
import org.junit.Test;
import Staff.Employee;
import Management.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

//    create a new employee instance of Manager for testing
    @Before
    public void setUp(){

        employee = new Manager("Pedram", 666, 50005, "Engineering");

    }


    @Test
    public void getName(){
        assertEquals("Pedram", employee.getName());

    }



}
