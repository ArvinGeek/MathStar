package com.adc.DesignPatterns;

public class ConcreteMediator extends Mediator 
{
	private Colleague1 colleague1;
	private Colleague2 colleague2;
	@Override
	public void colleagueChanged(Colleague c) {
		// TODO Auto-generated method stub
		colleague1.action();
		colleague2.action();
	}
	public void CreateConcreteMediator()
	{
		colleague1 = new Colleague1(this);
		colleague2 = new Colleague2(this);
	}
	public Colleague1 getColleague1()
	{
		return colleague1;
	}
	public Colleague2 getColleague2()
	{
		return colleague2;
	}	
}
