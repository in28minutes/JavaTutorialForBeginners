package com.in28minutes.java.beginner.junit.examples.constructors;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbstractClassConstructorTest {

	/*
	 * Not ideal to use an inner classes
	 */
	abstract class AbstractClass{
		int multiple;
		int multiplier;
		
		/*Abstract Class Constructor*/
		AbstractClass(int multiple, int multiplier){
			this.multiple = multiple;
			this.multiplier = multiplier;
		}
		
		/*Abstract Method - Different algorithms possible*/
		abstract int multiply();
	}
	
	class DefaultConcreteClass extends AbstractClass{

		/*Delegation/Chaining*/
		DefaultConcreteClass(int multiple, int multiplier) {
			super(multiple, multiplier);
		}

		int multiply() {
			return multiple * multiplier;
		}
	}
	
	@Test
	public void abstractClassConstuctorChaining(){
		DefaultConcreteClass concreteClass = new DefaultConcreteClass(10,5);
		assertEquals(10 * 5,concreteClass.multiply());
	}

}
