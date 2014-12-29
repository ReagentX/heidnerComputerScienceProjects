

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LineTest
{
    /**
     * Default constructor for test class LineTest
     */
    public LineTest()
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
    public void testConstructor()
    {
        Line line1 = new Line(10, 10, 25, 25);
        assertEquals(10, line1.getXOne());
        assertEquals(25, line1.getXTwo());
        assertEquals(10, line1.getYOne());
        assertEquals(25, line1.getYTwo());
    }

    @Test
    public void testGetSlope()
    {
        Line line1 = new Line(10, 10, -25, -25);
        assertEquals(0.0, line1.getSlope(), 0.1);
        line1.print();
    }

    @Test
    public void testCalcSlope()
    {
        Line line1 = new Line(10, 10, -25, -25);
        line1.calculateSlope();
        assertEquals(1.0, line1.getSlope(), 0.1);
        line1.print();
    }

    @Test
    public void testSetCoords()
    {
        Line line1 = new Line(10, 10, -25, -35);
        line1.calculateSlope();
        assertEquals(1.285, line1.getSlope(), 0.003);
        line1.print();
        line1.setCoordinates(10, 10, 25, 35);
        line1.calculateSlope();
        assertEquals(1.667, line1.getSlope(), 0.001);
        line1.print();
    }
}




