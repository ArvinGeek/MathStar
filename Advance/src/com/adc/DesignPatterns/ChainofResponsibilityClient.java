package com.adc.DesignPatterns;

public class ChainofResponsibilityClient
{
	static private Handler handler1,handler2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		handler1= new ConcreteHandler();
		handler2 = new ConcreteHandler();
		handler1.setSuccessor(handler2);
		handler1.handlerRequest();

	}

}
