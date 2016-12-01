package com.in28minutes.java.beginner.junit.examples.wrapper;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BooleanWrapperTest {
	@Test
	public void createBooleanFromString() {
		/*Anything other than all form of TRUE is false*/
		boolean isGood = Boolean.valueOf("True");
		assertTrue(isGood);

		boolean isVeryGood = Boolean.valueOf("true");
		assertTrue(isVeryGood);

		boolean true1 = Boolean.valueOf("TRUE1");
		assertFalse(true1);
	}

	@Test
	public void booleanToString() {
		Boolean isGood = Boolean.TRUE;
		String string = isGood.toString();
		assertEquals("true",string);
		
		Boolean isBad = Boolean.FALSE;
		String anotherString = isBad.toString();
		assertEquals("false",anotherString);
	}

}
