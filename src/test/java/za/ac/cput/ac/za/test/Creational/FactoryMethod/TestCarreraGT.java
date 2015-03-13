package za.ac.cput.ac.za.test.Creational.FactoryMethod;

/**
 * Created by Michael on 13/03/2015.
*/
 import org.junit.*;
 import junit.framework.TestCase;
 import za.ac.cput.ac.za.Creational.FactoryMethod.Car;
 import za.ac.cput.ac.za.Creational.FactoryMethod.CarFactory;

public class TestCarreraGT extends TestCase
{

    private Car ex;
    @Before
    public void setUp()
    {
        ex = CarFactory.createCar("Porsche");
    }

    @Test
    public void testCarreraGT()
    {
        assertEquals("Porsche Carrera GT",ex.getCar());
    }
}
