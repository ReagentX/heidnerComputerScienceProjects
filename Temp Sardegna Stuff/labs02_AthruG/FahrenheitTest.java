

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FahrenheitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FahrenheitTest
{
    /**
     * Default constructor for test class FahrenheitTest
     */
    public FahrenheitTest()
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
    public void testGetters1()
    {
        Fahrenheit fahrenhe1 = new Fahrenheit();
        fahrenhe1.setFahrenheit(73.2);
        assertEquals(22.88, fahrenhe1.getCelsius(), 0.01);
        assertEquals(73.2, fahrenhe1.getfahrenheit(), 0.01);
        fahrenhe1.print();
    }

    @Test
    public void testGetters2()
    {
        Fahrenheit fahrenhe1 = new Fahrenheit();
        assertEquals(-17.777, fahrenhe1.getCelsius(), 0.001);
        assertEquals(0.0, fahrenhe1.getfahrenheit(), 0.1);
        fahrenhe1.print();
    }
}


