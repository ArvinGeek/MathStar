package com.adc.DesignPatterns;

public class Control 
{
	private Command onCommand,offCommand,changeChannel;
	public Control(Command on,Command off,Command channel) {
		// TODO Auto-generated constructor stub
		onCommand =on;
		offCommand =off;
		changeChannel = channel;
	}
	public void turnOn()
	{
		onCommand.execute();
	}
	public void turnOff()
	{
		offCommand.execute();
	}
	public void changeChannel()
	{
		changeChannel.execute();
	}
}
