package com.adc.DesignPatterns;

public class OnCommand implements Command {
	private Tv myTv;
	public OnCommand(Tv tv) {
		// TODO Auto-generated constructor stub
		myTv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myTv.turnOn();
	}

}
