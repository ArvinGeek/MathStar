package com.adc.DesignPatterns;

abstract class Player 
{
	abstract public void handle();
	private Player successor;
	public Player()
	{
		successor=null;
	}
	protected void setSuccessor(Player aSuccessor)
	{
		successor = aSuccessor;
	}
	public void next()
	{
		if (successor!=null)
		{
			successor.handle();
		}
		else
		{
			System.out.println("Program terminating.");
			System.exit(0);
		}
	}
}
