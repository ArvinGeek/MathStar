package com.adc.DesignPatterns;

public class ConcreteSubject extends Subject 
{
	private String state;
	public void changer(String newState)
	{
		state=newState;
		this.notifyObservers();
	}
}
