package com.adc.DesignPatterns;

public class ChannelCommand implements Command {
	private Tv myTv;
	private int channel;
	public ChannelCommand(Tv tv,int channel) {
		// TODO Auto-generated constructor stub
		myTv=tv;
		this.channel= channel;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myTv.changeChannel(channel);
	}

}
