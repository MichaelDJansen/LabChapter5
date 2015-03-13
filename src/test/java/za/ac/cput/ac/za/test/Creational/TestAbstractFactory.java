package za.ac.cput.ac.za.test.Creational;

/**
 * Created by Michael on 13/03/2015.
 */
import org.junit.*;
import junit.framework.TestCase;
import za.ac.cput.ac.za.Creational.AbstractFactory.Motorcycle;
import za.ac.cput.ac.za.Creational.AbstractFactory.VehicleFactory;
import za.ac.cput.ac.za.Creational.FactoryMethod.Car;
import za.ac.cput.ac.za.Creational.FactoryMethod.CarFactory;

public class TestAbstractFactory extends TestCase
{

    private Car car1,car2;
    private Motorcycle m1,m2;

    @Before
    public void setUp()
    {
        car1 = CarFactory.createCar("Porsche");
        car2 = CarFactory.createCar("BMW");
    }

    @Test
    public void testAbstractFactory()
    {
        assertEquals("Porsche Carrera GT", car1.getCar());
        assertEquals("BMW M3",car2.getCar());

    }
}
