import org.junit.Before;
import org.junit.Test;
import Management.Director;
import Management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {


    Director director;

    @Before
    public void setUp(){
        director = new Director("Kevin Bridges", 999, 1000000, 2000 );
    }

    @Test
    public void getName(){
        assertEquals("Kevin Bridges", director.getName());

    }

    @Test
    public void getNiNumber(){
        assertEquals(999, director.getNiNum());
    }

    @Test
    public void getSalary(){
        assertEquals(1000000, director.getSalary(), 0.01 );
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(1001000, director.getSalary(), 0.01);

    }

    @Test
    public void canPayBonus(){
        assertEquals(20000, director.payBonus(), 0.01) ;

    }
}
