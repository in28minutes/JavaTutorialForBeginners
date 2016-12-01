package com.in28minutes.java.beginner.junit.examples.constructors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CopyConstructorTest {
	/* Inner class only to explain. Dont use in projects */

	class Student {
		// should ideally be private
		String name;
		// should ideally be private
		int marks;

		// Typical Constructor
		Student(String name, int marks) {
			this.name = name;
			this.marks = marks;
		}

		// Copy Constructor - constructor 
		// which receives the same type
		// as current class as argument
		Student(Student student) {
			name = student.name;
			marks = student.marks;
		}
	}

	@Test
	public void copyConstructorTest() {
		Student studentInstance = new Student("Rithu", 100);

		// uses copy constructor
		Student studentCopy = new Student(studentInstance); 

		assertEquals("Rithu", studentCopy.name);
		assertEquals(100, studentCopy.marks);
	}
}
