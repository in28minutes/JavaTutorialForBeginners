package com.in28minutes.java.beginner.junit.examples.primitivedatatypes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerTest {
	@Test
	public void convertIntToString() {
		assertEquals("0", Integer.toString(0));
		assertEquals("100", Integer.toString(100));
		assertEquals("-100", Integer.toString(-100));
	}

	@Test
	public void convertIntToHexadecimal() {
		assertEquals("0", Integer.toHexString(0));
		assertEquals("64", Integer.toHexString(100));
		assertEquals("f", Integer.toHexString(15));
	}

	@Test
	public void convertIntToOctalString() {
		assertEquals("0", Integer.toOctalString(0));
		assertEquals("144", Integer.toOctalString(100));
		assertEquals("17", Integer.toOctalString(15));
	}

	@Test
	public void convertIntToBinary() {
		assertEquals("0", Integer.toBinaryString(0));
		assertEquals("1100100", Integer.toBinaryString(100));
		assertEquals("1111", Integer.toBinaryString(15));
	}
}
