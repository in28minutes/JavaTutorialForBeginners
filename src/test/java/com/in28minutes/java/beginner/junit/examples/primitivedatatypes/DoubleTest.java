package com.in28minutes.java.beginner.junit.examples.primitivedatatypes;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.Test;

@SuppressWarnings("unused")
public class DoubleTest {

	@Test
	public void testPrecisionOfDouble() {
		double sampleDouble = 5.2;
		BigDecimal bigDecimal1 = new BigDecimal(
				sampleDouble);
		BigDecimal bigDecimal2 = new BigDecimal("5.2");

		/*
		 * java.lang.AssertionError: expected:<5.2> but
		 * was:<5.20000000000000017763568394002504646778106689453125>
		 */
		// assertEquals(bigDecimal2,bigDecimal1);
	}

	@Test
	public void doubleToString() {
		double number = 25.25;
		String numberAsString = "" + number;
		assertEquals("25.25", numberAsString);
	}

	@Test
	public void doubleToStringApproach2() {
		double number = 25.25;
		String numberAsString = Double.toString(number);
		assertEquals("25.25", numberAsString);
	}

	@Test
	public void formatDouble() {
		double number = 25.2567;

		assertEquals("25.26", String
				.format("%5.2f", number));
		assertEquals("25.26", new DecimalFormat("00.00")
				.format(number));
	}

	@Test
	public void formatDoubleWithLeadingZeroes() {
		double number = 25.2567;

		assertEquals("025.26", new DecimalFormat("000.00")
				.format(number));
		assertEquals("000025.257", new DecimalFormat(
				"000000.000").format(number));
	}

	@Test
	public void formatDoubleWithSpaces() {
		double number = 25.2567;
		
		assertEquals(" 25.26", String.format("%6.2f",
				number));
		assertEquals("    25.257", String.format("%10.3f",
				number));
	}

	@Test
	public void formatDoubleWithCommas() {
		double number = 257654.25;

		String formatted = new DecimalFormat("000,000.000")
				.format(number);

		assertEquals("257,654.250", formatted);
	}

	@Test
	public void roundingDoubleToInt() {
		double number = 25.2567;
		assertEquals(25.0, Math.round(number), 0.0);
	}

	@Test
	public void roundingDoubleToDecimals() {
		double number = 25.2567;
		BigDecimal numberToBeRounded = new BigDecimal(number);
		BigDecimal numberAfterRounding = 
				numberToBeRounded.setScale(2, BigDecimal.ROUND_HALF_UP);
		assertEquals(25.26, numberAfterRounding.doubleValue(), 0.0);
	}

	@Test
	public void doubleToInteger() {
		double doubleValue = 897.61;
		
		int trucatedNumber = (int) doubleValue;
		assertEquals(897, trucatedNumber);
		
		int roundedNumber = (int) Math.round(doubleValue);
		assertEquals(898, roundedNumber);
	}

	@Test
	public void doubleToLong() {
		double doubleValue = 89712345.61;
		
		long trucatedNumber = (long) doubleValue;
		assertEquals(89712345, trucatedNumber);
		
		long roundedNumber = (long) Math.round(doubleValue);
		assertEquals(89712346, roundedNumber);
	}
}
