package com.adc.DesignPatterns;

public class FooterDecorator extends OrderDecorator {

	public FooterDecorator(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
	}
	public void print()
	{
		super.order.print();
		printFooter();
		
	}
	private void printFooter()
	{
		System.out.println("=====================================");
		System.out.println("Total\t\t\t\t"+ formatCurrency(super.order.getGrandTotal()));
	}
}
