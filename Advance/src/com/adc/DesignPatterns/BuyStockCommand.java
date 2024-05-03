package com.adc.DesignPatterns;

class BuyStockCommand implements Command 
{
	private StockMarket stock;
	public BuyStockCommand(StockMarket stock) {
		// TODO Auto-generated constructor stub
		this.stock = stock;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.buy();

	}

}
