package com.adc.DesignPatterns;

public class HeaderDecorator extends OrderDecorator {

	public HeaderDecorator(Order order) {
		super(order);
		// TODO Auto-generated constructor stub
	}
	public void print()
	{
		this.printHeader();
		super.order.print();
	}
	private void printHeader()
	{
		System.out.println("\t***\tInvoice\t***");
		System.out.println("XYZ Incorporated\nDate of Sale:");
		System.out.println(order.getSalesDate());
		System.out.println("=====================================");
		System.out.println("Item\t\tUnits\tUnitPrice\tSubtotal");
	}

}
