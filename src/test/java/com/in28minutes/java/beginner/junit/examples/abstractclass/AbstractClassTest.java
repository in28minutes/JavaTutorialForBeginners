package com.in28minutes.java.beginner.junit.examples.abstractclass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("unused")
public class AbstractClassTest {

	abstract class Animal {

		//Abstract class can have constructor(s)		
		/*public Animal(String name) {
			this.name = name;
		}*/

		//Abstract class can have member variables
		private String name;

		abstract String bark();

		//Abstract class can have 
		//fully defined member methods
		public void setName(String name) {
			this.name = name;
		}
	}

	class Dog extends Animal {
		public String bark() {
			return "BOW BOW";
		}
	}

	@Test
	public void abstractClassExample() {
		Dog dog = new Dog();
		assertEquals("BOW BOW", dog.bark());
	}

}