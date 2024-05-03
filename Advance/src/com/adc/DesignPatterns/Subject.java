package com.adc.DesignPatterns;

import java.util.Enumeration;
import java.util.Vector;

public class Subject {
	private Vector observersVector= new java.util.Vector();
	/*
	 * ������������Ǽ�һ���µĹ۲��߶���
	 * */
	public void attach(Observer observer)
	{
		observersVector.addElement(observer);
	}
	/*
	 *  �����������ɾ��һ���Ѿ��Ǽǹ��Ĺ۲��߶���
	 * */
	public void detach(Observer observer)
	{
		observersVector.removeElement(observer);
	}
	/*
	 *  �����������֪ͨ���еǼǹ��Ĺ۲��߶���
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
