package za.ac.cput.ac.za.test.Creational.Singleton;

/**
 * Created by Michael on 13/03/2015.
 */
import org.junit.*;
import junit.framework.TestCase;

import za.ac.cput.ac.za.Creational.Singleton.DatabaseConnSingleton;

public class TestSingleton extends TestCase
{
    DatabaseConnSingleton dcs;

    @Before
    public void setUp()
    {
        dcs = dcs.getInstance();
    }

    @Test
    public void testSingleton()
    {
        assertEquals("Connected",dcs.connect());
        assertEquals("Disconnected",dcs.disconnect());
    }
}
