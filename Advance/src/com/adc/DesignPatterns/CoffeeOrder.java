package com.adc.DesignPatterns;

public abstract class CoffeeOrder 
{
	//½«¿§·ÈÂô¿ÍÈË
	
	
	
	public abstract void serve();
	public abstract void serve(Table table);
	
	public abstract String getFlavor();
	public CoffeeOrder() {
		// TODO Auto-generated constructor stub
	}

}
