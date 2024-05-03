package com.adc.DesignPatterns;

abstract class Equipment 
{
	public abstract void accept(VisitorC vis);
	public abstract double price();
}
