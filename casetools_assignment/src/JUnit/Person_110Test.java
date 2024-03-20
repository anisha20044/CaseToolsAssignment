package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Person_110Test {

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
	 public void testPersonAttributes() {
        Person_110 person1 = new Person_110("Alice", 30);
        assertEquals("Alice", person1.getName());
        assertEquals(30, person1.getAge());
        
        Person_110 person2 = new Person_110("Bob", 25);
        assertEquals("Bob", person2.getName());
        assertEquals(25, person2.getAge());
	}

}
