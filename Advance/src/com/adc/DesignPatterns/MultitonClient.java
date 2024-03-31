package com.adc.DesignPatterns;

public class MultitonClient {

	private static Die die1,die2;
	public MultitonClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		die1=Die.getInstance(1);
		die2=Die.getInstance(2);
		die1.dice();
		die2.dice();
		System.out.println(die1.dice());
		System.out.println(die2.dice());
	}

}
