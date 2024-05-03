package com.adc.DesignPatterns;

public class SuperClient 
{
	private static Super a;
	private static Super b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a= new SubA();
		b= new SubB();
		a.operation(b);
	}

}
