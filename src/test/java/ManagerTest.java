import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {


    Manager manager;

    //    create a new employee instance of Manager for testing
    @Before
    public void setUp(){

        manager = new Manager("Pedram", 666, 50005, "Engineering");

    }


    @Test
    public void getName(){
        assertEquals("Pedram", manager.getName());

    }

    @Test
    public void getNiNumber(){
        assertEquals(666, manager.getNiNum());
    }

    @Test
    public void getSalary(){
        assertEquals(50005, manager.getSalary(), 0.01 );
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(51005, manager.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        assertEquals(500.05, manager.payBonus(), 0.01) ;

    }

    @Test
    public void canGetDeptName(){
        assertEquals("Engineering", manager.getDeptName());
    }



}
