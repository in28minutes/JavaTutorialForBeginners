package com.in28minutes.java.beginners.program.examples.datastructures;

class Stack {
	private int maxSize;
	private long[] stackElements;
	private int topOfStack;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stackElements = new long[maxSize];
		topOfStack = -1;
	}

	public void push(long element) {
		if (isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		stackElements[++topOfStack] = element;
	}

	public long pop() {
		if (isFull()) {
			new RuntimeException("Empty Stack");
		}
		return stackElements[topOfStack--];
	}

	public long peek() {
		return stackElements[topOfStack];
	}

	public boolean isEmpty() {
		return (topOfStack == -1);
	}

	public boolean isFull() {
		return (topOfStack == maxSize - 1);
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);//Stack is Full Message

		System.out.println(stack.pop()); // 50
		System.out.println(stack.pop()); // 40
		System.out.println(stack.pop()); // 30
		System.out.println(stack.pop()); // 20
		System.out.println(stack.pop()); // 10

		System.out.println(stack.pop()); // Empty Stack - Exception

	}
}