package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Dog_110Test {

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
	public void testDogAttributes() {
        Dog_110 dog1 = new Dog_110("Buddy", "Labrador");
        assertEquals("Buddy", dog1.getName());
        assertEquals("Labrador", dog1.getBreed());

        dog1.setName("Max");
        dog1.setBreed("German Shepherd");
        assertEquals("Max", dog1.getName());
        assertEquals("German Shepherd", dog1.getBreed());
    }

}
