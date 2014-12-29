

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FirstAndLastTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FirstAndLastTest
{
    /**
     * Default constructor for test class FirstAndLastTest
     */
    public FirstAndLastTest()
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
    public void testDefaultConstructor()
    {
        FirstAndLast firstAnd1 = new FirstAndLast();
        firstAnd1.setString("razor sharp");
        firstAnd1.findFirstLastLetters();
        assertEquals('r', firstAnd1.getFirstLetter());
        System.out.println("First Letter Correct");
        assertEquals('p', firstAnd1.getLastLetter());
        System.out.println("Second Letter Correct");
        assertEquals("razor sharp", firstAnd1.getWord());
        System.out.println(firstAnd1.toString());
    }

    @Test
    public void TestParamedConstructor()
    {
        FirstAndLast firstAnd1 = new FirstAndLast("hot diggity");
        firstAnd1.findFirstLastLetters();
        assertEquals('h', firstAnd1.getFirstLetter());
        System.out.println("First Letter Correct");
        assertEquals('y', firstAnd1.getLastLetter());
        System.out.println("Second Letter Correct");
        assertEquals("hot diggity", firstAnd1.getWord());
        System.out.println(firstAnd1.toString());
    }
}


