package za.ac.cput.kristenweek2task2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.BeforeClass;


public class ModTest extends TestCase
{
    BicycleGear bike = new BicycleGear("Nike", 4);
    Bicycle bicycle = new Bicycle("Blue", 2012, 3, 3), otherBike = new Bicycle();


    public ModTest( String testName )
    {
        super( testName );
    }


    public static Test suite()
    {
        return new TestSuite( ModTest.class );
    }


    public void testStopped()
    {
        assertTrue(bike.getStopped());
    }

    public void testName()
    {
        assertEquals("Nike", bike.getGearBrand());
    }

    public void testNotNull()
    {
        assertNotNull(bike.getNoGears());
    }

    public void testClasses()
    {
        assertNotSame(bike, bicycle);
    }

    public void testGears()
    {
        assertEquals(0, bike.getCurrentGear());
    }

    public void testNewBike()
    {
        assertEquals(2015, otherBike.getYear());
    }

    public void testDiffClass()
    {
        assertFalse(bicycle.equals(otherBike));
    }
}
