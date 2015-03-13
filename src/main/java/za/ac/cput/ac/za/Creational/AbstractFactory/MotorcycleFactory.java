package za.ac.cput.ac.za.Creational.AbstractFactory;

/**
 * Created by Michael on 13/03/2015.
 */
public class MotorcycleFactory
{
    public static Motorcycle createMotorcycle (String car)
    {
        if (car. equalsIgnoreCase ("Kawasaki"))
        {
            return new Ninja();
        }
        else if(car. equalsIgnoreCase ("Suzuki"))
        {
            return new Hayabusa();
        }
        else
            throw new IllegalArgumentException("No such Brand");
    }
}
