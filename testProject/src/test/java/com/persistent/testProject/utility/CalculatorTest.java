package com.persistent.testProject.utility;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	Calculator c = null;
	@Before //Before test method Execution
	public void setUp() {
		c = new Calculator();
		
	}
	@After //After test method Execution
	public void tearDown() {
		c = null;
	}
	@Test
	public void testSum() {
		assertEquals(30, c.sum(10,20));
	}
	@Test
	public void testSquare() {
		assertEquals(9, c.square(3));
	}
	@Test
	public void testPower() {
		assertEquals(8, c.power(2, 3));
	}
	
}	
