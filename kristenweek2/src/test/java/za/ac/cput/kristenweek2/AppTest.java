package za.ac.cput.kristenweek2;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.BeforeClass;
import org.omg.CORBA.TIMEOUT;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    StudentObject obj;
    StudentObject obj2;

    @BeforeClass
    public void before()
    {
        StudentObject obj = new StudentObject("Helen", "Stockholme", 523, 321.52f, true);
        StudentObject obj2 = new StudentObject("Helen", "Stockholme", 523, 321.52f, true);
    }


    public AppTest(String testName)
    {

        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    public void testInt()
    {

        assertEquals(6, obj.getStdno());
    }

    public void testFloat()
    {
        assertEquals(5.67f, obj.getFees(), 2);
    }

    public void testObjectEquality()
    {
        assertTrue(obj.equals(obj2));
    }

    public void testObjectIdentity()
    {
        assertSame(obj, obj2);
    }

    public void testNull()
    {
        obj2.setCoursesPassed(2);
        assertNull(obj.getCoursesPassed());
    }

    public void testNotNull()
    {
        obj.setCoursesPassed(2);
        assertNotNull(obj.getCoursesPassed());
    }

    public void testTruth()
    {
        assertTrue(obj.getPass());
    }

    public void testFalse()
    {
        assertFalse(obj.getPaid());
    }

    @Test(timeout=100)
    public void testTimeout()
    {
        assertTrue(obj.equals(obj2));
    }

    @Ignore
    public void testIgnore()
    {
        assertEquals("Kyle", obj.getName());
    }
}
