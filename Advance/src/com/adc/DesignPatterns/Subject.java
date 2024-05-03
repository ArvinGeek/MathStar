package com.adc.DesignPatterns;

import java.util.Enumeration;
import java.util.Vector;

public class Subject {
	private Vector observersVector= new java.util.Vector();
	/*
	 * 调用这个方法登记一个新的观察者对象
	 * */
	public void attach(Observer observer)
	{
		observersVector.addElement(observer);
	}
	/*
	 *  调用这个方法删除一个已经登记过的观察者对象
	 * */
	public void detach(Observer observer)
	{
		observersVector.removeElement(observer);
	}
	/*
	 *  调用这个方法通知所有登记过的观察者对象
	 * 
	 * */
	public void notifyObservers()
	{
		Enumeration enumeration= observers();
		while(enumeration.hasMoreElements())
		{
			((Observer)enumeration.nextElement()).update();
		}
	}
	public Enumeration observers()
	{
		return ((Vector)observersVector.clone()).elements();
	}
}
