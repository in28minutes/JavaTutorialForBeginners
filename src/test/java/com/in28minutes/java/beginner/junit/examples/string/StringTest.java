package com.in28minutes.java.beginner.junit.examples.string;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.junit.Test;

public class StringTest {
	@Test
	public void creatingString() {
		final String str = "ABCDEF"; // Do not use - new String("ABCDEF")
		assertEquals(str, "ABCDEF");
	}

	@Test
	public void stringFormat() {
		assertEquals("String" + " " + "1" + " " + "Value",
				String.format("String %d %s", new Object[] {
						1, "Value" }));

		// Notice the formatting using 5 spaces before Value
		assertEquals("String" + " " + "1" + " "
				+ "     Value", String.format(
				"String %d %10s",
				new Object[] { 1, "Value" }));

		// Notice the formatting of 1
		assertEquals("String" + " " + "    1" + " "
				+ "Value", String.format("String %5d %s",
				new Object[] { 1, "Value" }));

	}

	@Test
	public void stringComparison() {
		final String firstString = "Sachin";

		final String sameString = "Sachin";
		final String differentString = "Dravid";

		// Even though firstString == sameString
		// will work sometimes, it is not recommended to compare using ==
		assertTrue(firstString.equals(sameString));
		assertFalse(firstString.equals(differentString));
	}

	@Test
	public void comparePartOfStrings() {
		final String firstString = "ABCDEFGH";

		final String secondString = "CDEFGHIJ";

		final int startIndexInFirstString = 3;
		final int startIndexInSecondString = 1;
		final int noOfCharsToCompare = 4;

		// Checking if 4 chars DEFG are the same in two strings
		assertTrue(firstString.regionMatches(
				startIndexInFirstString, secondString,
				startIndexInSecondString,
				noOfCharsToCompare));
	}

	@Test
	public void stringStartsWithExamples() {
		String firstString = "ABC";
		assertTrue(firstString.startsWith("AB"));
		assertTrue(firstString.startsWith("AB"));
	}

	@Test
	public void stringEndsWithExamples() {
		String firstString = "ABC";

		assertTrue(firstString.endsWith("BC"));
		assertFalse(firstString.endsWith("AB"));
	}

	@Test
	public void stringCharAtExamples() {
		String firstString = "ABC";
		assertEquals('B', firstString.charAt(1));

	}

	@Test
	public void stringContainsExamples() {
		String firstString = "ABC";

		assertTrue(firstString.contains("AB"));
		assertFalse(firstString.contains("DE"));
	}

	@Test
	public void stringSubString() {
		final String firstString = "ABCDEFGHIJ";
		// 0123456789
		final int startOfSubstring = 3;
		final int endOfSubstring = 5;

		assertEquals("DEFGHIJ", firstString
				.substring(startOfSubstring));

		// substring includes start index but does not include end index
		assertEquals("DE", firstString.substring(
				startOfSubstring, endOfSubstring));
	}

	@Test
	public void splitStrings() {
		String stringToSplit = "1,2,3,4";
		String seperator = ",";

		String[] splits = stringToSplit.split(seperator);

		int noOfSplitFragments = 4;
		assertEquals(noOfSplitFragments, splits.length);

		assertArrayEquals(
				new String[] { "1", "2", "3", "4" }, splits);
	}

	@Test
	public void stringReplace() {
		String string = "Gavaskar is India's best Batsman";
		String stringToReplace = "Gavaskar";
		String stringToReplaceWith = "Sachin";

		assertEquals("Sachin is India's best Batsman",
				string.replace(stringToReplace,
						stringToReplaceWith));
	}

	@Test
	public void replaceCharacterInString() {
		String string = "TESTING";
		char charToReplace = 'T';
		char charToReplaceWith = '$';

		assertEquals("$ES$ING", string.replace(
				charToReplace, charToReplaceWith));
	}

	@Test
	public void addCharToString() {
		String string = "TESTING";
		char charToAdd = '1';
		String appendedString = string + charToAdd;

		assertEquals("TESTING1", appendedString);
	}

	@Test
	public void stringReplaceAllRegex() {
		String string = "Replace all 5 numbers 6 in 7 string 8";

		// This regular expression matches all numeric characters
		String regularExpression = "[0-9]";

		String stringToReplaceWith = "X";

		assertEquals(
				"Replace all X numbers X in X string X",
				string.replaceAll(regularExpression,
						stringToReplaceWith));
	}

	@Test
	public void stringReplaceAndReplaceAllDifference() {
		String string = "Replace all 5 numbers 6 in 7 string 8";

		// This regular expression matches all numeric characters
		String regularExpression = "[0-9]";

		String stringToReplaceWith = "X";

		// Replace all looks for regular expression
		assertEquals(
				"Replace all X numbers X in X string X",
				string.replaceAll(regularExpression,
						stringToReplaceWith));

		// Replace looks for the actual string. since [0-9] is not found
		// It does not replace anything
		assertEquals(
				"Replace all 5 numbers 6 in 7 string 8",
				string.replace(regularExpression,
						stringToReplaceWith));

	}

