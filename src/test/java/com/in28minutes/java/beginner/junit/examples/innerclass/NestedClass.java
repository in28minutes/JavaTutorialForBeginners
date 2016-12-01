package com.in28minutes.java.beginner.junit.examples.innerclass;

public class NestedClass {
	@SuppressWarnings("unused")
	private int outerClassVariable;

	public static class StaticNestedClass {
		private int staticNestedClassVariable;

		public int getStaticNestedClassVariable() {
			return staticNestedClassVariable;
		}

		public void setStaticNestedClassVariable(int staticNestedClassVariable) {
			this.staticNestedClassVariable = staticNestedClassVariable;
		}

		public void privateVariablesOfOuterClassAreNOTAvailable() {
			// outerClassVariable = 5; //COMPILE ERROR
		}
	}

	public class InnerClass {
		private int innerClassVariable;

		public int getInnerClassVariable() {
			return innerClassVariable;
		}

		public void setInnerClassVariable(int innerClassVariable) {
			this.innerClassVariable = innerClassVariable;
		}

		public void privateVariablesOfOuterClassAreAvailable() {
			outerClassVariable = 5; // we can access the value and change it
		}
	}

}