package com.in28minutes.java.beginner.junit.examples.primitivedatatypes;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class LongTest {
	@Test
	public void longToStringConversion() {
		assertEquals("0", Long.toString(0));
		assertEquals("100", Long.toString(100));
		assertEquals("-100", Long.toString(-100));
	}

	@Test
	public void longToHexStringConversion() {
		assertEquals("0", Long.toHexString(0));
		assertEquals("64", Long.toHexString(100));
		assertEquals("f", Long.toHexString(15));
	}

	@Test
	public void longToOctalStringConversion() {
		assertEquals("0", Long.toOctalString(0));
		assertEquals("144", Long.toOctalString(100));
		assertEquals("17", Long.toOctalString(15));
	}

	@Test
	public void longToBinaryStringConversion() {
		assertEquals("0", Long.toBinaryString(0));
		assertEquals("1100100", Long.toBinaryString(100));
		assertEquals("1111", Long.toBinaryString(15));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void longToDateConversion() {
		long timeElapsedSince1970InMilliSeconds = 
							System.currentTimeMillis();

		Date currentTime = new Date(
				timeElapsedSince1970InMilliSeconds);

		// Don't really know what to assert :)
		assertTrue(currentTime.getYear() >= 2012 - 1900);
		// Date uses year-1900 as year. Don't ask me why:)
	}

}
