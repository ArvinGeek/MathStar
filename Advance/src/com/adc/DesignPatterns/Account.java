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
	 *  ģ�淽��������Ϣ����
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
	  * ����������������ʵ��
	 * 
	 * */
	abstract protected String doCalculateAccountType();
	/*
	 * 
	  * ����������������ʵ��
	 * 
	 * */
	abstract protected double doCalculateInterestRate();
	final public double calculateAmount(String accountType,String accountNumber)
	{
		//retrieve amount from database...
		return 7253.00D;
	}
	
	
	
	
	
}
