package com.adc.DesignPatterns;

public class StrategyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoDiscountStrategy noDS= new NoDiscountStrategy(1.5,2);
		System.out.println(noDS.calculateDiscount());
		FlatRateStrategy fRS= new FlatRateStrategy(1.5,2);
		fRS.setAmount(5);
		System.out.println(fRS.calculateDiscount());
		PercentageStrategy ps= new PercentageStrategy(1.5,2);
		ps.setPercent(0.5);
		System.out.println(ps.calculateDiscount());
	}

}
