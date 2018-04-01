package com.lowes.vishnu.queue;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class DownToZero {

	public static  void main(String [] args) {
		Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++)
        {
            int n = in.nextInt();  
            HashMap<Integer,Integer> map = new HashMap<>();
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(n);
            map.put(n, 0);
            while(!queue.isEmpty() && !map.containsKey(0))
            {
                int num = queue.poll();
                int step = map.get(num);
                for(int i = 2; i <= Math.sqrt(num); i ++)
                {
                    if(num % i ==0 && num / i != 1)
                    {
                        if(!map.containsKey(num / i) || map.get(num / i) > step + 1)
                        {
                            map.put(num / i, step + 1);
                            queue.add( num / i);
                        }
                    }
                }
                if(!map.containsKey(num - 1) || map.get(num - 1) > step + 1)
                {
                    queue.add(num - 1);
                    map.put(num - 1, step + 1);
                }
            }
            System.out.println(map.get(0));
            
        }
	}
}