	@Test
	public void stringSearch() {
		String string = "Sachin Tendulkar";
		// 0123456789012345
		// Search for a sequence of characters using contains
		assertTrue(string.contains("in"));
		assertFalse(string.contains("notin"));

		// Get index of character sequence using index of
		assertEquals(2, string.indexOf("ch"));
		assertEquals(-1, string.indexOf("notin"));// -1 Not found

		// If you want to search for last character
		assertEquals(14, string.lastIndexOf("a"));
	}

	@Test
	public void stringToDate() throws ParseException {
		String dateString = "August 15, 2011";

		Calendar calendar = new GregorianCalendar();
		Date date = new SimpleDateFormat("MMMM d, yyyy",
				Locale.ENGLISH).parse(dateString);
		calendar.setTime(date);

		assertEquals(15, calendar.get(Calendar.DATE));
		assertEquals(Calendar.AUGUST, calendar
				.get(Calendar.MONTH));
		assertEquals(2011, calendar.get(Calendar.YEAR));
	}

	@Test
	public void stringTrim() {
		// trailing space removed
		assertEquals("test", "test ".trim());

		// leading space also removed
		assertEquals("test", "  test ".trim());

		// space in between is not trimmed
		assertEquals("t  est", "t  est ".trim());
	}

	@Test
	public void intToString() {
		int number = 25;
		String numberAsString = "" + number;
		assertEquals("25", numberAsString);
	}

	@Test
	public void intToStringApproach2() {
		int number = 25;
		String numberAsString = Integer.toString(number);
		assertEquals("25", numberAsString);
	}

	@Test
	public void integerToString() {
		Integer number = 25;
		String numberAsString = number.toString();
		assertEquals("25", numberAsString);
	}

	@Test
	public void stringToInteger() {
		String intAsString = "25";

		// If you want a Wrapper Integer - this is the best way
		Integer numberWrapper = Integer
				.valueOf(intAsString);
		assertEquals(25, numberWrapper.intValue());
	}

	@Test
	public void stringToInt() {
		String intAsString = "25";
		// If you want a primitive int - this is the best way
		int numberPrimitive = Integer.parseInt(intAsString);
		assertEquals(25, numberPrimitive);
	}

	@Test
	public void stringToDouble() {
		String doubleAsString = "25.25";

		// If you want a Wrapper number - this is the best way
		Double numberWrapper = Double
				.valueOf(doubleAsString);
		assertEquals(25.25, numberWrapper.doubleValue(),
				0.00);

		// If you want a primitive int - this is the best way
		double numberPrimitive = Double
				.parseDouble(doubleAsString);
		assertEquals(25.25, numberPrimitive, 0.00);
	}

	@Test
	public void stringToChar() {
		String oneCharacterString = "A";
		char character = oneCharacterString.charAt(0);
		assertEquals('A', character);
	}

	@Test
	public void stringToCharacter() {
		String oneCharacterString = "A";
		char char1 = oneCharacterString.charAt(0);
		Character character = Character.valueOf(char1);
		assertEquals(new Character('A'), character);
	}

	@Test
	public void charArrayToString() {
		char[] characters = { 'a', 'b', 'c', 'd' };
		String charactersCombined = String
				.valueOf(characters);
		assertEquals("abcd", charactersCombined);
	}

	@Test
	public void characterArrayToString() {
		char[] characters = { 'a', 'b', 'c', 'd' };
		String charactersCombined = new String(characters);
		assertEquals("abcd", charactersCombined);
	}

	@Test
	public void removeLastCharacterFromString() {
		String str = "COOLSTUFF";
		// Replace O with empty string ""
		String strWithLastCharacterRemoved = str.substring(
				0, str.length() - 1);
		assertEquals("COOLSTUF",
				strWithLastCharacterRemoved);
	}

	@Test
	public void concatenateStrings() {
		String string1 = "Sachin ";
		String string2 = "Tendulkar";
		String concatenatedString = string1 + string2;
		assertEquals("Sachin Tendulkar", concatenatedString);
	}

	@Test
	public void concatenateStringsApproach2() {
		String string1 = "Sachin ";
		String string2 = "Tendulkar";
		String concatenatedString = string1.concat(string2);
		assertEquals("Sachin Tendulkar", concatenatedString);
	}

	@Test
	public void reverseAString() {
		String string1 = "Sachin";
		String reversedString = new StringBuffer(
				string1).reverse().toString();
		assertEquals("nihcaS", reversedString);
	}
}