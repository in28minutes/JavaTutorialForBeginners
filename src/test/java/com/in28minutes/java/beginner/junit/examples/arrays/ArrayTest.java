package com.in28minutes.java.beginner.junit.examples.arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Dimension;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.junit.Ignore;
import org.junit.Test;

public class ArrayTest {
	
	//How do you initialize an array?
	//How do you copy array?
	//Allocating an array dynamically in java?
	//How to change length of an array?
	//Explain with example how to initialize an array of objects?
	//How to sort an array?
	//Difference between Array and ArrayList?
	
	
	@Test
	public void arrayInitialization() {

		int[] initializedArray = { 100, 23, 55, 34 };

		assertEquals(100, initializedArray[0]);
		assertEquals(34, initializedArray[3]);
	}

	@Test
	public void stringArrayDeclaration() {

		String[] initializedArray = { "Puppy", "Julie",
				"Tommy" };

		assertEquals("Puppy", initializedArray[0]);
		assertEquals("Tommy", initializedArray[2]);
	}

	@Test
	public void arraySize() {

		int[] array = { 100, 23, 55, 34 };
		assertEquals(4, array.length);
	}

	@Test
	public void integerArrayDefaultValues() {
		int[] arrayWithoutInitialization = new int[5]; // No initialization

		assertEquals(5, arrayWithoutInitialization.length);

		assertEquals(0, arrayWithoutInitialization[0]);
		assertEquals(0, arrayWithoutInitialization[4]);// All values are
														// initialized/defaulted
														// to 0

		assertArrayEquals(new int[] { 0, 0, 0, 0, 0 },
				arrayWithoutInitialization);
	}

	@Test
	public void stringArrayDefaultValues() {
		String[] stringArray = new String[5];

		assertEquals(5, stringArray.length);

		assertEquals(null, stringArray[0]);
		assertEquals(null, stringArray[4]);
	}

	@Test
	public void searchArray() {

		String[] arrayToSearch = { "Tommy", "Julie",
				"Puppy" };

		final String valuePresentInArray = "Puppy";
		final String valueNotPresentInArray = "Bajji";

		// Searching arrays which are small 
		List<String> list = 
				Arrays.asList(arrayToSearch);
		
		assertTrue(list.contains
				(valuePresentInArray));
		
		assertFalse(list.contains
				(valueNotPresentInArray));

		// Searching arrays which are big and performance is important
		HashSet<String> hashSet = 
				new HashSet<String>(
						Arrays.asList(arrayToSearch));
		assertTrue(hashSet
				.contains(valuePresentInArray));
		assertFalse(hashSet
				.contains(valueNotPresentInArray));
	}

	@Test
	public void fillArrayValues() {
		int[] arrayToBeFilled = new int[4];

		// All values are set to 100
		Arrays.fill(arrayToBeFilled, 100); 

		assertArrayEquals(
			new int[] { 100, 100, 100, 100 },
			arrayToBeFilled);
	}

	@Test
	public void fillPartOfAnArray() {
		int[] arrayToBeFilled = new int[4];

		final int fromIndex = 1;
		final int toIndex = 3;

		// All values from (incl) fromIndex
		// to(not incl)toIndex set to 100
		Arrays.fill(arrayToBeFilled, 
				fromIndex, toIndex,100);
		
		assertArrayEquals(
			new int[] { 0, 100, 100, 0 },
			arrayToBeFilled);
	}

