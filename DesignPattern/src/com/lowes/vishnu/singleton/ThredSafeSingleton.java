package com.lowes.vishnu.singleton;

public class ThredSafeSingleton {

	private static ThredSafeSingleton instance = null;
	
	private ThredSafeSingleton() {
		
	}
	
	public ThredSafeSingleton getInstance() {
		
		if(instance ==null) {
			synchronized(ThredSafeSingleton.class){
				if(instance ==null) {
					instance = new ThredSafeSingleton();
				}
			}
		}
		return instance;
	}
}
