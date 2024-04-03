package com.adc.DesignPatterns;
import java.util.Date;
public class DecoratorClient {
	private static Order order;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		order = new SalesOrder();
		order.setSalesDate(new Date());
		order.setCustomerName("XYZ Repair Shop");
		OrderLine line1=new OrderLine();
		line1.setItemName("FireWheel Tire");
		line1.setUnitPrice(153.23);
		line1.setUnits(4);
		order.addItem(line1);
		OrderLine line2= new OrderLine();
		line2.setItemName("Front Fender");
		line2.setUnitPrice(300.45);
		line2.setUnits(1);
		order.addItem(line2);
		order =new HeaderDecorator(new FooterDecorator(order));
		//HeaderDecorator hdo=new HeaderDecorator(order);
		//hdo.print();
		order.print();
	}

}
