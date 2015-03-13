package za.ac.cput.ac.za.test.Creational.FactoryMethod;

/**
 * Created by Michael on 13/03/2015.
 */
import org.junit.*;
import junit.framework.TestCase;
import za.ac.cput.ac.za.Creational.FactoryMethod.Car;
import za.ac.cput.ac.za.Creational.FactoryMethod.CarFactory;

public class TestFactoryMethod extends TestCase
{

    private Car car1,car2;
    @Before
    public void setUp()
    {
        car1 = CarFactory.createCar("Porsche");
        car2 = CarFactory.createCar("BMW");
    }

    @Test
    public void testSingleton()
    {
        assertEquals("Porsche Carrera GT", car1.getCar());
        assertEquals("BMW M3",car2.getCar());

    }
}
