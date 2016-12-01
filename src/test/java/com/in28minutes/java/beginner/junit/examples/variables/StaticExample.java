package com.in28minutes.java.beginner.junit.examples.variables;

public class StaticExample {
	private static int staticVariable;
	private int nonStaticVariable;

	public static int getStaticVariable() {
		return staticVariable;
	}

	public static void setStaticVariable(int count) {
		StaticExample.staticVariable = count;
	}

	public int getNonStaticVariable() {
		return nonStaticVariable;
	}

	public void setNonStaticVariable(int nonStaticVariable) {
		this.nonStaticVariable = nonStaticVariable;
	}

	public static void nonStaticVariablesAreNotAvailableInStaticMethods() {
		// this.nonStaticVariable = 10; //COMPILE ERROR
		staticVariable = 10;
		// Also, this Keyword is not available
		// this refers to object
		// static methods are class methods
	}

	public void staticVariablesAreAvailableInNonStaticMethods() {
		// this.staticVariable = 5; //This compiles but not recommended
		StaticExample.staticVariable = 5; // Static variables should be accessed
											// using
											// Class Name
		this.nonStaticVariable = 5;
	}
}