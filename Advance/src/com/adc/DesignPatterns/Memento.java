package com.adc.DesignPatterns;

import java.util.Vector;

public class Memento 
{
	//private String state;
	private Vector states;
	private int index;

	public Memento(Vector states,int index)
	{
		this.states = states;
		this.index = index;
	}
	public Vector getStates()
	{
		return this.states;
	}
	public int getIndex()
	{
		return this.index;
	}
}
