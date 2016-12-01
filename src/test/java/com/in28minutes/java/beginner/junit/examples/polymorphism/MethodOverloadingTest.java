package com.in28minutes.java.beginner.junit.examples.polymorphism;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodOverloadingTest {
	class ExampleClass{
		public int overloadedMethod(){
			return overloadedMethod(0,0);
		}
		
		public int overloadedMethod(int a){
			return overloadedMethod(a,0);
		}
		
		public int overloadedMethod(int a, int b){
			//usually something complicated is done 
			//here. doing a+b to keep it simple :)
			return a + b; 
		}
	}
	
	@Test
	public void methodOverloadingTest(){
		ExampleClass example = new ExampleClass();
		
		assertEquals(0,
				example.overloadedMethod());
		assertEquals(5,
				example.overloadedMethod(5));
		assertEquals(15,
				example.overloadedMethod(5,10));
	}
}
