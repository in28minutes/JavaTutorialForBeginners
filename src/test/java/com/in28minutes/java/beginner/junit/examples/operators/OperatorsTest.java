package com.in28minutes.java.beginner.junit.examples.operators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OperatorsTest {

	@Test
	public void comparisonOperators() {
		// Greater than comparison operator
		assertTrue(2 > 1);
		assertFalse(2 > 2);

		// Greater than equal to comparison operator
		assertTrue(2 >= 1);
		assertTrue(2 >= 2);

		// Less than comparison operator
		assertTrue(1 < 2);
		assertFalse(1 < 1);

		// Less than equal to comparison operator
		assertTrue(1 <= 2);
		assertTrue(1 <= 1);
	}

	@Test
	public void equalityOperators() {
		// == equals to comparison operator
		assertFalse(2 == 1);

		// != not equal to comparison operator
		assertTrue(5 != 2);
	}

	@Test
	public void logicalOperators() {
		// && - True when all the operands are true. false otherwise
		assertFalse(Boolean.TRUE && Boolean.FALSE);
		assertTrue(Boolean.TRUE && Boolean.TRUE);

		// || - True when one of the operands are true. false otherwise
		assertTrue(Boolean.TRUE || Boolean.FALSE);
		assertTrue(Boolean.TRUE || Boolean.TRUE);
		assertFalse(Boolean.FALSE || Boolean.FALSE);

		// If not clear yet, lets create examples
		int five = 5;

		assertTrue(five == 5 && five < 6);
		assertFalse(five != 5 && five < 6);// five != 5 is false

		assertFalse(five != 5 || five > 6);// five != 5 is false and five > 6 is
											// false
		assertTrue(five == 5 || five > 6);// only five > 6 is false
	}

	@Test
	public void shortCircuitOperators() {
		// && - True when all the operands are true. false otherwise
		int number1 = 25;
		int number2 = 30;

		assertTrue(number1++ > 3 || number2++ > 7);

		assertEquals(25 + 1, number1); // number1 is incremented
		assertEquals(30, number2); // number 2 is not incremented

		/*
		 * NOTE: number2 is not incremented since on evaluating number1++>3 Java
		 * knows that the result of operation is true. It does not evaluate
		 * number2++>7. || is short ciruit or operator.
		 * 
		 * Below is an example with && short circuit and operator
		 */

		int number3 = 25;
		int number4 = 30;

		assertFalse(number3-- < 3 && number4-- > 7);

		assertEquals(25 - 1, number3); // number1 is decremented
		assertEquals(30, number4); // number 2 is not decremented

		/*
		 * number4 is not decremented. As soon as first operand is false, Java
		 * knows that the result of && is false. So, it does not execute the
		 * second condition at all.
		 */
	}

	@Test
	public void conditionalOperator() {
		int runs = 4;

		String firstCondition = (runs >= 4) ? "Boundary"
				: "Not a Boundary";
		assertEquals("Boundary", firstCondition);

		String secondCondition = (runs < 0) ? "Negative"
				: "Positive";
		assertEquals("Positive", secondCondition);
	}

	@Test
	public void unaryOperators() {
		int plusFive = +5;
		int minusFive = -5;
		int plusFiveIncremented = ++plusFive;
		int minusFiveDecremented = --minusFive;

		assertEquals(6, plusFiveIncremented);
		assertEquals(-6, minusFiveDecremented);

		// All the operators we are using in this example
		// + - ++ -- act on single operand
		// Hence, they are called unary operators
	}

}
