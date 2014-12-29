

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CircleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CircleTest
{
    /**
     * Default constructor for test class CircleTest
     */
    public CircleTest()
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
    public void testCalculateArea1()
    {
        Circle circle1 = new Circle();
        circle1.calculateArea();
        assertEquals(0.0, circle1.getArea(), 0.1);
        circle1.print();
    }

    @Test
    public void testSetRadius()
    {
        Circle circle1 = new Circle();
        circle1.setRadius(25.236);
        assertEquals(25.236, circle1.getRadius(), 0.0001);
        circle1.print();
    }

    @Test
    public void testGetArea()
    {
        Circle circle1 = new Circle();
        circle1.setRadius(45.26);
        circle1.calculateArea();
        assertEquals(6435.450, circle1.getArea(), 0.01);
        circle1.print();
    }
}



