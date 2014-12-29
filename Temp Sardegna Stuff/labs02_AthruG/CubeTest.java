

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CubeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CubeTest
{
    /**
     * Default constructor for test class CubeTest
     */
    public CubeTest()
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
    public void testGetSide()
    {
        Cube cube2 = new Cube();
        cube2.setSide(10);
        assertEquals(10, cube2.getSide());
    }

    @Test
    public void testCalcSurfaceArea()
    {
        Cube cube1 = new Cube();
        cube1.calculateSurfaceArea();
        assertEquals(0, cube1.getSurfaceArea());
    }

    @Test
    public void testGetSurfaceArea()
    {
        Cube cube1 = new Cube();
        cube1.setSide(20);
        cube1.calculateSurfaceArea();
        assertEquals(20, cube1.getSide());
        assertEquals(2400, cube1.getSurfaceArea());
        cube1.print();
    }
}



