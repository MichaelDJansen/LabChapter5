package za.ac.cput.ac.za.Creational.AbstractFactory;

import za.ac.cput.ac.za.Creational.FactoryMethod.CarFactory;

/**
 * Created by Michael on 13/03/2015.
 */
public class VehicleFactory
{
    public Object getVehicleFactory(String type)
    {
        if ("Car".equalsIgnoreCase(type))
        {
            return new CarFactory();
        }
        else
        {
            return new MotorcycleFactory();
        }
    }
}
