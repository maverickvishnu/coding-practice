package com.lowes.vishnu.stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTestEditor {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();
        String editor = "";
        Stack<String> stack = new Stack<>();
        stack.push(editor);
        while( query > 0){
            int ops = sc.nextInt();
            switch(ops) {
                case 1 :
                    String appnd = sc.next();
                    editor = editor +appnd;
                    stack.push(editor);
                    break;
                case 2 :
                    int del = sc.nextInt();
                    editor =editor.substring(0 ,editor.length()- del);
                    stack.push(editor);
                    break;
                case 3 :
                    int index = sc.nextInt();
                    System.out.println(editor.charAt(index-1));
                    break;
                case 4 :
                    stack.pop();
                    editor =stack.peek();
                    break;
                default :
                    break;
            }
            query--;
        }
    }
}
