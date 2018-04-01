package com.lowes.vishnu.stack;

public class StackMain {

	public static void main(String[] args) {
		
		FixedArrayStack stack =new FixedArrayStack();
		try {
			stack.push(1);
			stack.push(2);
			stack.push(3);
			System.out.println(stack.pop());
			System.out.println(stack.peek());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
