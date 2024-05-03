package com.adc.DesignPatterns;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer 
{

	public Watcher(Watched w)
	{
		w.addObserver(this);
	}
	@Override
	public void update(Observable ob, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Data has been changed to :'"+((Watched)ob).retrieveData()+"'");
	}

}
