package com.adc.DesignPatterns;

public class ConcreteHandler extends Handler {

	@Override
	public void handlerRequest() {
		// TODO Auto-generated method stub
		if (getSuccessor()!=null)
		{
			System.out.println("The request is passed to "+getSuccessor());
			getSuccessor().handlerRequest();
		}
		else
		{
			System.out.println("The request is handler here.");
		}
	}

}
