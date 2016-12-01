package com.in28minutes.java.beginner.junit.examples.constructors;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructorBasicsTest {
	/*
	 * Not ideal to use an inner classes similar to Student. Using here to make
	 * it easy to explain.
	 */
	class Student {
		String name;
	}

	@Test
	public void defaultConstructor() {
		Student student = new Student();// Use default constuctor provided by
										// Java.
		assertNull(student.name); //Default value since we did not initialize name
	}

	class StudentWithOneArgumentConstructor {
		String name;// Should ideally be private;

		public StudentWithOneArgumentConstructor(String name) {
			this.name = name;
		}
	}

	@Test
	public void oneArgumentConstructor(){
		/* COMPILE ERROR! Default Constructor no longer works!
		 * As soon as we create one constructor, Java expects us to provide all others
		 * StudentWithOneArgumentConstructor student = 
		 * 								new StudentWithOneArgumentConstructor();
		 */ 
		
		StudentWithOneArgumentConstructor student =
							new StudentWithOneArgumentConstructor("Tom");
		 assertEquals("Tom",student.name); 
	}
}
