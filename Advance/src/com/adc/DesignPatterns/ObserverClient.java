package com.adc.DesignPatterns;

public class ObserverClient 
{
	private static ConcreteSubject subject;
	private static Observer observer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subject = new ConcreteSubject();
		observer =new ConcreteObserver();
    	subject.attach(observer);
    	//subject.attach(observer);
    	subject.changer("new state");
	}

}
