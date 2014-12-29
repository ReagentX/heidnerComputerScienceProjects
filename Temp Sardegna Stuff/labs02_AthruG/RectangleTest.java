

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RectangleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RectangleTest
{
    /**
     * Default constructor for test class RectangleTest
     */
    public RectangleTest()
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
    public void testLength()
    {
        Rectangle rectangl1 = new Rectangle();
        assertEquals(0, rectangl1.getLength());
        rectangl1.setLengthWidth(5, 10);
        rectangl1.calculatePerimeter();
        assertEquals(5, rectangl1.getLength());
        rectangl1.print();
    }

    @Test
    public void testWidth()
    {
        Rectangle rectangl2 = new Rectangle();
        rectangl2.setLengthWidth(5, 10);
        assertEquals(10, rectangl2.getWidth());
        rectangl2.calculatePerimeter();
        assertEquals(30, rectangl2.getPerimeter());
        rectangl2.print();
    }

    @Test
    public void testPerimeter()
    {
        Rectangle rectangl3 = new Rectangle();
        rectangl3.setLengthWidth(5, 10);
        rectangl3.calculatePerimeter();
        assertEquals(30, rectangl3.getPerimeter());
        rectangl3.print();
    }
}



