

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NameTest
{
    private Name name1;

    /**
     * Default constructor for test class NameTest
     */
    public NameTest()
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
        name1 = new Name("Hoagy Carmichael");
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
    public void testGetName()
    {
        assertEquals("Hoagy Carmichael", name1.getName());
        name1.setName("Bo Diddly");
        System.out.println("setName() OK");
        assertEquals("Bo Diddly", name1.getName());
        System.out.println("getName() OK");
    }

    @Test
    public void testGetFirst()
    {
        assertEquals("Hoagy", name1.getFirst());
        System.out.println("getFirst() OK");
    }

    @Test
    public void testGetLast()
    {
        assertEquals("Carmichael", name1.getLast());
        System.out.println("getLast() OK");
        System.out.println("toString Method: " + name1);
    }
}



