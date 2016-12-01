package com.in28minutes.java.beginner.junit.examples.arraylist;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class ArrayListTest {
	
	@Test
	public void arrayListContainsZeroValuesWhenCreated(){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		assertEquals(0,numbers.size()); //size gives number of elements in ArrayList
		assertTrue(numbers.isEmpty());
	}

	@Test
	public void creatingArrayListFromValues(){
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		assertEquals(4,numbers.size());
		assertEquals(new Integer(4),numbers.get(3));
	}

	@Test
	public void createArrayListFromArray(){
		String[] dogs = {"Puppy","Julie","Tommy"};
		List<String> dogsList = Arrays.asList(dogs);
		
		assertEquals(3,dogsList.size());
		assertEquals("Tommy",dogsList.get(2));
	}

	@Test
	public void arrayListCanContainDuplicateValues(){
		String[] dogs = {"Puppy","Julie","Tommy","Puppy"};
		List<String> dogsList = Arrays.asList(dogs);
		
		assertEquals(4,dogsList.size());
	}

	@Test(expected=UnsupportedOperationException.class)
	public void arraysAsListCreatesAnUnmodifyableList(){
		String[] dogs = {"Puppy","Julie","Tommy"};
		List<String> unmodifiableDogsList = Arrays.asList(dogs);

		unmodifiableDogsList.add("Puffy"); //Will throw an Exception. Same case with Remove.
		
		/* 
		 * NOTES:
		 * 
		 * Solution : removeValuesFromArrayListUsingIndex
		 * 
		 * @Test(expected=UnsupportedOperationException.class) - tells Junit framework
		 * to expect a exception of type UnsupportedOperationException
		 */
	}

	@Test
	public void arrayListChangeElement(){
		final String[] dogs = {"Puppy","Julie","Tommy"};
		List<String> dogsList = new ArrayList<String>(Arrays.asList(dogs));
		
		dogsList.set(1,"Blacky");//Replaces "Julie" with "Blacky"
		
		assertEquals("Blacky",dogsList.get(1)); 
	}

	@Test
	public void arrayListAdd(){
		String[] dogs = {"Puppy","Julie","Tommy"};
		List<String> dogsList = new ArrayList<String>(Arrays.asList(dogs));
		
		dogsList.add("Blacky");//Adds "Blacky" at end
		
		String[] expected = {"Puppy","Julie","Tommy","Blacky"};
		assertArrayEquals(expected,dogsList.toArray());
	}

	@Test
	public void arrayListAddInBetween(){
		String[] dogs = {"Puppy","Julie","Tommy"};
		List<String> dogsList = new ArrayList<String>(Arrays.asList(dogs));
		
		dogsList.add(1,"Blacky");//Adds "Blacky" at position 1 i.e. second element
		
		String[] expected = {"Puppy","Blacky","Julie","Tommy"};
		assertArrayEquals(expected,dogsList.toArray());
	}

	@Test
	public void arrayListRemoveUsingIndex(){
		String[] dogs = {"Puppy","Julie","Tommy"};
		List<String> dogsList = new ArrayList<String>(Arrays.asList(dogs));
		
		dogsList.remove(0);//Removes "Puppy" from the list above
		
		assertEquals(2,dogsList.size()); // Size = 3 - 1 = 2 
		assertEquals("Julie",dogsList.get(0)); // Julie becomes first element since
											   // Puppie is removed
		
		/*
		 * NOTES:
		 * 
		 * new ArrayList<String> helps us create a modifiable list
		 * refer usingArraysAsListCreatesAnUnmodifyableList
		 *  
		 */

	}

	@Test
	public void arrayListRemoveValue(){
		String[] dogs = {"Puppy","Julie","Tommy"};
		List<String> dogsList = new ArrayList<String>(Arrays.asList(dogs));
		
		dogsList.remove("Julie");//Removes "Puppy" from the list above
		
		assertEquals(2,dogsList.size()); //size = 2 - 1
		assertEquals("Tommy",dogsList.get(1)); //Tommy becomes 2nd since Julie is removed
		
		/*
		 * NOTES:
		 * 
		 * new ArrayList<String> helps us create a modifiable list
		 * refer usingArraysAsListCreatesAnUnmodifyableList
		 *  
		 */

	}

	@Test
	public void searchArrayList(){
		String[] dogs = {"Puppy","Julie","Tommy"};
		
		List<String> dogsList = Arrays.asList(dogs);
		
		assertTrue(dogsList.contains("Julie"));
		assertFalse(dogsList.contains("Braggy")); //Not in the list yet
		
	}

	@Test
	public void arrayListUtilityMethodsClearIsEmpty(){
		String[] dogs = {"Puppy","Julie","Tommy"};
		List<String> dogsList = new ArrayList<String>(Arrays.asList(dogs));
		
		assertFalse(dogsList.isEmpty());//List is not empty right now
		
		dogsList.clear(); //removes all elements from ArrayList
		
		assertTrue(dogsList.isEmpty());//Now the List is empty
	}

	@Test @Ignore("Prints Output and I hate it")
	public void arrayListForEachLoop(){
		String[] dogs = {"Puppy","Julie","Tommy"};
		for(String dog:dogs){
			System.out.print(dog);
		}
		//Output - PuppyJulieTommy (we use print and not println)
	}

	@Test
	public void arrayListToArray(){
		ArrayList<String> dogsList = new ArrayList<String>();
		dogsList.add("Puppy");
		dogsList.add("Julie");
		
		String[] dogsArray = {"Puppy","Julie"};
		assertArrayEquals(dogsArray, dogsList.toArray());
	}

	@Test
	public void arrayListSort() {

		List<Integer> arrayListToSort = Arrays.asList(55,34,13,100);
		
		Collections.sort(arrayListToSort);

		assertEquals(Arrays.asList(13,34,55,100),arrayListToSort);
	}
	
	@Test
	public void arrayListSortStrings() {

		List<String> arrayListToSort = Arrays.asList("ABC", "XYZ", "PQR");
		
		Collections.sort(arrayListToSort);

		assertEquals(Arrays.asList("ABC","PQR","XYZ"),arrayListToSort);
	}
	
	@Test
	public void arrayListSortWithComparator() {

		List<String> arrayListToSort = Arrays.asList("ABC", "XYZ", "PQR");
		
		Collections.sort(arrayListToSort,new Comparator<String>() {
			@Override
			public int compare(String string1, String string2) {
				return string2.compareTo(string1);
			}
		});
		
		//Above can be done simply using
		//Collections.sort(arrayListToSort,Collections.reverseOrder());
		//but couldn't find a simple example to explain comparator
		
		assertEquals(Arrays.asList("XYZ","PQR","ABC"),arrayListToSort);
	}

	
}