package com.adc.DesignPatterns;

public class Flavor extends CoffeeOrder {
	private String flavor;
	public Flavor(String flavor) {
		// TODO Auto-generated constructor stub
		this.flavor = flavor;
	}

	@Override
	public void serve() {
		// TODO Auto-generated method stub
		System.out.println("Serving flavor "+flavor);
	}
	public void serve(Table table)
	{
		System.out.println("Serving table "+ table.getNumber()+"   With flavor "+ flavor);
	}

	@Override
	public String getFlavor() {
		// TODO Auto-generated method stub
		return this.flavor;
	}

}
