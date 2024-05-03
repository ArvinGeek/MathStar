package com.adc.DesignPatterns;

import java.util.Vector;

public abstract class Composite extends Equipment 
{
	private Vector parts = new Vector(10);
	public Composite() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void accept(VisitorC vis) {
		// TODO Auto-generated method stub
		for(int i=0; i<parts.size();i++)
		{
			((Equipment)parts.get(i)).accept(vis);
		}
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		double total =0;
		for(int i=0; i<parts.size();i++)
		{
			total +=((Equipment)parts.get(i)).price();
		}
		return total;
	}

	
	  protected void add(Equipment e) 
	  { 
		  parts.add(e); 
	  };
	 

}
