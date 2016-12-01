package com.in28minutes.java.beginner.junit.examples.collection;

import static org.junit.Assert.assertArrayEquals;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class CollectionTest {


	@Test
	public void sortedCollection() {
		/* KNOWN ISSUE : Cannot contain Duplicates */
		Set<String> sortedSet = new TreeSet<String>();
		sortedSet.add("Zebra");

		sortedSet.add("Elephant");
		assertArrayEquals(new String[] { "Elephant", "Zebra" }, sortedSet
				.toArray());

		sortedSet.add("Giraffe");
		assertArrayEquals(new String[] { "Elephant", "Giraffe", "Zebra" },
				sortedSet.toArray());

		sortedSet.add("Bear");
		assertArrayEquals(
				new String[] { "Bear", "Elephant", "Giraffe", "Zebra" },
				sortedSet.toArray());
	}
}
