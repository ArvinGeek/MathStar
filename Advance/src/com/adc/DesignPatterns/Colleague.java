package com.adc.DesignPatterns;

public abstract class Colleague 
{
	private Mediator mediator;
	public Colleague(Mediator m)
	{
		this.mediator = m;
	}
	public Mediator getMediator()
	{
		return mediator;
	}
	public abstract void action();
	public void change()
	{
		mediator.colleagueChanged(this);
	}
}
