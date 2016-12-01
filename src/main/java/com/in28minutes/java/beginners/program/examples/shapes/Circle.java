package com.in28minutes.java.beginners.program.examples.shapes;

public class Circle {
	
	private final static double PI = 22.0/7.0;
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public double calculateArea() {
		return PI * radius * radius;
	}

	public double calculatePerimeter() {
		return 2 * PI * radius;
	}

	public static void main(String[] args) {
		Circle square = new Circle(15);
		System.out.println(square.calculateArea());//707.1428571428571
		System.out.println(square.calculatePerimeter());//94.28571428571428
	}
}