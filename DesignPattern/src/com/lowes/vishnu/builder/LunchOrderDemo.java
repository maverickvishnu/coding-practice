package com.lowes.vishnu.builder;

public class LunchOrderDemo {


	public static void main(String [] args) {
		LunchOrderBuilder.Builder build = new LunchOrderBuilder.Builder();
		
		build.bread("wheat").condiments("lettuce").dressing("mayo").meat("chicken");
		
		LunchOrderBuilder lunchOrder= build.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
	
	}
	
	
}
