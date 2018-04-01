package com.lowes.vishnu.stack;

public class FixedArrayStack {
	private int capacity;
	private static final int DEFAULT_CAPACITY=16;
	private int top;
	private int [] stack;
	
	public FixedArrayStack(){
		stack =new int[DEFAULT_CAPACITY];
		capacity=DEFAULT_CAPACITY;
		top=-1;
	}
	
	public FixedArrayStack(int cap) {
		capacity=cap;
		stack=new int[capacity];
		top=-1;
	}
	
	public int size() {
		return (top+1);
	}
	public boolean isEmpty() {
		return top<0;
	}
	
	public void push(int data) throws Exception {
		if(size()== capacity) {
			throw new Exception("The stack is full..");
		}
		stack[++top]=data;
	}
	
	public int pop() throws Exception {
		int data;
		if(isEmpty()) {
			throw new Exception("The stack is empty..");
		}
		data= stack[top];
		stack[top--]=Integer.MIN_VALUE;
		return data;
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("The stack is empty..");
		}
		return stack[top];
	}
}
