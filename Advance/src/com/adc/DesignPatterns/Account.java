package com.adc.DesignPatterns;

public abstract class Account 
{
	protected String accountNumber;
	public Account()
	{
		accountNumber =null;
	}
	public Account(String accountNumber) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
	}
	/*
	 *  模版方法计算利息数额
	 * */
	final public double calculateInterest()
	{
		double interestRate= doCalculateInterestRate();
		String accountType = doCalculateAccountType();
		double amount= calculateAmount(accountType,accountNumber);
		return amount* interestRate;
	}
	/*
	 * 
	  * 基本方法留给子类实现
	 * 
	 * */
	abstract protected String doCalculateAccountType();
	/*
	 * 
	  * 基本方法留给子类实现
	 * 
	 * */
	abstract protected double doCalculateInterestRate();
	final public double calculateAmount(String accountType,String accountNumber)
	{
		//retrieve amount from database...
		return 7253.00D;
	}
	
	
	
	
	
}
