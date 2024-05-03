package com.adc.DesignPatterns;

public class PercentageStrategy extends DiscountStrategy 
{
	private double percent;
	private double price =0;
	private int copies =0;
	public PercentageStrategy(double price, int copies) {
		super(price, copies);
		// TODO Auto-generated constructor stub
		this.price=price;
		this.copies =copies;
	}
	public double getPercent()
	{
		return percent;
	}
	public void setPercent(double percent)
	{
		this.percent = percent;
	}
	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return copies * price * percent;
	}

}
