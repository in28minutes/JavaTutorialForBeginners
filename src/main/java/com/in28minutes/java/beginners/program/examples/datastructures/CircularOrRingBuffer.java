package com.in28minutes.java.beginners.program.examples.datastructures;

import java.util.Arrays;

class CircularOrRingBuffer {
	private long[] buffer;
	private int start;
	private int end;
	private int maxSize;

	public CircularOrRingBuffer(int size) {
		buffer = new long[size];
		start = 0;
		end = -1;
		this.maxSize = size;
	}

	public void insert(long j) {
		if (end == maxSize - 1)
			end = -1;
		buffer[++end] = j;
	}

	public boolean isEmpty() {
		return (start==end);
	}

	public int size()
	{
		return maxSize;
	}

	@Override
	public String toString() {
		return String
				.format("CircularOrRingBuffer [buffer=%s, start=%s, end=%s, maxSize=%s]",
						Arrays.toString(buffer), start,
						end, maxSize);
	}

	public static void main(String[] args) {
		CircularOrRingBuffer circularBuffer = new CircularOrRingBuffer(5);

		circularBuffer.insert(10);
		System.out.println(circularBuffer);
		circularBuffer.insert(20);
		System.out.println(circularBuffer);
		circularBuffer.insert(30);
		System.out.println(circularBuffer);
		circularBuffer.insert(40);
		System.out.println(circularBuffer);
		circularBuffer.insert(50);
		System.out.println(circularBuffer);
		circularBuffer.insert(60);
		System.out.println(circularBuffer);
		circularBuffer.insert(70);
		System.out.println(circularBuffer);
		circularBuffer.insert(80);
		System.out.println(circularBuffer);
	}
}