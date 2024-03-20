package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Employee_110Test {

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
	 public void testCalculateDA() {
        
        Employee_110 employee = new Employee_110("John", "Manager", 50000);
        
        assertEquals(5000, employee.calculateDA(), 0.001); // 10% of 50000
    }

}
