package com.lowes.vishnu.queue;

public class QueueMain {

	public static void main(String[] args) throws Exception {
		
		FixedCircularArrayQueue queue= new FixedCircularArrayQueue();
		for(int i=0 ;i<5;i++) {
			queue.enQueue(i);
		}
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
