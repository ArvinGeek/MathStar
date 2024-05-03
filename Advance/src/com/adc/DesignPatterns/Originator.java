package com.adc.DesignPatterns;

import java.util.Enumeration;
import java.util.Vector;

public class Originator 
{
	//private String state;
	private Vector states;
	private int index;
	public Originator()
	{
		states = new Vector();
		index = 0;
	}
	public Memento createMemento()
	{
		return new Memento(states,index);
	}
	public void restoreMemento(Memento memento)
	{
		this.states = memento.getStates();
		this.index = memento.getIndex();
	}
	public void printStates()
	{
		System.out.println("Total nummber of states : "+ index);
		for(Enumeration e = states.elements();e.hasMoreElements();)
		{
			System.out.println(e.nextElement());
		}
	}
	public void setState(String state)
	{
		this.states.addElement(state);
		index++;
		//System.out.println("Current state = " + this.state);
	}

}
