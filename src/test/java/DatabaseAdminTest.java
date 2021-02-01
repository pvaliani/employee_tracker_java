import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Me", 888, 40000 );
    }

    @Test
    public void getName(){
        assertEquals("Me", databaseAdmin.getName());

    }

    @Test
    public void getNiNumber(){
        assertEquals(888, databaseAdmin.getNiNum());
    }

    @Test
    public void getSalary(){
        assertEquals(40000, databaseAdmin.getSalary(), 0.01 );
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(41000, databaseAdmin.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        assertEquals(400, databaseAdmin.payBonus(), 0.01) ;

    }


}
