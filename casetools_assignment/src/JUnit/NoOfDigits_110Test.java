package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NoOfDigits_110Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	} 

	@Test
	public void testCountDigits_PositiveNumber() {
        int result = NoOfDigits_110.countDigits(123456);
        assertEquals(6, result);
    }

    @Test
    public void testCountDigits_NegativeNumber() {
        int result = NoOfDigits_110.countDigits(-7890);
        assertEquals(4, result);
    }

}
