package com.adc.DesignPatterns;

public class StockClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockMarket stockMarket= new StockMarket();
		BuyStockCommand buy= new BuyStockCommand(stockMarket);
		SellStockCommand sell= new SellStockCommand(stockMarket);
		testInvoker = new Broker(buy,sell);
		testInvoker.buy();
		testInvoker.sell();
	}
	private static Broker testInvoker;
}
