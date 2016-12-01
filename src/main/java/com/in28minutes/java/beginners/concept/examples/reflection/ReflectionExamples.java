package com.in28minutes.java.beginners.concept.examples.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionExamples {
	public static Class<?>[] getListInterfaces() {
		Class<List> listClass = java.util.List.class;
		return listClass.getInterfaces();
	}

	public static Constructor<?>[] getArrayListConstructors() {
		Class<ArrayList> listClass = java.util.ArrayList.class;
		return listClass.getConstructors();
	}

	public static Field[] getArrayListDeclaredFields() {
		Class<ArrayList> listClass = java.util.ArrayList.class;
		return listClass.getDeclaredFields();
	}

	public static Method[] getListDeclaredMethods() {
		Class<List> listClass = java.util.List.class;
		return listClass.getDeclaredMethods();
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(ReflectionExamples
				.getListInterfaces()));
		// [interface java.util.Collection]
		System.out.println(Arrays.toString(ReflectionExamples
				.getArrayListConstructors()));
		// [public java.util.ArrayList(int), public java.util.ArrayList(),
		// public java.util.ArrayList(java.util.Collection)]

		System.out.println(Arrays.toString(ReflectionExamples
				.getArrayListDeclaredFields()));
		// [private static final long java.util.ArrayList.serialVersionUID,
		// private transient java.lang.Object[] java.util.ArrayList.elementData,
		// private int java.util.ArrayList.size]

		System.out.println(Arrays.toString(ReflectionExamples
				.getListDeclaredMethods()));
		/*
		 * [public abstract void java.util.List.add(int,java.lang.Object),
		 * public abstract boolean java.util.List.add(java.lang.Object), public
		 * abstract java.lang.Object java.util.List.get(int) ...
		 */

	}
}
