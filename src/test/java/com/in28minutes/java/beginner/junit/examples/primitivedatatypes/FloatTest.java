package com.in28minutes.java.beginner.junit.examples.primitivedatatypes;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.Test;

@SuppressWarnings("unused")
public class FloatTest {

	@Test
	public void testPrecisionOfFloat() {
		float sampleFloat = 1.1f;
		BigDecimal bigDecimalFromFloat = new BigDecimal(
				sampleFloat);
		BigDecimal bigDecimalFromString = new BigDecimal(
				"1.1");

		/*
		 * java.lang.AssertionError: expected:<1.1> but
		 * was:<1.10000000000000017763568394002504646778106689453125>
		 */
		// assertEquals(bigDecimalFromString,bigDecimalFromFloat);
	}

	@Test
	public void testPrecisionOfFloat2() {
		float sampleFloat = 0.1f;
		float sampleFloatTimes26 = 0.1f * 26;

		// java.lang.AssertionError: expected:<2.5999999046325684> /*2.6f*/
		// but was:<2.6000001430511475>/*0.1f times 26*/
		// assertEquals(2.6f,sampleFloatTimes26,0.0); FAILS
	}

	@Test
	public void floatToString() {
		float number = 2456.25f;
		String numberAsString = "" + number;
		assertEquals("2456.25", numberAsString);
	}

	@Test
	public void floatToStringApproach2() {
		float number = 2456.25f;
		String numberAsString = Float.toString(number);
		assertEquals("2456.25", numberAsString);
	}

	@Test
	public void formatFloat() {
		float number = 2456.2567f;

		assertEquals("2456.26", String.format("%5.2f",
				number));
		assertEquals("2456.26", new DecimalFormat("00.00")
				.format(number));
	}

	@Test
	public void formatFloatWithLeadingZeroes() {
		float number = 2456.2567f;

		assertEquals("02456.26", new DecimalFormat(
				"00000.00").format(number));
		assertEquals("00002456.257", new DecimalFormat(
				"00000000.000").format(number));
	}

	@Test
	public void formatFloatWithSpaces() {
		float number = 2456.2567f;

		assertEquals(" 2456.26", String.format("%8.2f",
				number));
		assertEquals("    2456.257", String.format(
				"%12.3f", number));
	}

	@Test
	public void formatFloatWithCommas() {
		float number = 257654.25f;

		String formatted = new DecimalFormat("000,000.000")
				.format(number);

		assertEquals("257,654.250", formatted);
	}

	@Test
	public void roundingFloat() {
		float number = 2456.2567f;
		assertEquals(2456.0, Math.round(number), 0.0);
	}

	@Test
	public void roundingFloatToDecimals() {
		float number = 56.256f;
		BigDecimal numberToBeRounded = new BigDecimal(
				number);
		BigDecimal numberAfterRounding = numberToBeRounded
				.setScale(2, BigDecimal.ROUND_HALF_UP);
		assertEquals(56.26f, numberAfterRounding
				.floatValue(), 0.0);
	}

	@Test
	public void floatToInteger() {
		float floatValue = 897.61f;

		int trucatedNumber = (int) floatValue;
		assertEquals(897, trucatedNumber);

		int roundedNumber = (int) Math.round(floatValue);
		assertEquals(898, roundedNumber);
	}

	@Test
	public void floatToLong() {
		float floatValue = 897123.61f;

		long trucatedNumber = (long) floatValue;
		assertEquals(897123, trucatedNumber);

		long roundedNumber = (long) Math.round(floatValue);
		assertEquals(897124, roundedNumber);
	}
}