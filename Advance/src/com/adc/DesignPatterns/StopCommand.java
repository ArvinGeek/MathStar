package com.adc.DesignPatterns;

public class StopCommand implements Command {
	private AudioPlayer myAudio;
	public StopCommand(AudioPlayer a) {
		// TODO Auto-generated constructor stub
		myAudio =a;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myAudio.stop();
	}

}
