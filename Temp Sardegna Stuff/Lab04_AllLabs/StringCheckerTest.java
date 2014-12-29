

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StringCheckerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StringCheckerTest
{
    /**
     * Default constructor for test class StringCheckerTest
     */
    public StringCheckerTest()
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
        StringChecker stringCh1 = new StringChecker();
        assertEquals("", stringCh1.getWord());
    }

    @Test
    public void test1stConstructor()
    {
        StringChecker stringCh1 = new StringChecker("help");
        assertEquals("help", stringCh1.getWord());
    }

    @Test
    public void testFindLetter()
    {
        StringChecker stringCh1 = new StringChecker("amos bundy");
        assertEquals(false, stringCh1.findLetter('z'));
        assertEquals(true, stringCh1.findLetter('b'));
    }
    
    @Test
    public void testFindSubString()
    {
        StringChecker stringCh1 = new StringChecker("happy jandy");
        assertEquals(false, stringCh1.findSubString("ppyj"));
        assertEquals(true, stringCh1.findSubString("ppy j"));
    }

    @Test
    public void testToString()
    {
        StringChecker stringCh1 = new StringChecker("This Test Is Probably Successful");
        System.out.println(stringCh1);
    }
}




