package com.adc.DesignPatterns;

abstract class Mediator 
{
	public abstract void  colleagueChanged(Colleague c);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteMediator mediator = new ConcreteMediator();
		mediator.CreateConcreteMediator();
		Colleague c1 = new Colleague1(mediator);
		Colleague c2 = new Colleague2(mediator);
		mediator.colleagueChanged(c1);
	}

}
