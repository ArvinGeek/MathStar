package com.adc.DesignPatterns;

public abstract class Expression 
{
	public abstract boolean interpret(Context ctx);
	public abstract boolean equals(Object o);
	public abstract int hashCode();
	public abstract String toString();
}
