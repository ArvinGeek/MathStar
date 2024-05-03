package com.adc.DesignPatterns;

public class MementoClient 
{
	private static Originator o = new Originator();
	private static Caretaker c = new Caretaker(o);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//改变状态
		o.setState("State 0");
		//建立一个检查点
		c.createMemento();
		//c.saveMemento(o.createMemento());
		o.setState("State 1");
		c.createMemento();
		o.setState("State 2");
		c.createMemento();
		o.setState("State 3");
		c.createMemento();
		o.setState("State 4");
		c.createMemento();
		o.printStates();
		System.out.println("Restoring to 2");
		c.restoreMemento(2);		
		o.printStates();
		System.out.println("Restoring to 0");
		c.restoreMemento(0);
		System.out.println("Restoring to 3");
		c.restoreMemento(3);		
		o.printStates();

	}

}
