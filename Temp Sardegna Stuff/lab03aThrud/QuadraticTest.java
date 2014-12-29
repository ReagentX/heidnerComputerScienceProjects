

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuadraticTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class QuadraticTest
{
    private Quadratic quadrati1;

    /**
     * Default constructor for test class QuadraticTest
     */
    public QuadraticTest()
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
        quadrati1 = new Quadratic(0, 0, 0);
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
    public void testQuad1()
    {
        quadrati1.setEquation(5, -8, 3);
        quadrati1.calcRoots();
        assertEquals(1.00, quadrati1.getRootOne(), 0.01);
        assertEquals(0.6, quadrati1.getRootTwo(), 0.1);
    }

    @Test
    public void testQuad2()
    {
        quadrati1.setEquation(3, 2, -7);
        assertEquals(3, quadrati1.getA());
        assertEquals(2, quadrati1.getB());
        assertEquals(-7, quadrati1.getC());
        assertEquals(0.0, quadrati1.getRootOne(), 0.1);
        assertEquals(0.0, quadrati1.getRootTwo(), 0.1);
        quadrati1.calcRoots();
        assertEquals(1.23, quadrati1.getRootOne(), 0.01);
        assertEquals(-1.90, quadrati1.getRootTwo(), 0.01);
    }
}



