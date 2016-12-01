package com.in28minutes.java.beginner.junit.examples.polymorphism;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolymorphismBasicsTest {
	class SuperClass{
		public int methodToOverride(){
			return -1;
		}
	}

	class SubClass1 extends SuperClass{
		public int methodToOverride(){
			return 1;
		}
	}

	class SubClass2 extends SuperClass{
		public int methodToOverride(){
			return 2;
		}
	}
	
	@Test
	public void polymorphismBasicExample(){
		SuperClass[] superClass = {new SuperClass(), new SubClass1(),new SubClass2()};
		
		//Method from super class is called
		assertEquals(-1, superClass[0].methodToOverride());
		
		//Method from sub class 1 is called
		assertEquals(1, superClass[1].methodToOverride());

		//Method from sub class 2 is called
		assertEquals(2, superClass[2].methodToOverride());

	}

}