package com.lowes.vishnu.stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PoisonousPlant {
	static int poisonousPlants(int[] p) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> deadPlantsIndex = new Stack<Integer>();
        boolean deadPlantsRemain = true;
        for(int i=0; i<p.length; i++) {
            list.add(p[i]);
        }
        
        int days = 0;
        while(deadPlantsRemain) {
            
            for(int i=0; i<list.size()-1; i++) {
                if(list.get(i) < list.get(i+1)) {
                    deadPlantsIndex.push(i+1);
                }
            }
            if(deadPlantsIndex.isEmpty()) {
                deadPlantsRemain = false;
            }else{
                while(!deadPlantsIndex.isEmpty()) {
                int pt = deadPlantsIndex.pop();
                list.remove(pt);
                
                }
                days++;
            }
            
        }
        return days;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int result = poisonousPlants(p);
        System.out.println(result);
        in.close();
    }
}
