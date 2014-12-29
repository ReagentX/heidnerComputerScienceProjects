

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StringRipperTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StringRipperTest
{
    private StringRipper stringRi1;

    /**
     * Default constructor for test class StringRipperTest
     */
    public StringRipperTest()
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
        stringRi1 = new StringRipper("This is a chicken String");
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
    public void testGetWord()
    {
        assertEquals("This is a chicken String", stringRi1.getWord());
    }

    @Test
    public void testRipString1()
    {
        assertEquals("chicken", stringRi1.ripString(10, 17));
    }

    @Test
    public void testToString()
    {
        assertEquals("This is a chicken String", stringRi1.toString());
        System.out.println(stringRi1);
    }
}



