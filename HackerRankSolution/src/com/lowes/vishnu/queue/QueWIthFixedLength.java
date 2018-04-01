package com.lowes.vishnu.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class QueWIthFixedLength {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i< n ;i++){
            a[i] = sc.nextInt();
        }
        while(q >0){
            int d =sc.nextInt();
            int minmax = Integer.MAX_VALUE;
            Deque<Integer> maxqueue = new LinkedList();
            for(int j=0; j<d; j++){
             while(!maxqueue.isEmpty() && a[maxqueue.getLast()] < a[j])
                maxqueue.removeLast();
                maxqueue.addLast(j);
            }
            for(int j=d; j<n; j++){
                minmax = Math.min(a[maxqueue.getFirst()], minmax);
                while(!maxqueue.isEmpty() && maxqueue.getFirst()<=j-d)
                    maxqueue.removeFirst();
                while(!maxqueue.isEmpty() && a[maxqueue.getLast()] < a[j])
                    maxqueue.removeLast();
                    maxqueue.addLast(j);
            }
            
            System.out.println(Math.min(minmax, a[maxqueue.getFirst()]));
            q--;
        }
    }
}
