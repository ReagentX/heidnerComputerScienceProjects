

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AverageTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AverageTest
{
    /**
     * Default constructor for test class AverageTest
     */
    public AverageTest()
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
    public void testAverage()
    {
        Average average1 = new Average();
        average1.setNums(125.45, 85.32);
        assertEquals(125.45, average1.getOne(), 0.001);
        assertEquals(85.32, average1.getTwo(), 0.001);
        average1.average();
        assertEquals(105.385, average1.getAverage(), 0.001);
        average1.print();
    }

    @Test
    public void testGetOne()
    {
        Average average1 = new Average();
        assertEquals(0.0, average1.getOne(), 0.1);
        average1.setNums(5, 6);
        assertEquals(5.0, average1.getOne(), 0.1);
    }

    @Test
    public void testGetTwo()
    {
        Average average1 = new Average();
        assertEquals(0.0, average1.getTwo(), 0.1);
        average1.setNums(5, 10);
        assertEquals(10.0, average1.getTwo(), 0.1);
    }

    @Test
    public void testGetAverage()
    {
        Average average1 = new Average();
        assertEquals(0.0, average1.getAverage(), 0.1);
        average1.setNums(5, 11);
        average1.average();
        assertEquals(8.0, average1.getAverage(), 0.001);
    }
}




