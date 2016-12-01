package com.in28minutes.java.beginners.program.examples.datastructures;

class CircularQueue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int size;

	public CircularQueue(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		size = 0;
	}

	public void insert(long j) {
		if(size == maxSize){
			System.out.println("Queue is Full");
		}
		if (rear == maxSize - 1)
			rear = -1;
		queArray[++rear] = j;
		size++;
	}

	public long remove() {
		long temp = queArray[front++];
		if (front == maxSize)
			front = 0;
		size--;
		return temp;
	}

	public long peek() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public boolean isFull() {
		return (size == maxSize);
	}

	public int size()
	{
		return size;
	}

	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(5);

		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);

		queue.remove(); // 10
		queue.remove(); // 20
		queue.remove(); // 30

		queue.insert(50);
		queue.insert(60);
		queue.insert(70);
		queue.insert(80);

		while (!queue.isEmpty()) { // all items
			long n = queue.remove(); // (40, 50, 60, 70, 80)
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
		queue.insert(50);
		queue.insert(60);
		queue.insert(70);
		queue.insert(80);
		queue.insert(50);
		queue.insert(60);
	}
}