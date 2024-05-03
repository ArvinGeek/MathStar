package com.adc.DesignPatterns;

public class VistitorClient 
{
	private static ObjectStructure aObjects;
	private static Visitor visitor;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aObjects = new ObjectStructure();
		aObjects.add(new NodeA());
		aObjects.add(new NodeB());
		visitor = new VisitorA();
		aObjects.action(visitor);
	}

}
