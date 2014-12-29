

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TriangleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TriangleTest
{
    private Triangle triangle1;

    /**
     * Default constructor for test class TriangleTest
     */
    public TriangleTest()
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
        
        triangle1 = new Triangle(37, 38, 39);
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
    public void testConstructorAndSides()
    {
        //Triangle triangle1 = new Triangle(35, 36, 37);
        assertEquals(37, triangle1.getSideA());
        assertEquals(38, triangle1.getSideB());
        assertEquals(39, triangle1.getSideC());
    }

    @Test
    public void testConstructorAndPerimeter()
    {
        //Triangle triangle1 = new Triangle(36, 37, 38);
        assertEquals(0.0, triangle1.getPerimeter(), 0.1);
        triangle1.calcPerimeter();
        assertEquals(114.0, triangle1.getPerimeter(), 0.1);
    }

    @Test
    public void testSetSidesAndSides()
    {
        //Triangle triangle1 = new Triangle(37, 38, 39);
        triangle1.setSides(10, 15, 16);
        assertEquals(10, triangle1.getSideA());
        assertEquals(15, triangle1.getSideB());
        assertEquals(16, triangle1.getSideC());
    }

    @Test
    public void testSetSidesAndPerimeter()
    {
        Triangle triangle2 = new Triangle();
        triangle2.calcPerimeter();
        assertEquals(0.0, triangle2.getPerimeter(), 0.1);
        triangle2.setSides(38, 39, 40);
        assertEquals(0.0, triangle2.getPerimeter(), 0.1);
        triangle2.calcPerimeter();
        assertEquals(117.0, triangle2.getPerimeter(), 0.1);
    }

    @Test
    public void testSetSidesAndTheArea()
    {
        Triangle triangle2 = new Triangle();
        assertEquals(0.0, triangle2.getTheArea(), 0.1);
        triangle2.setSides(12, 13, 14);
        triangle2.calcArea();
        assertEquals(-0.0, triangle1.getTheArea(), 0.1);
        triangle2.calcPerimeter();
        triangle2.calcArea();
        assertEquals(72.30794, triangle2.getTheArea(), 0.00001);
    }

   
}






