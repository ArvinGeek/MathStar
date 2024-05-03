package com.adc.DesignPatterns;

public class HardDisk extends Equipment {

	@Override
	public void accept(VisitorC vis) {
		// TODO Auto-generated method stub
		System.out.println("HardDisk has been visited");
		vis.visitHardDisk(this);;
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 200.00;
	}

}
