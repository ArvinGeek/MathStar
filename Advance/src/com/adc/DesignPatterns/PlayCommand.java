package com.adc.DesignPatterns;

public class PlayCommand implements Command 
{
	private AudioPlayer myAudio;
	public PlayCommand(AudioPlayer a) {
		// TODO Auto-generated constructor stub
		myAudio=a;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myAudio.play();
	}

}
