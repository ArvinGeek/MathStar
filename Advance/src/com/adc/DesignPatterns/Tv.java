package com.adc.DesignPatterns;

public class Tv 
{
	private int currentChannel=0;
	public void turnOn()
	{
		System.out.println("The television is on.");
	}
	public void turnOff()
	{
		System.out.println("The television is off.");
	}
	public void changeChannel(int channel)
	{
		currentChannel= channel;
		System.out.println("Now TV channel is "+ channel);
	}
}
