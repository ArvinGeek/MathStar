package com.adc.DesignPatterns;

public class Keypad 
{
	private Command playCmd;
	private Command rewindCmd;
	private Command stopCmd;
	public Keypad(Command play,Command stop, Command rewind) {
		// TODO Auto-generated constructor stub
		playCmd= play;
		stopCmd= stop;
		rewindCmd= rewind;
	}
	public void play() 
	{
		playCmd.execute();
	}
	public void stop()
	{
		stopCmd.execute();
	}
	public void rewind()
	{
		rewindCmd.execute();
	}

}
