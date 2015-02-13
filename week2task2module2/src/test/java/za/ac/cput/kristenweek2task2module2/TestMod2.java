package za.ac.cput.kristenweek2task2module2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestMod2 extends TestCase
{
    Child kid = new Child(), kid2 = new Child("Paul", 7, 20);
    RideTheBike rideTheBike = new RideTheBike();


    public TestMod2( String testName )
    {
        super( testName );
    }


    public static Test suite()
    {
        return new TestSuite( TestMod2.class );
    }


    public void testStrength()
    {
        assertTrue(kid2.getStrength() <= 12);
    }

    public void testMain()
    {
        assertNotNull(rideTheBike.toString());
    }

    public void testStuff()
    {
        assertNotSame(kid, kid2);
    }
}
