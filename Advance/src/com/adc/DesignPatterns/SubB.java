package com.adc.DesignPatterns;

public class SubB extends Super {
	public void operation(SubA a)
	{
		System.out.println("This is SubB.operation(SubA);");
		//s.operation(this);
	}
	public void operation(SubB a)
	{
		System.out.println("This is SubB.operation(SubB);");
		//s.operation(this);
	}
	public void operation(Super s)
	{
		System.out.println("This is SubB.operation(Super);");
		//s.operation(this);
	}
}
