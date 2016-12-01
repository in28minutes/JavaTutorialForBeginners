package com.in28minutes.java.beginner.junit.examples.controlflow;

import static org.junit.Assert.*;

import org.junit.Test;

public class SwitchStatementTest {
	/*
	 * Ideally you should not use an inner class with source in a Test. This is
	 * a small test to illustrate switch condition. Also not using Enums since a number
	 * of students learn Enum after switch.
	 */
	class SwitchStatementExample {
		public String getWeekDayName(int dayNumber) {
			String dayOfWeek = null;
			switch (dayNumber) {
			case 1:
				dayOfWeek = "Sunday";
				break; // If break is not present, code flows to next case
			case 2:
				dayOfWeek = "Monday";
				break;
			case 3:
				dayOfWeek = "Tuesday";
				break;
			case 4:
				dayOfWeek = "Wednesday";
				break;
			case 5:
				dayOfWeek = "Thursday";
				break;
			case 6:
				dayOfWeek = "Friday";
				break;
			case 7:
				dayOfWeek = "Saturday";
				break;
			default:
				dayOfWeek = "Invalid";
				break; // GOOD PRACTICE : Even though it is not really needed.
			}
			return dayOfWeek;
		}

		public boolean isHoliday(int dayNumber) {
			boolean isHoliday = false;

			switch (dayNumber) {

			case 1: // Falls though to next case in switch
			case 7:
				isHoliday = true;
				break;

			default:
				isHoliday = false;
				break;// Good Practice: Even though it is not really need.
			}
			return isHoliday;
		}

	}

	@Test
	public void checkSimpleSwitchStatement() {
		SwitchStatementExample example = new SwitchStatementExample();

		assertEquals("Sunday", example.getWeekDayName(1));
		assertEquals("Monday", example.getWeekDayName(2));
		assertEquals("Invalid", example.getWeekDayName(100));
	}

	@Test
	public void checkComplexSwitchStatement() {
		SwitchStatementExample example = new SwitchStatementExample();
		assertTrue(example.isHoliday(1));
		assertTrue(example.isHoliday(7));
		assertFalse(example.isHoliday(5));
	}

}
