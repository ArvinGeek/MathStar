package com.adc.DesignPatterns;
import java.util.HashMap;

public class RegSingletonChild extends RegSingleton {

	public RegSingletonChild() {
		// TODO Auto-generated constructor stub
	}
	static public RegSingletonChild getInstance()
	{
		return (RegSingletonChild)RegSingleton.getInstance("com.adc.DesignPatterns.RegSingletonChild");
	}
	public String about()
	{
		return "Hello, I am RegSingletonChild.";
	}
}
