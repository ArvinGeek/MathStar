package com.adc.DesignPatterns;

public class Cpu extends Equipment {

	@Override
	public void accept(VisitorC vis) {
		// TODO Auto-generated method stub
		System.out.println("Cpu has been visited");
		vis.visitCpu(this);;

	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 800.00;
	}

}
