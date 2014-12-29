

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MilesPerHourTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MilesPerHourTest
{
    /**
     * Default constructor for test class MilesPerHourTest
     */
    public MilesPerHourTest()
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
    public void testDefaultCoonstructor()
    {
        MilesPerHour milesPer1 = new MilesPerHour();
        assertEquals(0, milesPer1.getDistance());
        System.out.println("Default getDistance OK");
        assertEquals(0, milesPer1.getHours());
        System.out.println("Default getHours OK");
        assertEquals(0, milesPer1.getMinutes());
        System.out.println("Default getMinutes OK");
        milesPer1.calcMPH();
        assertEquals(0.0, milesPer1.getMPH(), 0.1);
        System.out.println("Default getMPH OK");
    }

    @Test
    public void testSetNums()
    {
        MilesPerHour milesPer1 = new MilesPerHour();
        milesPer1.setNums(75, 3, 45);
        assertEquals(75, milesPer1.getDistance());
        System.out.println("Set Distance OK");
        assertEquals(3, milesPer1.getHours());        
        System.out.println("Set Hours OK");
        assertEquals(45, milesPer1.getMinutes());
        System.out.println("Set Minutes OK");
    }

    @Test
    public void testCalcMPH()
    {
        MilesPerHour milesPer1 = new MilesPerHour(75, 3, 45);
        milesPer1.calcMPH();
        assertEquals(20.0, milesPer1.getMPH(), 0.1);
        System.out.println("calcMPH OK");
        milesPer1.print();
    }
}



