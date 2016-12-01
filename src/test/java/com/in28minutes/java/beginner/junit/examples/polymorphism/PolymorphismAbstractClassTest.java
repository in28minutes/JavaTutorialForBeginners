package com.in28minutes.java.beginner.junit.examples.polymorphism;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PolymorphismAbstractClassTest {
	abstract class Animal {
		abstract String bark();
	}

	class Dog extends Animal {
		public String bark() {
			return "BOW BOW";
		}
	}

	class Cat extends Animal {
		public String bark() {
			return "Meow Meow";
		}
	}

	@Test
	public void polymorphismAbstractClassExample() {
		Animal[] animals = { new Dog(), new Cat() };

		Animal animal = new Cat();

		animal.bark();

		assertEquals("BOW BOW", animals[0].bark());

		assertEquals("Meow Meow", animals[1].bark());
	}

}