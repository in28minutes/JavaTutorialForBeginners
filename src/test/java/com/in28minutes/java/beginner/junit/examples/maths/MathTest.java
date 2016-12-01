package com.in28minutes.java.beginner.junit.examples.maths;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void absoluteValue(){
		assertEquals(1,Math.abs(-1));
		assertEquals(1,Math.abs(1));
		
		assertEquals(1.2,Math.abs(-1.2),0.0);
		assertEquals(1.2,Math.abs(1.2),0.0);
	}
}
