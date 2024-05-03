package com.adc.DesignPatterns;

public class SubA extends Super {
	public void operation(SubA a)
	{
		System.out.println("This is SubA.operation(SubA);");
		//s.operation(this);
	}
	public void operation(SubB a)
	{
		System.out.println("This is SubA.operation(SubB);");
		//s.operation(this);
	}
	public void operation(Super s)
	{
		System.out.println("This is SubA.operation(Super);");
		//s.operation(this);
	}

}
