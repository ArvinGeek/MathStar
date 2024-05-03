package com.adc.DesignPatterns;

public class MoneyMarketAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		// TODO Auto-generated method stub
		return "Money Market";
	}

	@Override
	protected double doCalculateInterestRate() {
		// TODO Auto-generated method stub
		return 0.045D;
	}

}
