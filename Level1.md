\com\in28minutes\program1\Planet.java
```
package com.in28minutes.program1;

//Question Answered : What is Class? What is Object?
public class Planet {
	// name
	// distance from sun

	public static void main(String[] args) {
		Planet earth = new Planet();
		Planet mars = new Planet();
		Planet venus = new Planet();
	}
}

// Exercise 1 -> Create another instance of planet.
// Exercise 2 -> What are the other characteristics of a planet?
// Debug - Main is starting point of the program
```
\com\in28minutes\program2\Aeroplane.java
```
package com.in28minutes.program2;

//Learning : What is state of object? Each object has individual State.
public class Aeroplane {
	int currentSpeed;

	public static void main(String[] args) {
		Aeroplane aeroplane1 = new Aeroplane();
		aeroplane1.currentSpeed = 500;
		Aeroplane aeroplane2 = new Aeroplane();
		aeroplane2.currentSpeed = 0;
		Aeroplane aeroplane3 = new Aeroplane();
		aeroplane3.currentSpeed = 600;

		aeroplane2.currentSpeed = 300;
	}
}

// int currentSpeed

// Exercise 1 -> Create another instance of Aeroplance.
// Exercise 2 -> Change the speed of aeroplane3 to 1000?
// Debug and see the values
// We are breaking a few good programming principles!!!
```
\com\in28minutes\program3\Cycle.java
```
package com.in28minutes.program3;

//Learning : What is state of object? Each object has individual State.
//Learning : We use methods to change state of object. Behavior.
public class Cycle {
	int currentSpeed;

	void increaseSpeed() {
		currentSpeed = currentSpeed + 10;
	}

	public static void main(String[] args) {
		Cycle cycle1 = new Cycle();
		cycle1.currentSpeed = 500;

		Cycle cycle2 = new Cycle();
		cycle2.currentSpeed = 600;

		cycle1.increaseSpeed();

		cycle2.increaseSpeed();
	}
}

// Focus on Assignment Operator
// What is void?
// Debug and see the values
// We are breaking a few good programming principles!!!
// Exercise 1 -> Create a new method in cycle to decrease speed.
// We are going a little slow
```
\com\in28minutes\program4\MotorBike.java
```
package com.in28minutes.program4;

//Learning : Creating this class from scratch. From Zero
//Learning : Creating more methods and more variables 
//Learning : Print current state of an object
public class MotorBike {
	int currentSpeed;
	int currentGear;

	void increaseSpeed() {
		currentSpeed = currentSpeed + 10;
	}

	void decreaseSpeed() {
		currentSpeed = currentSpeed - 10;
	}

	void nextGear() {
		currentGear = currentGear + 1;
	}

	@Override
	public String toString() {
		return "MotorBike [currentSpeed=" + currentSpeed + ", currentGear=" + currentGear + "]";
	}

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		ducati.currentSpeed = 500;

		MotorBike honda = new MotorBike();
		honda.currentSpeed = 600;

		ducati.increaseSpeed();
		honda.increaseSpeed();
		ducati.nextGear();
		System.out.println(ducati);
	}

}

// Debug and see the values
// We are breaking a few good programming principles!!!
// State of an object should be changed only by a method on the object
// We do not have limits on Speed or Gears!!! We will get there soon!
// Exercise 1 -> Create the prevGear method
```
\com\in28minutes\program5\MotorBike.java
```
package com.in28minutes.program5;

//Learning : Special Method => Constructor
//Learning : Better Encapsulation
public class MotorBike {
	int currentSpeed;
	int currentGear;

	public MotorBike(int currentSpeed) {
		// currentSpeed is called parameter
		// this is a special reference variable to access
		// values from current object
		this.currentSpeed = currentSpeed;
	}

	void increaseSpeed() {
		currentSpeed = currentSpeed + 10;
	}

	void decreaseSpeed() {
		currentSpeed = currentSpeed - 10;
	}

	void nextGear() {
		currentGear = currentGear + 1;
	}

	void prevGear() {
		currentGear = currentGear - 1;
	}

	@Override
	public String toString() {
		return "MotorBike [currentSpeed=" + currentSpeed + ", currentGear=" + currentGear + "]";
	}

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(500);
		MotorBike honda = new MotorBike(600);
		ducati.increaseSpeed();
		honda.increaseSpeed();
	}
}

// How is constructor different from a normal method?
// Default value for a object member variable
// This is the first program that we created with good encapsulation!
// There are still minor things that need to fixed! We will discuss them next!
// add 500 to line 30 and show how eclipse can do magic
// Exercise 1 -> Create a constructor with both current speed and current gear!
// Exercise 2 -> Enhance earlier examples with constructors and use them!
```
\com\in28minutes\program6\MotorBike.java
```
package com.in28minutes.program6;

//Introduce If Condition
public class MotorBike {
	int currentSpeed;
	int currentGear;

	public MotorBike(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	void increaseSpeed() {
		currentSpeed = currentSpeed + 10;
	}

	void decreaseSpeed() {
		currentSpeed = currentSpeed - 10;
	}

	void nextGear() {
		currentGear = currentGear + 1;
	}

	void prevGear() {
		currentGear = currentGear - 1;
	}

	@Override
	public String toString() {
		return "MotorBike [currentSpeed=" + currentSpeed + ", currentGear=" + currentGear + "]";
	}

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(500);
		MotorBike honda = new MotorBike(600);
		ducati.increaseSpeed();
		honda.increaseSpeed();
		ducati.currentSpeed = ducati.currentSpeed + 10;
	}
}
```
