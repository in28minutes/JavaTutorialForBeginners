package com.in28minutes.java.beginner.junit.examples.exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class TryCatchTest {

	class TryCatchExample {

		/* With RuntimeExceptions - 
		 * no need to declare throws */
		public void throwRuntimeException() {
			throw new RuntimeException("Sample Exception");
		}

		/*
		 * However, for all other Exceptions, 
		 * you have two options 
		 * Handle them - try catch finally 
		 * Or use throws.
		 * 
		 * Example below uses throws
		 */
		public void throwException() throws Exception {
			throw new Exception("Sample Exception");
		}

		public void sampleMethod() throws Exception {
			//Code..
			throwException();
			//More code...
		}

		public int tryCatch() {
			int returnValue = 0;
			try {
				throwRuntimeException();// this throws exception
			} catch (RuntimeException e) {
				returnValue = 1;
			}
			return returnValue;
		}

		public int tryCatchFinally() {
			int returnValue = 0;
			try {
				throwException();
			} catch (Exception e) {
				returnValue = 1;
			} finally {
				returnValue = 2;
			}
			return returnValue;
		}

		public int handleMultipleExceptions() {
			int returnValue = 0;
			try {
				throwRuntimeException();
				throwException();
			} catch (RuntimeException e) {
				returnValue = 1;
			} catch (Exception e) {
				returnValue = 2;
			}
			return returnValue;
		}
		
		public int exceptionsShouldBeOrdered() {
			int returnValue = 0;
			try {
				throwRuntimeException();
				throwException();
			} catch (Exception e) {
				returnValue = 2;
			} /* Un reachable code
			catch (RuntimeException e) {
				returnValue = 1;
			}*/
			return returnValue;
		}


	}

	@Test
	public void testTryCatch() {
		TryCatchExample example = new TryCatchExample();
		assertEquals(1, example.tryCatch());
	}

	@Test
	public void testFinally() {
		TryCatchExample example = new TryCatchExample();
		assertEquals(2, example.tryCatchFinally());
	}
	
	@Test
	public void testMultipleExceptionHandling() {
		TryCatchExample example = new TryCatchExample();
		assertEquals(1, example.handleMultipleExceptions());
	}

}