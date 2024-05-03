package com.adc.DesignPatterns;

public class Julia 
{
	private static Keypad keypad;
	private static AudioPlayer myAudio= new AudioPlayer();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	private static void test1()
	{
		Command play = new PlayCommand(myAudio);
		Command stop = new StopCommand(myAudio);
		Command rewind = new RewindCommand(myAudio);
		keypad= new Keypad(play,stop,rewind);
		keypad.play();
		keypad.stop();
		keypad.rewind();
		keypad.stop();
		keypad.play();
		keypad.stop();
	}
	public static void test2()
	{
		Command play = new PlayCommand(myAudio);
		Command stop = new StopCommand(myAudio);
		Command rewind = new RewindCommand(myAudio);
		MacroCommand  macro = new MacroAudioCommand();
		macro.add(play);
		macro.add(stop);
		macro.add(rewind);
		macro.add(stop);
		macro.add(play);
		macro.add(stop);
		macro.execute();
				
	}
	
	
	
}
