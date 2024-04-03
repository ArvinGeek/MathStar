package com.adc.DesignPatterns;

import java.io.Serializable;

public class GoldRingedStaff implements Cloneable,Serializable {

	private float height =100.0F;
	private float diameter = 10.0F;
	public GoldRingedStaff() {
		// TODO Auto-generated constructor stub
	}
	public void grow()
	{
		this.diameter *=2.0;
		this.height *=2;
	}
	public void shrink()
	{
		this.diameter /=2.0;
		this.height /=2;
		
	}
	public void move() {}
	public float getHeight()
	{
		return height;
	}
	public void setHeight(float height)
	{
		this.height=height;
	}
	public float getDiameter()
	{
		return diameter;
	}
	public void setDiameter(float diameter)
	{
		this.diameter=diameter;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
