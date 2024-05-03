package com.adc.DesignPatterns;

public abstract class Handler 
{
	protected Handler successor;
	public abstract void handlerRequest();
	public void setSuccessor(Handler successor)
	{
		this.successor = successor;
	}
	public Handler getSuccessor()
	{
		return successor;
	}

}
