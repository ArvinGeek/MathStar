package com.adc.DesignPatterns;

public class OffCommand implements Command {
	private Tv myTv;

	public OffCommand(Tv tv) {
		// TODO Auto-generated constructor stub
		myTv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myTv.turnOff();
	}

}
