package com.in28minutes.java.beginners.simple.design.patterns;

public enum MySingletonUsingEnum {
	INSTANCE;
	private MySingletonUsingEnum() {
		System.out.println("Here");
	}

	public String retrieveSomething() {
		return "DUMMY";
	}

}