package com.lowes.vishnu.queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueTwoStack {

	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	        int query = in.nextInt();
	        
	        Stack<Integer> stk1 = new Stack<Integer>();
	        Stack<Integer> stk2 = new Stack<Integer>();
	      
	        
	        while(query >0) {
	            int ops = in.nextInt();
	            
	            switch(ops){
	                case 1 :
	                     stk1.push(in.nextInt());
	                    break;
	                case 2 :
	                     if(stk2.isEmpty()) {
	                        while(!stk1.isEmpty()) {
	                            stk2.push(stk1.pop());
	                        }
	                      }  
	                         stk2.pop();
	                    break;
	                case 3 :
	                    if(stk2.isEmpty()) {
	                        while(!stk1.isEmpty()) {
	                            stk2.push(stk1.pop());
	                        }
	                    }
	               System.out.println(stk2.peek()); 
	                    break;
	                default :
	                    break;
	            }
	            query--;
	        }
	    }
}
