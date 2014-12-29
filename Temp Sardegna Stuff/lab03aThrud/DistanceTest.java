

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DistanceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DistanceTest
{
    private Distance distance1;

    /**
     * Default constructor for test class DistanceTest
     */
    public DistanceTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        distance1 = new Distance(0, 0, 0, 0);
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testDistance1()
    {
        distance1.setCoordinates(25, 10, -25, -10);
        distance1.calcDistance();
        assertEquals(53.852, distance1.getDistance(), 0.001);
        System.out.println("Distance Test #1 - Passed");
    }

    @Test
    public void testDistance2()
    {
        distance1.setCoordinates(35, 25, 10, 15);
        assertEquals(35, distance1.getXone());
        System.out.println("Field: xOne - Pass");
        assertEquals(10, distance1.getXtwo());
        System.out.println("Field: xTwo - Pass");
        assertEquals(25, distance1.getYone());
        System.out.println("Field: yOne - Pass");
        assertEquals(15, distance1.getYtwo());
        System.out.println("Field: yTwo - Pass");
        assertEquals(0.0, distance1.getDistance(), 0.1);
        System.out.println("NoCalc Distance - Pass");
        distance1.calcDistance();
        assertEquals(26.925, distance1.getDistance(), 0.001);
        System.out.println("Distance Test #2 - Pass");
    }

   
}



