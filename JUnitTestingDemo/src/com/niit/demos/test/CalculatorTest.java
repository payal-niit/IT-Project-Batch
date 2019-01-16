package com.niit.demos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.niit.demos.Calculator;

public class CalculatorTest {
	
	Calculator calculator;
	
	//when this annotation is used, it says that before every method, 
	//this method will get executed
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	//when this annotation is used, it says that after every method, 
	//this method will get executed
	@After
	public void tearDown() {
		calculator = null;
	}
	
	@Test
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}
	@Ignore
	@Test
	public void addTest() {
		//Calculator calculator = new Calculator();
		
		assertEquals("The result should be 30",30, calculator.add(10, 20));		
	}
	@Test
	public void subractTest() {
		assertEquals("Result should be 10", 10,calculator.subract(20, 10));
	}

}
