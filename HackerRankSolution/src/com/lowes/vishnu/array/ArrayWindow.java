package com.lowes.vishnu.array;

public class ArrayWindow {

	public static void main(String[] args) {
		
		int [] a = {2,4,3,6,5,8,7,9,11};
		int win = 3;
		for(int i =0; i<= a.length -win ;i++) {
			
			int max =0;
			max = Math.max((Math.max(a[i], a[i+1])), a[i+2]);
			System.out.print(max + " ");
		}
	}

}
