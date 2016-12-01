package com.in28minutes.java.beginner.junit.examples.innerclass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class NestedClassTest {
	@Test
	public void staticClass() {

		// Static Nested Class can be created without needing to create its
		// parent. Without creating NestedClassesExample, we created
		// StaticNestedClass
		NestedClass.StaticNestedClass staticNestedClass1 = 
				new NestedClass.StaticNestedClass();
		staticNestedClass1.setStaticNestedClassVariable(5);

		NestedClass.StaticNestedClass staticNestedClass2 = 
				new NestedClass.StaticNestedClass();
		staticNestedClass2.setStaticNestedClassVariable(10);

		// Static Nested Class member variables are not static. They can have
		// different values.
		assertEquals(5, staticNestedClass1.getStaticNestedClassVariable());
		assertEquals(10, staticNestedClass2.getStaticNestedClassVariable());
	}

	@Test
	public void innerClass() {
		// COMPILER ERROR! You cannot create an inner class on its own.
		// InnerClass innerClass = new InnerClass();
		NestedClass example = new NestedClass();

		// To create an Inner Class you need an instance of Outer Class
		NestedClass.InnerClass innerClass = example.new InnerClass();

		assertEquals(0, innerClass.getInnerClassVariable());
	}
}