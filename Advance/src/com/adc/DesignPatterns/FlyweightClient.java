package com.adc.DesignPatterns;

public class FlyweightClient 
{
	private static CoffeeOrder[] flavors= new Flavor[20];
	private static int ordersMade=0;
	private static FlavorFactory flavorFactory;
	//Ã·π©“ª±≠øß∑»
	private static void takeOrders(String aFlavor)
	{
		flavors[ordersMade++]= flavorFactory.getOrder(aFlavor);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flavorFactory = new FlavorFactory();
		
		takeOrders("Black Coffee");
		takeOrders("Capucino");
		takeOrders("Espresso");
		takeOrders("Espresso");
		takeOrders("Capucino");
		takeOrders("Capucino");
		takeOrders("Black Coffee");
		takeOrders("Espresso");
		takeOrders("Capucino");
		takeOrders("Black Coffee");
		takeOrders("Espresso");
		takeOrders("White Coffee");

		for(int i=0;i<ordersMade;i++)
		{
			//flavors[i].serve();
			flavors[i].serve(new Table(i));
		}
		System.out.println("\nTotal teaFlavor objects made:"+flavorFactory.getTotalFlavorsMade());
	}

}
