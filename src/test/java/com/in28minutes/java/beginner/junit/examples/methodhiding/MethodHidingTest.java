package com.in28minutes.java.beginner.junit.examples.methodhiding;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodHidingTest {
	class SuperClass{
		public int methodToHide(){
			return -1;
		}
	}

	class SubClass extends SuperClass{
		public int methodToHide(){
			return 1;
		}
	}
	
	@Test
	public void methodHidingBasicExample(){
		SubClass subClass = new SubClass();
		
		//Method from super class is hidden 
		//by the method in sub class
		assertEquals(1, subClass.methodToHide());		
	}

}