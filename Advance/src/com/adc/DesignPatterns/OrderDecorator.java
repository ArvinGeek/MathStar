package com.adc.DesignPatterns;

abstract public class OrderDecorator extends Order {
	protected Order order;
	public OrderDecorator(Order order) {
		// TODO Auto-generated constructor stub
		this.order=order;
		this.setSalesDate(order.getSalesDate());
		this.setCustomerName(order.customerName);
	}
	public void print()
	{
		super.print();
	}

}
