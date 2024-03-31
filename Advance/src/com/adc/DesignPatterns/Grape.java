package com.adc.DesignPatterns;

public class Grape implements Fruit {

	private boolean seedless;
	@Override
	public void grow() {
		// TODO Auto-generated method stub
		log("Grape is growing...");
	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		log("Grape has been harvested.");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		log("Grape has been planted.");

	}
	public static void log(String msg)
	{
		System.out.println(msg);
	}
	/*
	 * �����ѵ�ȡֵ����
	 * 
	 * */
	public boolean getSeedless()
	{
		return seedless;
	}
	/*
	 * �����ѵĸ�ֵ����
	 * 
	 * */
	public void setSeedless(boolean seedless) 
	{
		this.seedless= seedless;
	}
}
