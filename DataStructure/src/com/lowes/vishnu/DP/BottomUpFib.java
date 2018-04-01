package com.lowes.vishnu.DP;

import java.util.Scanner;

public class BottomUpFib {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to calculate fibonacci...");
		int fibNum = input.nextInt();
		
		int result =fib(fibNum);
		System.out.println(result);
	}
	
	public static int fib(int n) {
		
		int [] btmUp = new int[n+1];
		if(n==1 || n==2) {
			return 1;
		}
			btmUp[1]=1;
			btmUp[2]=1;
			for(int i=3 ;i <=n ; i++) {
				btmUp[i] =btmUp[i-1]+btmUp[i-2];
			}
		return btmUp[n];
	}

}
