package com.adc.DesignPatterns;

public class Pc extends Composite {

	public Pc() {
		// TODO Auto-generated constructor stub
		super.add(new IntergratedBoard());
		super.add(new HardDisk());
		super.add(new Case());
	}
	public void accept(VisitorC v)
	{
		System.out.println("Pc has been visited");
		super.accept(v);
	}

}
