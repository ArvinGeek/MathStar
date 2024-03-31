package com.adc.DesignPatterns;

public class Apple implements Fruit {
	
	private int treeAge;
	
	public void grow() 
	{
		log("Apple is growing...");
	}
	
	public void harvest() {
		log("Apple has been harvested.");
	}
	
	@Override
	public void plant() {
		// TODO Auto-generated method stub
		log("Apple has been planted.");
	}

	/*
	 * ¸¨Öú·½·¨
	 * 
	 * */
	public static void log(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}
	public int getTreeAge()
	{
		return treeAge;
	}
	public void setTreeAge(int treeAge)
	{
		this.treeAge=treeAge;
	}
}
