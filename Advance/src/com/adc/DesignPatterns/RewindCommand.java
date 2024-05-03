package com.adc.DesignPatterns;

public class RewindCommand implements Command {
	private AudioPlayer myAudio;
	public RewindCommand(AudioPlayer a) {
		// TODO Auto-generated constructor stub
		myAudio=a;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		myAudio.rewind();
	}

}
