package com.adc.DesignPatterns;

public interface Iterator 
{
	void first();
	void next();
	boolean isDone();
	Object currentItem();
}
