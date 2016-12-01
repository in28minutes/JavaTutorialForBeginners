package com.in28minutes.java.beginners.simple.design.patterns;

public class SingletonPattern {
	static class Singleton {
		private static Singleton instance = new Singleton();

		private Singleton() {
		}

		public static Singleton getSingleInstance() {
			return instance;
		}

	}
}