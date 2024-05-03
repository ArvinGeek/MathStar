package com.adc.DesignPatterns;

import java.util.Vector;

public class Caretaker 
{
	private Vector mementos= new Vector();
	private Originator o;
	private int current;
	public Caretaker(Originator o) 
	{
		this.o=o;
		current =0;
	}
	public int createMemento()
	{
		Memento memento=o.createMemento();
		mementos.addElement(memento);		
		return current++;
	}
	public void restoreMemento(int index)
	{
		Memento memento = (Memento)mementos.elementAt(index);
		o.restoreMemento(memento);		
	}
	public void removeMemento(int index)
	{
		mementos.removeElementAt(index);
	}
}
