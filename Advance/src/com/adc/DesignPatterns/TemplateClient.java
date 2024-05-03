package com.adc.DesignPatterns;

public class TemplateClient {
	private static Account acct=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		acct =new MoneyMarketAccount();
		System.out.println("Interest from Money Market account " + acct.calculateInterest());
		acct = new CDAccount();
		System.out.println("Interest from CD account "+ acct.calculateInterest());
	}

}
