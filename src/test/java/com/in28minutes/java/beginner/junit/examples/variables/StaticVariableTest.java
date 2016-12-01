package com.in28minutes.java.beginner.junit.examples.variables;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

@SuppressWarnings("static-access")
public class StaticVariableTest {

	@Test
	public void staticVariableDefaultValue() {
		StaticExample staticExample1 = new StaticExample();
		assertEquals(0, staticExample1.getStaticVariable()); // Compiles but not
	}

	@Test
	public void staticVariableOneCopyInExistence() {
		StaticExample staticExample1 = new StaticExample();
		StaticExample staticExample2 = new StaticExample();

		// Checking initial values on second object
		assertEquals(0, staticExample2.getNonStaticVariable());
		assertEquals(0, staticExample2.getStaticVariable());// Compiles but not
															// recommended

		// Setting Values for first Object
		staticExample1.setNonStaticVariable(100);
		staticExample1.setStaticVariable(100); // Compiles but not recommended

		assertEquals(0, staticExample2.getNonStaticVariable());// Non static
																// variable
																// value does
																// not change
		assertEquals(100, staticExample2.getStaticVariable());// Static variable
																// value changes

		// That is why this is the best way to access static variables and
		// methods
		// Through class name StaticExample - signifies it is a class variable
		assertEquals(100, StaticExample.getStaticVariable());
	}
}
