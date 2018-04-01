package com.lowes.vishnu.queue;

public class FixedCircularArrayQueue {

	private int [] queue;
	private int capacity;
	private int size;
	private static final int DEFAULT_CAPACITY=16;
	private int rear;
	private int front;
	
	public FixedCircularArrayQueue() {
		capacity=DEFAULT_CAPACITY;
		queue=new int[DEFAULT_CAPACITY];
		rear=0;
		front=0;
		size=0;
	}
	
	public FixedCircularArrayQueue(int cap) {
		capacity=cap;
		queue=new int[capacity];
		rear=0;
		front=0;
		size=0;
	}
	
	public void enQueue(int data) throws Exception {
		if(size==capacity) {
			throw new Exception("The queue is full...");
		}
		size++;
		queue[rear]=data;
		rear=(rear+1) % capacity;
	}
	
	public int deQueue() throws Exception {
		if(size==0) {
			throw new Exception("The queue is empty...");
		}
		int data;
		data=queue[front % capacity];
		front=(front+1) % capacity;
		size--;
		return data;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return size==capacity;
	}
	
	public int size() {
		return size;
	}
	
	
}
