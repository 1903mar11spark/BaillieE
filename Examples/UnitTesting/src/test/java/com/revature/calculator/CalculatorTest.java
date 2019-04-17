package com.revature.calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calc = new Calculator();
	private int d;
	private int e;
	

	@Test
	public void addTest() {
		assertThat(calc.add(2d,4d), is(equalTo(6d)));
		assertThat(calc.add(2d, -2d), is(equalTo(0d)));
		assertTrue(calc.add(2d, 4d) == 6); //will do the same exact thing, but the first is easier to read
		
		
	}
	
	@Test
	public void subTest() {
		assertThat(calc.sub(2d,4d), is(equalTo(-2d)));
	}
	
	@Test
	public void multTest() {
		assertThat(calc.mult(2d,4d), is(equalTo(8d)));
	}
	
	@Test
	public void divTest() {
		assertThat(calc.div(2d,4d), is(equalTo(2d)));
	}
		
	@Before  //junit will run this one first //before every single test
	//public void beforeEachTest() {
		//this.d = 2;
		//this.e = 4;
		//System.out.println("I am before Test");
		
	//}
		
	/*
	@After //will run last every time
	public void afterEachTest() {
		this.d = 0;
		this.e = 0;
		System.out.println("I am after Test");
	}
*/
	@BeforeClass //happens once in the very beginning //need to be static as they only get called once
	//public static void beforeClass() {
	//	System.out.println("I am Before Class");
		
	//}
	
	
	public static void afterClass() {
		System.out.println("I am Before Class");
	}
	
	@Test
	public void avgTest() {
		assertThat(calc.avg(2d,5d,4d,5d), is(equalTo(4d)));
		assertThat(calc.avg(-2d,5d,4d,5d), is(equalTo(3d)));
		
	}
	
	@Test
	public void expTest() {
		double[] nums = {2,3,4,5}
		
		assertThat(calc.exp(2d, 5d), is(equalTo(32d)));
		
		
	}
	
}
