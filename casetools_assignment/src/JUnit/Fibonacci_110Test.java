package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Fibonacci_110Test {

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
	public void testFibonacci_Zero() {
		
	        int result = Fibonacci_110.fibonacci(0);
	        assertEquals(0, result);
	    }

	    @Test
	    public void testFibonacci_PositiveNumber() {
	        int result = Fibonacci_110.fibonacci(6);
	        assertEquals(8, result);
	    }

}
