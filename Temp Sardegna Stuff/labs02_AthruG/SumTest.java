

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SumTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SumTest
{
    /**
     * Default constructor for test class SumTest
     */
    public SumTest()
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
    public void testSum()
    {
        Sum sum1 = new Sum();
        sum1.setNums(258, 659);
        assertEquals(258.0, sum1.getOne(), 0.1);
        assertEquals(659.0, sum1.getTwo(), 0.1);
        assertEquals(0.0, sum1.getSum(), 0.1);
        sum1.sum();
        assertEquals(917.0, sum1.getSum(), 0.1);
        sum1.print();
    }

    @Test
    public void testSumDoubles()
    {
        Sum sum1 = new Sum();
        sum1.setNums(52.635, 45.985);
        assertEquals(52.635, sum1.getOne(), 0.1);
        assertEquals(45.985, sum1.getTwo(), 0.1);
        sum1.sum();
        assertEquals(98.62, sum1.getSum(), 0.1);
        sum1.print();
    }
}


