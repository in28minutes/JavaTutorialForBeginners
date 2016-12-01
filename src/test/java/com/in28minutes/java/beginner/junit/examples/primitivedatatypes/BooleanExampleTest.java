package com.in28minutes.java.beginner.junit.examples.primitivedatatypes;

import static org.junit.Assert.*;

import org.junit.Test;

public class BooleanExampleTest {
	@Test
	public void testBooleanNegationOperator(){
		assertEquals(false,!true);
		assertEquals(true,!false);
	}

	@Test
	public void testBooleanXOROperator(){
		assertEquals(false,true^true);
		assertEquals(true,true^false);
		assertEquals(true,false^true);
		assertEquals(false,false^false);
	}

	@Test
	public void testBooleanAndOperator(){
		assertEquals(true,true&true);
		assertEquals(false,true&false);
		assertEquals(false,false&true);
		assertEquals(false,false&false);
	}


	@Test
	public void testBooleanOrOperator(){
		assertEquals(true,true|true);
		assertEquals(true,true|false);
		assertEquals(true,false|true);
		assertEquals(false,false|false);
	}

}
