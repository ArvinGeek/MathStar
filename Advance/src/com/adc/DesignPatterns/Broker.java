package com.adc.DesignPatterns;

public class Broker 
{
	private Command buyCommand , sellCommand;
	public Broker(Command buy,Command sell) {
		// TODO Auto-generated constructor stub
		buyCommand = buy;
		sellCommand = sell;
	}
	void buy()
	{
		buyCommand.execute();
	}
	void sell()
	{
		sellCommand.execute();
	}
}
