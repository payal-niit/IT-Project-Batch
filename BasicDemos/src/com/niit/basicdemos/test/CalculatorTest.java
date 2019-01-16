package com.niit.basicdemos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.niit.basicdemos.Calculator;

public class CalculatorTest {
	
	Calculator calculator;

	
	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@After
	public void tearDown() {
		calculator=null;
	}
	
	@Test
	public void testAdd() {
		assertEquals("The result is 30",30, calculator.add(10, 20));
	}
	
	@Test
	public void testMultiply() {
		assertEquals("The result is 30",200, calculator.multiply(10, 20));
	}
	
}
