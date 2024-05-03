package com.adc.DesignPatterns;

public class Super 
{
	public void operation(Super s)
	{
		System.out.println("This is Super.operation(Super);");
		s.operation(this);
	}
}
