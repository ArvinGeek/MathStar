package com.adc.DesignPatterns;

public class NoDiscountStrategy extends DiscountStrategy {

	private double price=0;
	private int copies=0;
	public NoDiscountStrategy(double price, int copies) {
		super(price, copies);
		// TODO Auto-generated constructor stub
		this.price=price;
		this.copies =copies;
	}

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
