package com.adc.DesignPatterns;

public class CDAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		// TODO Auto-generated method stub
		return "Certificate of Deposite";
	}

	@Override
	protected double doCalculateInterestRate() {
		// TODO Auto-generated method stub
		return 0.065D;
	}

}
