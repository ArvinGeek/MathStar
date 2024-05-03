package com.adc.DesignPatterns;

import java.util.Vector;

public class MacroAudioCommand implements MacroCommand 
{
	private Vector commandList = new Vector();
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Command nextCommand;
		System.out.println("Automated playback of stored commands...");
		for(int i=0;i<commandList.size();i++)
		{
			nextCommand=(Command)commandList.elementAt(i);
			nextCommand.execute();
		}
		System.out.println("Finished automated playback of stored commands.");
	}

	@Override
	public void remove(Command toRemove) {
		// TODO Auto-generated method stub
		commandList.removeElement(toRemove);
	}
	public void remove(int index) {
		// TODO Auto-generated method stub
		commandList.remove(index);
	}
	@Override
	public void add(Command toAdd) {
		// TODO Auto-generated method stub
		commandList.addElement(toAdd);
	}

}
