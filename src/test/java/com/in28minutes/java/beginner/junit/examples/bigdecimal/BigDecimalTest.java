package com.in28minutes.java.beginner.junit.examples.bigdecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.math.BigDecimal;

import org.junit.Test;

public class BigDecimalTest {

	@Test
	public void bigDecimalFromDoubleNotAccurate() {
		@SuppressWarnings("unused")
		BigDecimal firstAmount = new BigDecimal(2.3);// 3

		// Commented to prevent failure with message
		// java.lang.AssertionError: expected:<2.3>
		// but was:<2.29999999999999982236431605997495353221893310546875>

		// assertEquals(new BigDecimal("2.3"),firstAmount);

	}

	@Test
	public void createBigDecimalFromString() {
		BigDecimal firstAmount = new BigDecimal("2.3");// 3

		double allowedDeviation = 0.0;

		assertEquals(2.3, firstAmount.doubleValue(), allowedDeviation);
	}

	@Test
	public void bigDecimalComparison() {
		// Look carefully its assertFalse. equals returns false
		// This is not the best option to compare big decimals
		assertFalse(new BigDecimal("2.3").
						equals(new BigDecimal("2.30")));

		// Best way to compare BigDecimals
		assertEquals(0, new BigDecimal("2.3").compareTo(new BigDecimal("2.30")));
		
		assertEquals(1,
				new BigDecimal("2.31").compareTo(new BigDecimal("2.30")));
		
		assertEquals(-1,
				new BigDecimal("2.29").compareTo(new BigDecimal("2.3")));

	}

	@Test
	public void bigDecimalsAddition() {
		BigDecimal firstAmount = new BigDecimal("2.300");// 3
		BigDecimal secondAmount = new BigDecimal("2.45");// 2

		BigDecimal sum = firstAmount.add(secondAmount);
		BigDecimal sumScale2 = sum.setScale(2);

		assertEquals(new BigDecimal("4.75"), sumScale2);
		assertEquals(new BigDecimal("4.750"), sum);
	}

	@Test(expected = ArithmeticException.class)
	public void bigDecimalDivisionException() {
		BigDecimal firstAmount = new BigDecimal("55");// 3
		BigDecimal secondAmount = new BigDecimal("12");// 2

		// java.lang.ArithmeticException: Non-terminating decimal expansion;
		// no exact representable decimal result.
		@SuppressWarnings("unused")
		BigDecimal divisionResult = firstAmount.divide(secondAmount);
	}

	@Test
	public void bigDecimalDivide() {
		BigDecimal firstAmount = new BigDecimal("55");// 3
		BigDecimal secondAmount = new BigDecimal("12");// 2

		BigDecimal divisionResult = firstAmount.divide(secondAmount, 4,
				BigDecimal.ROUND_UP);
		BigDecimal divisionResultScale2Roundup = firstAmount.divide(
				secondAmount, 2, BigDecimal.ROUND_UP);

		BigDecimal divisionResultScale2Rounddown = firstAmount.divide(
				secondAmount, 2, BigDecimal.ROUND_DOWN);

		// 4.33 scale - 1 4.3 4.4
		assertEquals(new BigDecimal("4.5834"), divisionResult);
		assertEquals(new BigDecimal("4.59"), divisionResultScale2Roundup);
		assertEquals(new BigDecimal("4.58"), divisionResultScale2Rounddown);
	}

	@Test
	public void bigDecimalRounding() {
		// Any fraction is rounded up
		assertEquals(new BigDecimal("59.56"),
				new BigDecimal("59.551").setScale(2, BigDecimal.ROUND_UP));

		// Any fraction is truncated
		assertEquals(new BigDecimal("59.55"),
				new BigDecimal("59.559").setScale(2, BigDecimal.ROUND_DOWN));

		// Any fraction >=.5 is rounded up. others truncated
		assertEquals(new BigDecimal("59.56"),
				new BigDecimal("59.555").setScale(2, BigDecimal.ROUND_HALF_UP));
		assertEquals(new BigDecimal("59.55"),
				new BigDecimal("59.5549").setScale(2, BigDecimal.ROUND_HALF_UP));

		// Any fraction <=.5 is truncated. others rounded up.
		assertEquals(new BigDecimal("59.55"),
				new BigDecimal("59.555")
						.setScale(2, BigDecimal.ROUND_HALF_DOWN));
		assertEquals(new BigDecimal("59.56"),
				new BigDecimal("59.5551").setScale(2,
						BigDecimal.ROUND_HALF_DOWN));

	}

	@Test
	public void bigDecimalScale() {
		// Scale indicates number of decimal points
		BigDecimal firstAmount = new BigDecimal("55");// 3
		assertEquals(0, firstAmount.scale());

		BigDecimal secondAmount = new BigDecimal("12.00");// 2
		assertEquals(2, secondAmount.scale());

		BigDecimal additionResult = firstAmount.add(secondAmount);
		// Scale of result of addition is that of larger of two operands
		assertEquals(2, additionResult.scale());
	}
}
