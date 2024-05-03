package com.adc.DesignPatterns;

public class Joe {
	//private Control conctrol;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	private static void test1()
	{
		Tv myTv= new Tv();
		OnCommand on= new OnCommand(myTv);
		OffCommand off = new OffCommand(myTv);
		ChannelCommand channel = new ChannelCommand(myTv,2);
		Control control = new Control(on,off,channel);
		control.turnOn();
		control.changeChannel();
		control.turnOff();
	}
	
}
