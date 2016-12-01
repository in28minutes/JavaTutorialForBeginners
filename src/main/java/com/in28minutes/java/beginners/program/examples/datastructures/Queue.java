package com.in28minutes.java.beginners.program.examples.datastructures;

class Queue {
	private int maxSize;
	private long[] queueElements;
	private int front;
	private int rear;
	private int size;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queueElements = new long[maxSize];
		front = 0;
		rear = -1;
		size = 0;
	}

	public void insert(long j) {
		if(rear == maxSize - 1){
			System.out.println("Queue is Full");
			return;
		}
		queueElements[++rear] = j;
		size++;
	}

	public long remove() {
		long temp = queueElements[front++];
		size--;
		return temp;
	}

	public long peek() {
		return queueElements[front];
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
		Queue queue = new Queue(5);

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
	}
}