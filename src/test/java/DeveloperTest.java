import org.junit.Before;
import org.junit.Test;
import Staff.Employee;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Michael Jackson", 777, 100000 );
    }

    @Test
    public void getName(){
        assertEquals("Michael Jackson", developer.getName());

    }

    @Test
    public void getNiNumber(){
        assertEquals(777, developer.getNiNum());
    }

    @Test
    public void getSalary(){
        assertEquals(100000, developer.getSalary(), 0.01 );
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(101000, developer.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, developer.payBonus(), 0.01) ;

    }



}
