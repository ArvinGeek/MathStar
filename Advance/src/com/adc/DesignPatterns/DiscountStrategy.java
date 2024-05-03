package com.adc.DesignPatterns;



public abstract class DiscountStrategy {
	private double price =0;
	private int copies =0;
	
	public abstract double calculateDiscount();
	
	public DiscountStrategy(double price,int copies) 
	{
		this.price=price;
		this.copies =copies;
	}

}
