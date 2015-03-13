package za.ac.cput.ac.za.test.Creational.FactoryMethod;

/**
 * Created by Michael on 13/03/2015.
 */
import org.junit.*;
import junit.framework.TestCase;
import za.ac.cput.ac.za.Creational.FactoryMethod.Car;
import za.ac.cput.ac.za.Creational.FactoryMethod.CarFactory;

public class TestM3 extends TestCase
{

    private Car ex;
    @Before
    public void setUp()
    {
        ex = CarFactory.createCar("BMW");
    }

    @Test
    public void testM3()
    {
        assertEquals("BMW M3",ex.getCar());
    }
}
