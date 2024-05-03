package com.adc.DesignPatterns;

public class Case extends Equipment {

	@Override
	public void accept(VisitorC vis) {
		// TODO Auto-generated method stub
		System.out.println("Case has been visited");
		vis.visitCase(this);;

	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 30.00;
	}

}
