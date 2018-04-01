package com.lowes.vishnu.builder;

public class LunchOrder {

	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public LunchOrder(String bread) {
		this.bread =bread;
	}
	
	public LunchOrder(String bread ,String condiments) {
		this(bread);
		this.condiments=condiments;
	}
	
	public LunchOrder(String bread ,String condiments ,String dressing) {
		this(bread ,condiments);
		this.dressing=dressing;
	}
	
	public LunchOrder(String bread ,String condiments ,String dressing ,String meat) {
		this(bread ,condiments ,dressing);
		this.meat=meat;
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}

	
	
	
}
