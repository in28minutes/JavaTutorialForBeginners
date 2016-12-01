package com.in28minutes.java.beginners.program.examples.number;

public class ComplexNumber {
	private int real;
	private int imaginary;

	public ComplexNumber(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	public int getReal() {
		return real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public ComplexNumber add(ComplexNumber number) {
		return new ComplexNumber(this.real
				+ number.getReal(), this.imaginary
				+ number.getImaginary());
	}

	public ComplexNumber subtract(ComplexNumber number) {
		return new ComplexNumber(this.real
				- number.getReal(), this.imaginary
				- number.getImaginary());
	}

	public ComplexNumber multiply(ComplexNumber number) {
		int real = this.real * number.real - this.imaginary
				* number.imaginary;
		int imaginary = this.real * number.imaginary
				+ this.imaginary * this.real;
		return new ComplexNumber(real, imaginary);
	}

	@Override
	public String toString() {
		return "ComplexNumber [real=" + real
				+ ", imaginary=" + imaginary + "]";
	}

	public static void main(String[] args) {

		ComplexNumber complexNumber1 = new ComplexNumber(5,
				15);
		ComplexNumber complexNumber2 = new ComplexNumber(3,
				12);

		//ComplexNumber [real=8, imaginary=27]
		System.out.println(complexNumber1
				.add(complexNumber2));

		//ComplexNumber [real=2, imaginary=3]
		System.out.println(complexNumber1
				.subtract(complexNumber2));

		//ComplexNumber [real=-165, imaginary=135]
		System.out.println(complexNumber1
				.multiply(complexNumber2));

	}

}
