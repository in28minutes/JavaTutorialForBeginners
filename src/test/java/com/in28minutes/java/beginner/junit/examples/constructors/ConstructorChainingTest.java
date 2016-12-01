package com.in28minutes.java.beginner.junit.examples.constructors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConstructorChainingTest {

	/*
	 * Not ideal to use an inner classes
	 */
	class SuperClass {
		String name;// ideally should be private and accessed using getter

		public SuperClass(String name) {
			this.name = name;
		}
	}

	class SubClass extends SuperClass {
		int value;// ideally should be private and accessed using getter

		public SubClass(String name, int value) {
			super(name);// Calling the super class. Chaining.
			this.value = value;
		}
	}

	@Test
	public void constuctorChaining() {
		SubClass subClass = new SubClass("SAMPLE", 10);
		assertEquals("SAMPLE", subClass.name);
		assertEquals(10, subClass.value);
	}

}
