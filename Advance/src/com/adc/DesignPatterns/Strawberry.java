package com.adc.DesignPatterns;

public class Strawberry implements Fruit {

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		log("Strawberry is growing...");
	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		log("Strawberry has been harvested.");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		log("Strawberry has been planted.");

	}
    public static void log(String msg) 
    {
    	System.out.println(msg);
    }
}
