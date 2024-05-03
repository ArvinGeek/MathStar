package com.adc.DesignPatterns;

public class IntergratedBoard extends Composite {

	public IntergratedBoard() {
		// TODO Auto-generated constructor stub
		super.add(new MainBoard());
		super.add(new Cpu());
	}
	public void accept(VisitorC v)
	{
		System.out.println("IntergrateBoard has been visited");
		super.accept(v);
	}

}
