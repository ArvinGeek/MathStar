package com.adc.DesignPatterns;

public class FlavorFactory {
	private CoffeeOrder[] flavors = new Flavor[10];
	private int ordersMade=0;
	private int totalFlavors=0;
	//工厂方法 根据所需风味提供咖啡
	public CoffeeOrder getOrder(String flavorToGet)
	{
		//int orderMade;
		if (ordersMade>0)
		{
			for (int i=0;i<ordersMade;i++)
			{
				if (flavorToGet.equals((flavors[i]).getFlavor()))
				{
					return flavors[i];
				}
			}
		}
		flavors[ordersMade]=new Flavor(flavorToGet);
		totalFlavors++;
		return flavors[ordersMade++];
	}
	public int getTotalFlavorsMade()
	{
		return totalFlavors;
	}
}
