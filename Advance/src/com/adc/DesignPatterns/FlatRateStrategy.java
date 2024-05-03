package com.adc.DesignPatterns;

public class FlatRateStrategy extends DiscountStrategy 
{
	private double price=0;
	private int copies=0;
	private double amount;
	public FlatRateStrategy(double price, int copies) {
		super(price, copies);
		// TODO Auto-generated constructor stub
		this.price=price;
		this.copies =copies;
	}
	public double getAmount()
	{
		return amount;
	}
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return copies * amount;
	}

}