	@Test
	public void copyArrays() {
		int[] array = new int[] { 1, 2, 3, 4, 5 };

		final int newArrayLength = 4;

		// Copies newLength i.e. 4 values from array to copiedArray
		int[] copiedArray = Arrays.copyOf(array,
				newArrayLength);

		// Asserts on the copied array
		assertEquals(newArrayLength, copiedArray.length);
		assertArrayEquals(new int[] { 1, 2, 3, 4 },
				copiedArray);

		// Asserting that there are no changes in the original array
		assertEquals(5, array.length);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 },
				array);

	}

	@Test
	@Ignore
	/* Ignored as I hate tests created for just printing to output */
	public void understandLoopingInAnArray() {
		int[] arrayForLooping = new int[] { 0, 1, 2, 3, 4 };
		for (int arrayValue : arrayForLooping) {
			System.out.println(arrayValue);
		}
	}

	@Test
	public void arrayDynamicObjects() {
		Dimension firstObject = new Dimension(10, 20);
		Dimension secondObject = new Dimension(10, 20);

		Object[] dynamicArray = { firstObject, secondObject };

		assertEquals(2, dynamicArray.length);
	}

	@Test
	public void arrayToList() {

		String[] arrayToConvert = { "Puppy", "Julie",
				"Tommy" };

		List<String> convertedList = Arrays
				.asList(arrayToConvert);

		assertEquals("Puppy", convertedList.get(0));
		assertEquals(3, convertedList.size());
	}

	@Test
	public void arrayToVector() {

		String[] arrayToConvert = { "Puppy", "Julie",
				"Tommy" };

		Vector<String> convertedVector = new Vector<String>(
				Arrays.asList(arrayToConvert));

		assertEquals("Puppy", convertedVector.get(0));
		assertEquals(3, convertedVector.size());
	}

	@Test
	public void arrayToSet() {

		String[] arrayToConvert = { "Puppy", "Julie",
				"Tommy" };

		Set<String> set = new HashSet<String>(Arrays
				.asList(arrayToConvert));

		assertTrue(set.contains("Puppy"));
		assertEquals(3, set.size());
	}

	@Test
	public void arrayToMap() {

		String[] arrayToConvert = { "Puppy", "Julie",
				"Tommy" };

		// Unfortunately, we need a key and value
		// So, the best way is to loop around the array and add them to Map
		Map<String, String> map = new HashMap<String, String>();
		for (String value : arrayToConvert) {
			map.put(value, value);
		}

		assertEquals("Puppy", map.get("Puppy"));
		assertEquals(3, map.size());
	}

	@Test
	public void concatenateArrays() {

		// Array to be merged
		String[] array1 = { "Puppy", "Julie", "Tommy" };
		String[] array2 = { "Puppy2", "Julie2", "Tommy2" };

		String[] concatenatedArray = Arrays.copyOf(array1,
				array1.length + array2.length);
		// Create an Array with length sum of both arrays and
		// Values from first array

		System.arraycopy(array2, 0, concatenatedArray,
				array1.length, array2.length);
		// Copy the values from second array

		assertArrayEquals(new String[] { "Puppy", "Julie",
				"Tommy", "Puppy2", "Julie2", "Tommy2" },
				concatenatedArray);
	}

	@Test
	public void changeArrayLength() {

		// In Java, it is not possible to change the length of an array
		// However, it is possible to create a new array with the changed length
		int[] array = { 100, 23, 55, 34 };

		// Here we will make the array of size 4 increased to 6
		int[] arraySizeIncreased = Arrays.copyOf(array, 6);

		// Asserting that one of the new array values is zero
		assertEquals(0, arraySizeIncreased[5]);

		// It is also possible to decrease the size or length of an array
		int[] arraySizeDecreased = Arrays.copyOf(array, 3);

		// Check that the size (or length) of new array is 3
		assertEquals(3, arraySizeDecreased.length);
	}

	@Test
	public void arrayJoin() {

		String[] arrayToJoin = { "Puppy", "Julie", "Tommy" };

		/* Unfortunately, the only way to join right now is do it ourselves */
		StringBuilder joinedString = new StringBuilder();
		String seperator = ",";

		for (String value : arrayToJoin) {
			joinedString.append(value).append(seperator);
		}

		assertEquals("Puppy,Julie,Tommy,", joinedString
				.toString());
	}

	@Test
	public void arrayReverse() {

		int[] array = { 100, 23, 55, 34 };

		assertEquals(100, array[0]);
		assertEquals(34, array[3]);
	}

	@Test
	public void arraySort() {

		int[] arrayToSort = { 100, 23, 55, 34 };

		Arrays.sort(arrayToSort);

		assertArrayEquals(new int[] { 23, 34, 55, 100 },
				arrayToSort);
	}

	@Test
	public void arraySortStrings() {

		String[] arrayToSort = { "ABC", "XYZ", "PQR" };

		Arrays.sort(arrayToSort);

		assertArrayEquals(new String[] { "ABC", "PQR",
				"XYZ" }, arrayToSort);
	}

	@Test
	public void arraySortWithComparator() {

		String[] arrayToSort = { "ABC", "XYZ", "PQR" };

		Arrays.sort(arrayToSort, new Comparator<String>() {
			@Override
			public int compare(String string1,
					String string2) {
				return string2.compareTo(string1);
			}
		});

		// Above can be done simply using
		// Arrays.sort(arrayToSort,Collections.reverseOrder());
		// but couldn't find a simple example to explain comparator

		assertArrayEquals(new String[] { "XYZ", "PQR",
				"ABC" }, arrayToSort);
	}

	@Test
	public void arrayDeepToString() {
		int[] intArray = new int[] { 1, 2, 3, 4, 5 };
		// [I@7825d2b2] - Some memory address
		assertTrue(intArray.toString().contains("@"));

		String[] strArray = new String[] { "John", "Mary",
				"Bob" };
		// [Ljava.lang.String;@45d64c37]
		assertTrue(strArray.toString().contains("@"));

		// From Java 5
		assertEquals("[1, 2, 3, 4, 5]", Arrays
				.toString(intArray));
		assertEquals("[John, Mary, Bob]", Arrays
				.toString(strArray));

		// deepToString - if arrays contain arrays in them
		assertEquals("[John, Mary, Bob]", Arrays
				.deepToString(strArray));

	}

}