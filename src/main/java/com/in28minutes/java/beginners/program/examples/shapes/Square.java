package com.in28minutes.java.beginners.program.examples.shapes;

public class Square {
	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}

	public int calculateArea() {
		return side * side;
	}

	public int calculatePerimeter() {
		return 4 * side;
	}

	public static void main(String[] args) {
		Square square = new Square(15);
		System.out.println(square.calculateArea());//225
		System.out.println(square.calculatePerimeter());//60
	}
}