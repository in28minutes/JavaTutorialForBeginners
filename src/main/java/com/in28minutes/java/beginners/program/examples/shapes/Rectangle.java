package com.in28minutes.java.beginners.program.examples.shapes;

public class Rectangle {
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int calculateArea() {
		return length * breadth;
	}

	public int calculatePerimeter() {
		return 2 * (length + breadth);
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 15);
		System.out.println(rect.calculateArea());//150
		System.out.println(rect.calculatePerimeter());//50
	}
}