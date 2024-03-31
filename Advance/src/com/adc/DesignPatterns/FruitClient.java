package com.adc.DesignPatterns;

public class FruitClient {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//try 

			try 
			{
				FruitGardener.factory("grape").grow();			
				FruitGardener.factory("apple").harvest();
				FruitGardener.factory("strawberry").plant();
			} 
			catch (BadFruitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
