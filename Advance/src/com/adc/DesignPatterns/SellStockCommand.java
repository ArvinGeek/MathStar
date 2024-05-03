package com.adc.DesignPatterns;

class SellStockCommand implements Command 
{
	private StockMarket stock;
	public SellStockCommand(StockMarket stock) {
		// TODO Auto-generated constructor stub
		this.stock = stock;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.sell();
	}

}
