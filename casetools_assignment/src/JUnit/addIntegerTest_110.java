package JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class addIntegerTest_110 {

	    @Test
	    public void testAddition_PositiveNumbers() {
	        int result = addInteger_110.add(5, 10);
	        assertEquals(15, result);
	    }

	    @Test
	    public void testAddition_NegativeNumbers() {
	        int result = addInteger_110.add(-8, -3);
	        assertEquals(-11, result);
	    }
	}

