package com.in28minutes.java.beginner.junit.examples.wrapper;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CharacterWrapperTest {

	@Test
	public void characterIsDigitorLetter() {
		assertTrue(Character.isDigit('1'));
		assertFalse(Character.isDigit('A'));
		assertTrue(Character.isLetter('Z'));
		assertFalse(Character.isLetter(';'));
	}

}
