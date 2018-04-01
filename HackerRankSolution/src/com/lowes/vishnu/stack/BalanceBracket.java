package com.lowes.vishnu.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {

	static String isBalanced(String s) {
        Stack<Character> stack=new Stack<Character>();
        for(char ch:s.toCharArray()){
            if(ch=='(') {
                stack.push(')');
            }   
            else if(ch=='{') {
               stack.push('}'); 
            }
            else if(ch=='['){
                stack.push(']');
            }
            else if(stack.isEmpty()||stack.pop()!=ch) {
                return "NO";
            }
        }
               return stack.isEmpty() ? "YES" : "NO";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
