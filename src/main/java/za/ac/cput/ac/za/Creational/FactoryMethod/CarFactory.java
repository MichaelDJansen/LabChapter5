package za.ac.cput.ac.za.Creational.FactoryMethod;

/**
 * Created by Michael on 13/03/2015.
 */
public class CarFactory
{
    public static Car createCar (String car)
    {
        if (car. equalsIgnoreCase ("BMW"))
        {
            return new M3();
        }
        else if(car. equalsIgnoreCase ("Porsche"))
        {
            return new CarreraGT();
        }
        else
            throw new IllegalArgumentException("No such Brand");
    }
}
